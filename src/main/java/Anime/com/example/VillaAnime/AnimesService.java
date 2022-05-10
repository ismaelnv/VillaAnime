package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnimesService {

    private List<Anime> animes = new ArrayList<>();

    public String addAnimes(Anime anime) {

        animes.add(anime);
        return "successfully added";

    }

    public List<Anime> getAnimes() {

        return animes;
    }

    public Anime getAnime(Integer id) {

        for (Anime anime : animes) {
            if (anime.getId() == id) {
                return anime;
            }
        }
        return null;
    }

    public String updateAnime(Integer id, Anime anime) {

        for (int i = 0; i < animes.size(); i++) {

            if (animes.get(i).getId() == id) {

                animes.set(i, anime);

            }

        }

        return "Anime updated successfully";

    }

}
