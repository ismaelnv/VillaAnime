package Anime.com.example.VillaAnime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VideosService {

    private List<Video> videos = new ArrayList<>();

    public String addVideos(Video video){
        videos.add(video);
        return "Video added successfully";
    }

    public List<Video> getVideos(){
        return videos;
    }

    public List<Video> getVideoByEpisode(Integer idEpisode){
        List<Video> vide = new ArrayList<>();
        for (Video video : videos) {
            if(video.getIdEpisode() == idEpisode){
                vide.add(video);
            }
        }
        return vide;
    }

    public String updateVideos(Integer id , Video video){
        for (int i = 0; i < videos.size(); i++) {
            if(id == videos.get(i).getId()){
                videos.set(i, video);
            }
        }
        return "The video was updated correctly";
    }

    public String deleteVideos(Integer id){
        for (int i = 0; i < videos.size(); i++) {
            if(videos.get(i).getId() == id){
                videos.remove(i);
            }
        }
        return "the video was deleted successfully";
    }

    public Video getVideoById(Integer id){
        for (Video video : videos) {
            if(video.getId() == id){
                return video;
            }
        }
        return null;
    }




    

}
