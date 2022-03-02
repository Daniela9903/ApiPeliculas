package com.example.ApiPeliculas.controllers;

import java.util.ArrayList;
import java.util.Optional;



import com.example.ApiPeliculas.services.PeliculasService;
import com.example.ApiPeliculas.models.PeliculasModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peliculas") 
@CrossOrigin(origins = {"http://localhost:8100","http://localhost:4200"})
public class PeliculasController {
    @Autowired
    PeliculasService peliculasService;
    
//GET
@GetMapping()
public ArrayList<PeliculasModel> obtenerPeliculas(){
    return peliculasService.obtenerPeliculas();
}



//POST
@PostMapping()
public PeliculasModel guardarPeliculas(@RequestBody PeliculasModel peliculas){
    return this.peliculasService.guardarPeliculas(peliculas);
}

//BUSCAR POR ID
@GetMapping(path = "/{id_peli}")
public Optional<PeliculasModel> obtenerPorId(@PathVariable("id_peli")Long id_peli){
    return this.peliculasService.obtenerPorId(id_peli);
} 



}
