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

    public List<Pelicula> getFilms(){
        return films;
    }

    public String toUpdateFilms(Integer id,Pelicula pelicula){
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getId() == id){
                films.set(i, pelicula);
            }
        }
        return "The movie was updated correctly";
    }

    public String deleteFilms(Integer id){
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getId() == id){
                films.remove(i);
            }
        }
        return "Successfully removed the movie";
    }

    
    
}
