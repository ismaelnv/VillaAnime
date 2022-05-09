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
public class TemporadasController {
  
    @Autowired
    private TemporadasService season;

    @PostMapping("/agregar/temporada")
    public String addSeason(@RequestBody Temporada temporada){

     return season.addSeason(temporada);

    }

    @GetMapping("/temporadas")
    public List<Temporada> getSeason(){

        return season.getSeasons();
    }

    @PutMapping("/actualizar/temporada/{id}")
    public String updateSeason(@PathVariable("id") Integer id,@RequestBody Temporada temporada){

        return season.updateSeason(id, temporada);

    }




    
}
