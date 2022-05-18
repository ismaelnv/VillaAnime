package Anime.com.example.VillaAnime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pelicula {
    
    @JsonProperty("id")
    private Integer id;//id

    @JsonProperty("name")
    private String name;//Nombre

    @JsonProperty("seen")
    private String seen;//Visto

    @JsonProperty("views")
    private Integer views;//Vistas

    public Pelicula(Integer id,String name,String seen,Integer views){
        this.id = id;
        this.name = name;
        this.seen = seen;
        this.views = views;
    }

    public Integer getId(){
        return this.id;
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

    public void setId(Integer id){
        this.id = id;
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
}
