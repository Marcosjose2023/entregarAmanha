package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Categorias;
import com.livraria.livraria.Entity.Livros;
import com.livraria.livraria.Repository.LivrosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivrosServices {


    private LivrosRepository livrosRepository;

    private Livros livros;

    public LivrosServices(LivrosRepository livrosRepository) {
        this.livrosRepository = livrosRepository;
    }
    /*public void cadastrarLivros(Livros livros) {
        livrosRepository.save(livros);
    }*/
    public void cadastrarLivros(LivrosDTO livrosDTO) {
        Optional<Autores> autores = autoresRepository.findById(livrosDTO.getIdautor());
        Optional<Editoras> editoras = editorasRepository.findById(livrosDTO.getIdeditora());
        Livros livros = new Livros();
        livros.setAutores(autores);
        livros.setEditoras(editoras);
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

    public List<Livros> destaque() {
        if (livros.isDestaques() == true) {
            return livrosRepository.findAll();
        }
        throw new RuntimeException("Nenhum livro encontrado");
    }

    public Livros atualizarLivros(Livros livros) {
        return livrosRepository.save(livros);
    }

   /* public List<Livros> destacarLivrosPorAno(int ano) {
        return livrosRepository.findAllByAno(ano);*/
}