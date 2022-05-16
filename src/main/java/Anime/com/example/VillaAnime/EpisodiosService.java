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

    public List<Episodio> getEpisodesBySeasons(Integer idSeason){
        List<Episodio> episo = new ArrayList<>();
        for (Episodio episodio :episodes) {
            if (episodio.getIdSeason() == idSeason) {
                episo.add(episodio); 
            }
        }
        return episo;
    }

    public Episodio getEpisode(Integer id){
        for (Episodio episodio : episodes) {
            if(episodio.getId() == id){
                return episodio;
            }
        }
        return null;
    }

    public String updateEpisodes(Integer id,Episodio episodio){
        for (int i = 0; i < episodes.size(); i++) {
            if(episodes.get(i).getId() == id){
                episodes.set(i, episodio);
            } 
        }
        return "Episode updated successfully";
    }

    public String deleteEpisodes(Integer id){
        for (int i = 0; i < episodes.size(); i++) {
            if(episodes.get(i).getId() == id){
                episodes.remove(i);
            }  
        }
        return "the episode was deleted correctly";
    }

    public Episodio getEpisodeById(Integer id){
        for (Episodio episodio: episodes) {
            if(episodio.getId() == id){
                return episodio;
            }
        }
        return null;
    }

    public String addToWatchedEpisodes(Integer id){
        for(Episodio episodio : episodes) {
            if(episodio.getId() == id){
                episodio.setSeen("visto");
            }
        }
        return "Added to the list of videos seen";
    }

    public List<Episodio> getEpisodesViewed(){
        List<Episodio> episodesWatched = new ArrayList<>();
        for (Episodio episodio : episodes) {
            if(episodio.getSeen() == "visto"){
                episodesWatched.add(episodio);
            }
        }
        return episodesWatched;
    }












    
}
