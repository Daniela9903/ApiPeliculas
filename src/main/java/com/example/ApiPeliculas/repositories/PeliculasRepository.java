package com.example.ApiPeliculas.repositories;

import com.example.ApiPeliculas.models.PeliculasModel;

import org.springframework.data.repository.CrudRepository;

public interface PeliculasRepository extends CrudRepository<PeliculasModel , Long> {
   
}