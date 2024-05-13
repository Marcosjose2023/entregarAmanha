package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Clientes;
import com.livraria.livraria.Entity.Editoras;
import com.livraria.livraria.Services.ClientesServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientesController {

    ClientesServices clientesServices;

    public ClientesController(ClientesServices clientesServices) {
        this.clientesServices = clientesServices;
    }

    @PostMapping("/cadastrarClientes")
    public void cadastrarClientes (@Valid @RequestBody Clientes clientes) {
        clientesServices.cadastrarClientes(clientes);
    }
    @DeleteMapping("/deletarCliente/{id}")
    public void deletarCliente(@PathVariable long id) {
        clientesServices.deletarCliente(id);
    }
    @PutMapping("/editar")
    public Clientes editarClientes (@RequestBody Clientes clientes) {
        return clientesServices.editarClientes(clientes);
    }
    @GetMapping("/listarClientes")
    public List<Clientes> listarClientes() {
        return clientesServices.listarClientes();
    }
    @GetMapping("/buscarClientesId/{id}")
    public Optional<Clientes> buscarPeloClientes(long id) {
        return clientesServices.buscarPeloIdClientes(id);
    }

}
