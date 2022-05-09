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

    public String updateEpisodes(Integer id,Episodio episodio){

        for (int i = 0; i < episodes.size(); i++) {

            if(episodes.get(i).getId() == id){

                episodes.set(i, episodio);

            }
            
        }

        return "Episode updated successfully";

    }








    
}
