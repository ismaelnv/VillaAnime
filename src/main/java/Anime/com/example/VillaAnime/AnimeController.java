package Anime.com.example.VillaAnime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/www/villaAnime")
public class AnimeController {
    
    @Autowired
    private AnimeService animes;

    @PostMapping("/agregar/anime")
    public String addAnime(@RequestBody Anime anime){

        return animes.addAnime(anime);

    }



    
}
