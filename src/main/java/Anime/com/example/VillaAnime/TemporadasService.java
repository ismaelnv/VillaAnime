package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TemporadasService {

    private List<Temporada> seasons = new ArrayList<>();

    public String addSeason(Temporada temporada) {
        seasons.add(temporada);
        return "season added successfully";
    }

    public List<Temporada> getSeasons() {
        return seasons;
    }

    public List<Temporada> getSeasonsByAnime(Integer idAnime) {
        List<Temporada> temps = new ArrayList<>();
        for (Temporada season : seasons) {
            if (season.getIdAnime() == idAnime) {
                temps.add(season);
            }
        }
        return temps;
    }

    public Temporada getSeason(Integer id){
        for (Temporada temporada : seasons) {
            if(temporada.getId() == id){
                return temporada;
            }
        }
        return null;
    }

    public String updateSeason(Integer id, Temporada temporada) {
        for (int i = 0; i < seasons.size(); i++) {
            if (seasons.get(i).getId() == id) {
                seasons.set(i, temporada);
            }
        }
        return "Season updated successfully";
    }

}
