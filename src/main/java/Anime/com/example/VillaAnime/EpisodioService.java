package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EpisodioService {

    private List<Episodio> episodios = new ArrayList<>();

    public String addEpisodes(Episodio episodio){

        episodios.add(episodio);
        return "episode added successfully";

    }

    




    
}
