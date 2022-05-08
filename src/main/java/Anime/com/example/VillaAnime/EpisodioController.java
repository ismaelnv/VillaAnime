package Anime.com.example.VillaAnime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpisodioController {
    
    @Autowired
    private EpisodioService episodes;

    @PostMapping("/agregar/episodio")
    public String addEpisode(@RequestBody Episodio episodio){

       return episodes.addEpisodes(episodio);

    }


    
}
