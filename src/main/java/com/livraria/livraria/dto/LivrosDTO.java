package com.livraria.livraria.dto;

import lombok.Builder;

import java.util.List;

@Builder
public class LivrosDTO {
    private Long id;
    private String titulo;
    private String autor;
    private Double preco;
    private boolean destaque;
    private String sumario;
    private List<String> categorias;

    public LivrosDTO() {
    }

    public LivrosDTO(Long id, String titulo, String autor, Double preco, boolean destaque, String sumario, List<String> categorias) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.destaque = destaque;
        this.sumario = sumario;
        this.categorias = categorias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }

    public String getSumario() {
        return sumario;
    }

    public void setSumario(String sumario) {
        this.sumario = sumario;
    }

    public List<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<String> categorias) {
        this.categorias = categorias;
    }
}
