package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Autores;
import com.livraria.livraria.Entity.Clientes;
import com.livraria.livraria.Repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServices {
    @Autowired
    private ClientesRepository clientesRepository;

    public ClientesServices(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public void cadastrarClientes(Clientes clientes) {
        clientesRepository.save(clientes);
    }

    public Optional<Clientes> buscarPeloIdClientes(long id) {
        return clientesRepository.findById(id);
    }

    public void deletarCliente(Long id) {
        clientesRepository.deleteAllById(id);
    }

    public Clientes editarClientes(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    public List<Clientes> listarClientes() {
        List<Clientes> Cls = clientesRepository.findAll();
        return Cls;
    }

    public Clientes atualizarClientes(Long id, Clientes clientes) {
        var cliente = clientesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.BAD_REQUEST,
                        "Cliente não encontrado"
                ));
        cliente.setNome(cliente.getNome());
        cliente.setAtivo(cliente.isAtivo());
        clientesRepository.save(clientes);
        return clientes;
    }
}