package Anime.com.example.VillaAnime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class video {

    @JsonProperty("id")
    private Integer id;//id
    
    @JsonProperty("idiom")
    private String idiom;//Idioma
    
    @JsonProperty("quality")
    private String quality;//Calidad
    
    @JsonProperty("seen")
    private String seen;//Visto
    
    @JsonProperty("views")
    private Integer views;//Vistas

    public video(Integer id,String idiom,String quality,String seen,Integer views){

        this.id = id;
        this.idiom = idiom;
        this.quality = quality;
        this.seen =  seen;
        this.views = views;
    }

    public Integer getId(){

        return id;
    }
    
    public String getIdiom(){

        return idiom;
    }

    public String getQuality(){

        return quality;
    }
    
    public String getSeen(){

        return seen;
    }

    public Integer getViews(){

        return views;
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

    public void setSeen(String seen){

        this.seen =  seen;

    }

    public void setViews(Integer views){

        this.views = views;

    }

}