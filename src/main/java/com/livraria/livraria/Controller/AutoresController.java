package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Autores;
import com.livraria.livraria.Services.AutoresServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AutoresController {

    AutoresServices autoresServices;

    public AutoresController(AutoresServices autoresServices) {
        this.autoresServices = autoresServices;
    }

    @PostMapping("/cadastrarAutores")
    public void cadastrarAutores (@Valid @RequestBody Autores autores) {
        autoresServices.cadastrarAutores(autores);
    }
    @GetMapping("/listarTodosAutores")
    public List<Autores> listarAutores() {
        return autoresServices.listarTodosAutores();
    }

    @GetMapping("/buscarPorId")
    public Optional<Autores> buscarPorId(Long id) {
        return autoresServices.buscarPorId(id);
    }
    /*@GetMapping("/buscarPorNome")
    public Optional<Autores> buscarPorNome(String nome) {
        return autoresServices.buscarPorNome(nome);
    }
    @PutMapping("editarAutor/{id}")
    public Autores editarAutores(@PathVariable Long id) {
        return autoresServices.updateAutor(id);
    }

    @DeleteMapping("/deletarAutor/{id}")
    public void deletar(@PathVariable Long id) {
        autoresServices.deletarAutor(id);
    }

    @PutMapping("/inativarAutores/{id}")
    public ResponseEntity<Void> inativarAutores(@PathVariable Long id) {
        autoresServices.inativarAutores(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/ativarAutores/{id}")
    public ResponseEntity<Void> ativarAutores(@PathVariable Long id) {
        autoresServices.ativarAutores(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }*/
}
