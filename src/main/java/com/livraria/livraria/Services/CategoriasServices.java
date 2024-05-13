package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Categorias;
import com.livraria.livraria.Repository.CategoriasRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CategoriasServices {

    CategoriasRepository categoriasRepository;

    public List<Categorias> listarCategorias() {
        List<Categorias> Cat = categoriasRepository.findAll();
        return Cat;
    }

    public void criarCategorias(Categorias categorias) {
        categoriasRepository.save(categorias);
    }

    public Categorias ativar(Long id, boolean ativo) {
        var categoria = categoriasRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.BAD_REQUEST,
                        "Categoria não encontrada"
                ));

        categoria.setAtivo(ativo);

        return categoriasRepository.save(categoria);

    }


}
