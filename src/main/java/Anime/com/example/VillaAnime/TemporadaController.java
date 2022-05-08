package Anime.com.example.VillaAnime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemporadaController {
  
    @Autowired
    private TemporadaService temporadas;

    @PostMapping("/agregar/temporada")
    public String addSeason(@RequestBody Temporada temporada){

     return temporadas.addSeason(temporada);

    }




    
}
