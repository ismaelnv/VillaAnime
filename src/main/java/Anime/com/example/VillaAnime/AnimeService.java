package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnimeService {

    private List<Anime> animes = new ArrayList<>();

    public String addAnime(Anime anime){

        animes.add(anime);
        return "successfully added";

    }
    
}
