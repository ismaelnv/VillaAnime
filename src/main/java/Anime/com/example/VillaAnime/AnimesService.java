package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnimesService {

    private List<Anime> animes = new ArrayList<>();

    public String addAnimes(Anime anime){

        animes.add(anime);
        return "successfully added";

    }

    public List<Anime> getAnimes(){

        return animes;
    }
    
}
