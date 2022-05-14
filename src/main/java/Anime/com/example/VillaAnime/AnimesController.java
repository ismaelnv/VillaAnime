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
public class AnimesController {

    @Autowired
    private AnimesService animesService;

    @Autowired
    private TemporadasService seasonService;

    @PostMapping("/animes")
    public String addAnime(@RequestBody Anime anime) {
        return animesService.addAnimes(anime);
    }

    @GetMapping("/animes")
    public List<Anime> getAnimes(){
        return animesService.getAnimes();
    }

    @GetMapping("/animes/{id}/temporadas")
    public String getAnimesSeason(@PathVariable("id") Integer id) {
        Anime anime = animesService.getAnime(id);
        List<Temporada> seasons = seasonService.getSeasonsByAnime(id);
        String result = "el anime es :" + anime.getName() + "\n";
        result += "total temporadas: " + seasons.size() + " \n";
        for (Temporada season : seasons) {
            result += "Temporada: " + season.getName() + "\n";
        }
        return result;
    }

    @PutMapping("/animes/{id}")
    public String updateAnime(@PathVariable("id") Integer id, @RequestBody Anime anime) {
        return animesService.updateAnime(id, anime);
    }

    @DeleteMapping("/animes/{id}")
    public String deleteAnime(@PathVariable("id") Integer id){
        return animesService.deleteAnime(id);
    }

    @PutMapping("/animes/{id}/favoritos")
    public String addToFavorites(@PathVariable("id") Integer id){
        return animesService.addToFavorites(id);
    }

    @GetMapping("/animes/favoritos")
    public List<Anime> getFavoriteAnimes(){
        return animesService.getFavoriteAnimes();
    }

    @GetMapping("/animes/{id}")
    public Anime getAnimeById(@PathVariable("id") Integer id){
        return animesService.getAnimeById(id);
    }

}
