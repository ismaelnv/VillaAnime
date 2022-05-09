package Anime.com.example.VillaAnime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpisodiosController {
    
    @Autowired
    private EpisodiosService episodes;

    @PostMapping("/agregar/episodio")
    public String addEpisode(@RequestBody Episodio episodio){

       return episodes.addEpisodes(episodio);

    }

    @GetMapping("/episodios")
    public List <Episodio> getEpisodes(){

        return episodes.getEpisodes();
    }

    @PutMapping("/actualizar/episodio/{id}")
    public String updateEpisodes(@PathVariable("id") Integer id,@RequestBody Episodio episodio){

        return episodes.updateEpisodes(id, episodio);

    }



    
}
