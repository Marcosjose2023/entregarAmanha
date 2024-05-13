package com.livraria.livraria.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class LivrosDTO {
    private Long id;
    private String titulo;
    private Long idautor;
    private Double preco;
    private boolean destaque;
    private String sumario;
    private List<String> categorias;
    private Long ideditora;
}
