package Anime.com.example.VillaAnime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/www/villaAnime")
public class AnimesController {
    
    @Autowired
    private AnimesService animes;

    @PostMapping("/agregar/anime")
    public String addAnime(@RequestBody Anime anime){

        return animes.addAnimes(anime);

    }

    @GetMapping("/animes")
    public List<Anime> getAnimes(){

        return animes.getAnimes();
    }

    

    



    
}
