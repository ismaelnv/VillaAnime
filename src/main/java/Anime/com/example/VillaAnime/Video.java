package Anime.com.example.VillaAnime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Video {

    @JsonProperty("id")
    private Integer id;//id
    
    @JsonProperty("idiom")
    private String idiom;//Idioma
    
    @JsonProperty("quality")
    private String quality;//Calidad

    @JsonProperty("id_episode")
    private Integer idEpisode;//id_episodio

    public Video(Integer id,String idiom,String quality,Integer idEpisode){
        this.id = id;
        this.idiom = idiom;
        this.quality = quality;
        this.idEpisode = idEpisode;
    }

    public Integer getId(){
        return this.id;
    }
    
    public String getIdiom(){
        return this.idiom;
    }

    public String getQuality(){
        return this.quality;
    }

    public Integer getIdEpisode(){
        return this.idEpisode;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setIdiom(String idiom){
        this.idiom = idiom;
    }

    public void setQuality(String quality){
        this.quality =  quality;
    }

    public void setIdEpisode(Integer idEpisode){
        this.idEpisode = idEpisode;
    }
}