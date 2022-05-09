package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TemporadasService {

    private List<Temporada> seasons = new ArrayList<>();

    public String addSeason(Temporada temporada){

        seasons.add(temporada);
        return "season added successfully";
    
    }

    public List<Temporada> getSeasons(){
        
        return seasons;
    }
    
}
