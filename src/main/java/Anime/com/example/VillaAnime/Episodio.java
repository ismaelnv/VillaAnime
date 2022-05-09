package Anime.com.example.VillaAnime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Episodio {

    @JsonProperty("id")
    private Integer id;//id 

    @JsonProperty("capitulo")
    private String chapter;//Capitulo

    @JsonProperty("name")
    private String name;//Nombre

    public Episodio (Integer id,String chapter,String name){

        this.id = id;
        this.chapter = chapter;
        this.name = name;

    }

    public Integer getId(){

        return id;
    }

    public String getChapter(){

        return chapter;
    }

    public String getName(){

        return name;
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


    
}
