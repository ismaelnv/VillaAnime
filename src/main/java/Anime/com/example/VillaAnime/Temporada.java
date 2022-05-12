package Anime.com.example.VillaAnime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temporada {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id_anime")
    private Integer idAnime;

    public Temporada(Integer id, String name, Integer idAnime) {
        this.id = id;
        this.name = name;
        this.idAnime = idAnime;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getIdAnime() {
        return this.idAnime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  setIdAnime(Integer idAnime){
        this.idAnime = idAnime;
    }

  

}
