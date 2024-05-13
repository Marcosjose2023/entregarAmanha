package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Autores;
import com.livraria.livraria.Entity.Clientes;
import com.livraria.livraria.Entity.Contas;
import com.livraria.livraria.Services.ClientesServices;
import com.livraria.livraria.Services.ContasServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasController {

    ContasServices contasServices;

    public ContasController(ContasServices contasServices) {
        this.contasServices = contasServices;
    }

    @PostMapping("/cadastrarConta")
    public void cadastrarContas (@Valid @RequestBody Contas contas) {
        contasServices.cadastrarContas(contas);
    }
    @DeleteMapping("/deletarConta/{id}")
    public void deletarContas (@PathVariable Long id) {
        contasServices.deletarContas(id);
    }
    @PutMapping("/editarContas")
    public Contas editarContas (@RequestBody Contas contas) {
        return contasServices.editarContas(contas);
    }
    @GetMapping("/listarContas")
    public List<Contas> listarContas() {
        return contasServices.listarContas();
    }
    @GetMapping("/buscarContaPorId")
    public Optional<Contas> buscarPorid(Long id) {
        return contasServices.buscarContas(id);
    }
}
