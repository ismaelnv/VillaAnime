package Anime.com.example.VillaAnime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Episodio {

    @JsonProperty("id")
    private Integer id;//id 

    @JsonProperty("chapter")
    private String chapter;//Capitulo

    @JsonProperty("name")
    private String name;//Nombre

    @JsonProperty("seen")
    private String seen;//Visto

    @JsonProperty("views")
    private Integer views;//Vistas

    @JsonProperty("id_season")
    private Integer idSeason;//id_temporada
    
    public Episodio (Integer id,String chapter,String name,String seen,Integer views,Integer idSeason){
        this.id = id;
        this.chapter = chapter;
        this.name = name;
        this.seen = seen;
        this.views = views;
        this.idSeason = idSeason;
    }

    public Integer getId(){
        return this.id;
    }

    public String getChapter(){
        return this.chapter;
    }

    public String getName(){
        return this.name;
    }

    public String getSeen(){
        return this.seen;
    }

    public Integer getViews(){
        return this.views;
    }

    public Integer getIdSeason(){
        return this.idSeason;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setChapter(String chapter){
        this.chapter = chapter;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSeen(String seen){
        this.seen = seen;
    }

    public void setViews(Integer views){
        this.views = views;
    }

    public void setIdSeason(Integer idSeason){
        this.idSeason = idSeason;
    }


    
}
