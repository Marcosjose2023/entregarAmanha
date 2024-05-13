package com.livraria.livraria.Mapper;

import com.livraria.livraria.Entity.Autores;
import com.livraria.livraria.dto.AutoresDTO;

public class AutoresMapper {

    public static AutoresDTO map(Autores autor){
        return AutoresDTO
                .builder()
                .id(autor.getId())
                .nome(autor.getNome())
                .ativo(autor.isAtivo())
                .build();
    }
}

