package Anime.com.example.VillaAnime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EpisodiosController {
    
  @Autowired
  private EpisodiosService episodesService;

  @Autowired
  private VideosService videosService;

  @PostMapping("/episodios")
  public String addEpisode(@RequestBody Episodio episodio){
    return episodesService.addEpisodes(episodio);
  }

  @GetMapping("/episodios")
  public List <Episodio> getEpisodes(){
    return episodesService.getEpisodes();
  }

  @GetMapping("/episodios/{id}/videos")
  public String getVideoByEpisode(@PathVariable("id") Integer id){
    Episodio episodio = episodesService.getEpisode(id);
    List<Video> videos = videosService.getVideoByEpisode(id);
    String result = "el episodio es :" + episodio.getName() + "\n";
    result += "total de videos :" + videos.size() + "\n";
    for (Video vide : videos) {
     result += "Video :" + vide.getIdiom() + "\n";
    }
    return result;
  }

  @PutMapping("/episodios/{id}")
  public String updateEpisodes(@PathVariable("id") Integer id,@RequestBody Episodio episodio){
    return episodesService.updateEpisodes(id, episodio);
  }

  @DeleteMapping("/episodios/{id}")
  public String deleteEpisodes(@PathVariable("id") Integer id){
    return episodesService.deleteEpisodes(id);
  }
  
  @GetMapping("/episodios/{id}")
  public Episodio getEpisodeById(@PathVariable("id") Integer id){
    return episodesService.getEpisodeById(id);
  }

  @PutMapping("/episodios/{id}/vistos")
  public String addToWatchedEpisodes(@PathVariable("id") Integer id){
    return  episodesService.addToWatchedEpisodes(id);
  }

  @GetMapping("/episodios/vistos")
  public List<Episodio> getEpisodesViewed(){
    return episodesService.getEpisodesViewed();
  }

  

    
}
