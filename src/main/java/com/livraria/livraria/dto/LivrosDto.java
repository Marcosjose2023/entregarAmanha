package com.livraria.livraria.dto;


public class LivrosDto {
    private Long id;
    private String titulo;
    private Long idautor;
    private Double preco;
    private boolean destaque;
    private String sumario;
    private Long idcategorias;
    private Long ideditora;
    private Integer estoque;

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public LivrosDto() {
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

    public Long getIdautor() {
        return idautor;
    }

    public void setIdautor(Long idautor) {
        this.idautor = idautor;
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

    public Long getIdcategorias() {
        return idcategorias;
    }

    public void setIdcategorias(Long idcategorias) {
        this.idcategorias = idcategorias;
    }

    public Long getIdeditora() {
        return ideditora;
    }

    public void setIdeditora(Long ideditora) {
        this.ideditora = ideditora;
    }
}
