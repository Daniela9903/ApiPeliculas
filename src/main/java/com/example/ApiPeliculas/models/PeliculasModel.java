package com.example.ApiPeliculas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="info_peliculas")
public class PeliculasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private Long id_peli;
    private String nombre_pelicula;
    private String anio_peli;
    private String genero;
    private String cal;
    private String sinopsis;
    


    public Long getid_peli() {
        return id_peli;
    }

    public String getnombre_pelicula() {
        return nombre_pelicula;
    }

    public String getanio_peli() {
        return anio_peli;
    }

    public String getgenero() {
        return genero;
    }

    public String getcal() {
        return cal;
    }

    public String getsinopsis() {
        return sinopsis;
    }
    

    public void setid_peli(Long id_peli) {
        this.id_peli = id_peli;
    }

    public void setnombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public void setanio_peli(String anio_peli) {
        this.anio_peli= anio_peli;
    }

    public void setgenero(String genero) {
        this.genero= genero;
    }

    public void setcal(String cal) {
        this.cal= cal;
    } 
    
    public void setsinopsis(String sinopsis) {
        this.sinopsis= sinopsis;
    } 
    
}
