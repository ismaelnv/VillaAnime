package Anime.com.example.VillaAnime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Anime {
    
    @JsonProperty("id")
    private Integer id;//id
    
    @JsonProperty("name")
    private String name;//Nombre

    @JsonProperty("favorites")
    private String favorites;//Favoritos;
    
    public Anime (Integer id,String name,String favorites){

        this.id =  id;
        this.name = name;
        this.favorites  = favorites;

    }

    public Integer getId(){

        return id;
    }

    public String getName(){

        return name;
    }

    public String getFavorites(){
        
        return favorites;
    }

    public void setId(Integer id){

        this.id = id;
    }

    public void setName(String name){

        this.name =  name;

    }

    public void setFavorites(String favorites){

        this.favorites =  favorites;
    }


    
}


