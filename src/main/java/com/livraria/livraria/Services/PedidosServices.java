package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Pedidos;
import com.livraria.livraria.Repository.PedidosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidosServices {

    private PedidosRepository pedidosRepository;

    public List<Pedidos> listarTodosPedidos() {
        return pedidosRepository.findAll();
    }

    public Optional<Pedidos> buscarPedidoPorId(Long id) {
        return pedidosRepository.findById(id);
    }

    /*public Pedidos cadastrarPedidos(Pedidos pedidos) {
        pedidos.setAtivo(true);
        return pedidosRepository.save(pedidos);
    }*/

    public Pedidos atualizarPedidos(Pedidos pedido) {
        return pedidosRepository.save(pedido);
    }

    /*public void inativarPedidos(Long id) {
        Optional<Pedidos> pedido = pedidosRepository.findById(id);
        pedido.ifPresent(p -> {
            p.setAtivo(false);
            pedidosRepository.save(p);
        });
    }

    public void ativarPedidos(Long id) {
        Optional<Pedidos> pedido = pedidosRepository.findById(id);
        pedido.ifPresent(p -> {
            p.setAtivo(true);
            pedidosRepository.save(p);
        });
    }*/
}
