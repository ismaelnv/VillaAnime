package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class peliculasService {

    private List<Pelicula> films = new ArrayList<>();

    public String addFilms(Pelicula pelicula){
        films.add(pelicula);
        return "The movie was added successfully";
    }

    
    
}
