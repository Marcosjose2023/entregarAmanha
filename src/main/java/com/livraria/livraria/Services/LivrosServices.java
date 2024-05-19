package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Autores;
import com.livraria.livraria.Entity.Categorias;
import com.livraria.livraria.Entity.Editoras;
import com.livraria.livraria.Entity.Livros;
import com.livraria.livraria.Repository.AutoresRepository;
import com.livraria.livraria.Repository.CategoriasRepository;
import com.livraria.livraria.Repository.EditorasRepository;
import com.livraria.livraria.Repository.LivrosRepository;
import com.livraria.livraria.dto.LivrosDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LivrosServices {

    LivrosRepository livrosRepository;
    AutoresRepository autoresRepository;
    EditorasRepository editorasRepository;
    CategoriasRepository categoriasRepository;

    public void cadastrarLivros(LivrosDto livrosDTO) {
        Autores autores = autoresRepository.findById(livrosDTO.getIdautor())
                .orElseThrow(() -> new IllegalArgumentException("Autor não encontrado com o ID: " + livrosDTO.getIdautor()));

        Editoras editoras = editorasRepository.findById(livrosDTO.getIdeditora())
                .orElseThrow(() -> new IllegalArgumentException("Editora não encontrada com o ID: " + livrosDTO.getIdeditora()));

        Categorias categorias = categoriasRepository.findById(livrosDTO.getIdcategorias())
                .orElseThrow(() -> new IllegalArgumentException("Categoria não encontrada com ID:" + livrosDTO.getIdeditora()));

        Livros livros = new Livros();
        livros.setAutores(autores);
        livros.setEditoras(editoras);
        livros.setCategorias(categorias);
        livros.setTitulo(livrosDTO.getTitulo());
        livros.setPreco(livrosDTO.getPreco());
        livros.setEstoque(livrosDTO.getEstoque());
        livros.setSumario(livrosDTO.getSumario());
        livrosRepository.save(livros);
    }

    public List<Livros> listarTodosLivros() {
        return livrosRepository.findAll();
    }

    public Optional<Livros> buscarPorId(long id) {
        return livrosRepository.findById(id);
    }

    public Livros editarLivros(Livros livros) {
        return livrosRepository.save(livros);
    }

    public Optional<Livros> buscarPorTitulo(String titulo) {
        return livrosRepository.findByTitulo(titulo);
    }

    public Optional<Livros> buscarPorCategoria(Categorias categorias) {
        return livrosRepository.findByCategorias(categorias);
    }
//mexer dps
//    public List<Livros> destaque() {
//            return livrosRepository.findByDestaque();
//    }

    public Livros atualizarLivros(Livros livros) {
        return livrosRepository.save(livros);
    }

   /* public List<Livros> destacarLivrosPorAno(int ano) {
        return livrosRepository.findAllByAno(ano);*/
}