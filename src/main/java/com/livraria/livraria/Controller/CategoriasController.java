package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Categorias;
import com.livraria.livraria.Services.CategoriasServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriasController {

    CategoriasServices categoriasServices;

    public CategoriasController(CategoriasServices categoriasServices) {
        this.categoriasServices = categoriasServices;
    }

    @GetMapping("/listarCategorias")
    public List<Categorias> listarCategorias() {
            return categoriasServices.listarCategorias();
    }

    @PostMapping("/criarCategorias")
    public void criarCategorias(@RequestBody @Valid Categorias categorias){
        categoriasServices.criarCategorias(categorias);
    }

    @PutMapping("/ativar/{ativo}")
    public void alterarAtivacaoCategorias(@RequestBody @Valid boolean ativo){
        categoriasServices.ativar(ativo);
    }
}
