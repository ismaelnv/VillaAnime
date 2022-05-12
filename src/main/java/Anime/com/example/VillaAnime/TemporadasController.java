package Anime.com.example.VillaAnime;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TemporadasController {
  
    @Autowired
    private TemporadasService seasonsService;

    @Autowired
    private EpisodiosService episodesService;

    @PostMapping("/temporadas")
    public String addSeason(@RequestBody Temporada temporada){
       return seasonsService.addSeason(temporada);
    }

    @GetMapping("/temporadas")
    public List<Temporada> getSeason(){
        return seasonsService.getSeasons();
    }

    @GetMapping("/temporadas/{id}/episodios")
    public String getSeasonEpisodes(@PathVariable("id") Integer id){
        Temporada temporada = seasonsService.getSeason(id);
        List<Episodio> episodes = episodesService.getEpisodesBySeasons(id);
        String result = "la temporda es :" +temporada.getName() + "\n";
        result += "total de episodios :" + episodes.size() + "\n";
        for (Episodio episodio :episodes ) {
            result += "Episodio :" + episodio.getName() + "\n";
        }
        return result;
    }

    @PutMapping("/temporadas/{id}")
    public String updateSeason(@PathVariable("id") Integer id,@RequestBody Temporada temporada){
        return seasonsService.updateSeason(id, temporada);
    }




    
}
