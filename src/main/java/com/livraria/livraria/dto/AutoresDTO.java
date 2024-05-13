package com.livraria.livraria.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class AutoresDTO {

    private Long id;
    private String nome;
    private List<LivrosDTO> livros;
    private boolean ativo;

}