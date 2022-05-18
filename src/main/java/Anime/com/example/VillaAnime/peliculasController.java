package Anime.com.example.VillaAnime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class peliculasController {

    @Autowired
    private peliculasService peliculasService;

    @PostMapping("/peliculas")
    public String addFilms (@RequestBody Pelicula pelicula){
        return peliculasService.addFilms(pelicula);
    }

    @GetMapping("/peliculas")
    public List<Pelicula> getFilms(){
        return peliculasService.getFilms();
    }
     
    @PutMapping("/peliculas/{id}")
    public String toUpdateFilms(@PathVariable("id") Integer id,@RequestBody Pelicula pelicula){
        return peliculasService.toUpdateFilms(id, pelicula);
    }

    @DeleteMapping("/peliculas/{id}")
    public String deleteFilms(@PathVariable("id") Integer id){
        return peliculasService.deleteFilms(id);
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getFilmsById(@PathVariable("id") Integer id){
        return peliculasService.getFilmsById(id);
    }

    
}
