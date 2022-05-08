package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TemporadaService {

    private List<Temporada> temporadas = new ArrayList<>();

    public String addSeason(Temporada temporada){

        temporadas.add(temporada);
        return "season added successfully";
    
    }
    
}
