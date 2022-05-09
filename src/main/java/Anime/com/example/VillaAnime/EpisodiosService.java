package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EpisodiosService {

    private List<Episodio> episodes = new ArrayList<>();

    public String addEpisodes(Episodio episodio){

        episodes.add(episodio);
        return "episode added successfully";

    }

    public List<Episodio> getEpisodes(){

        return episodes;

    }






    
}
