package com.example.ApiPeliculas.services;

import java.util.ArrayList;
import java.util.Optional;


import com.example.ApiPeliculas.repositories.PeliculasRepository;
import com.example.ApiPeliculas.models.PeliculasModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PeliculasService {
    @Autowired
    PeliculasRepository peliculasRepository;
    public ArrayList<PeliculasModel> obtenerPeliculas(){
        return (ArrayList<PeliculasModel>)peliculasRepository.findAll();
    }

    public PeliculasModel guardarPeliculas(PeliculasModel peliculas){
        return peliculasRepository.save(peliculas);
    }

    public Optional<PeliculasModel>obtenerPorId(Long id_peli){
        return peliculasRepository.findById(id_peli);
    }
}
