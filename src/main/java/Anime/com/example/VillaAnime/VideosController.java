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
public class VideosController {
    
    @Autowired
    private VideosService videosService;

    @PostMapping("/videos")
    public String addVideos(@RequestBody Video video){
        return videosService.addVideos(video);
    }

    @GetMapping("/videos")
    public List<Video> getVideos(){
        return videosService.getVideos();
    }

    @PutMapping("/videos/{id}")
    public String updateVideos(@PathVariable("id") Integer id ,@RequestBody Video video){
        return videosService.updateVideos(id, video);
    }

    @DeleteMapping("/videos/{id}")
    public String deleteVideos(@PathVariable("id") Integer id){
        return videosService.deleteVideos(id);
    }

    
    
}
