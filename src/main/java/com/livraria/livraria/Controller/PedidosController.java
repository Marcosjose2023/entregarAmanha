package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Pedidos;
import com.livraria.livraria.Services.PedidosServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PedidosController {

    PedidosServices pedidosServices;

    public PedidosController(PedidosServices pedidosServices) {
        this.pedidosServices = pedidosServices;
    }

    @GetMapping
    public List<Pedidos> listarTodosPedidos() {
        return pedidosServices.listarTodosPedidos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedidos> buscarPedidoPorId(@PathVariable Long id) {
        Optional<Pedidos> pedido = pedidosServices.buscarPedidoPorId(id);
        return pedido.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /*@PostMapping("/cadastrarPedidos")
    public ResponseEntity<Pedidos> cadastrarPedidos (@RequestBody Pedidos pedidos) {
        Pedidos novoPedido = pedidosServices.cadastrarPedidos(pedidos);
        return new ResponseEntity<>(novoPedido, HttpStatus.CREATED);
    }*/

    @PutMapping("atualizarPedidos/{id}")
    public ResponseEntity<Void> atualizarPedido(@PathVariable Long id, @RequestBody Pedidos pedidos) {
        pedidos.setId(id);
        pedidosServices.atualizarPedidos(pedidos);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /*@PutMapping("/inativar/{id}")
    public ResponseEntity<Void> inativarPedidos(@PathVariable Long id) {
        pedidosServices.inativarPedidos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/ativar/{id}")
    public ResponseEntity<Void> ativarPedidos(@PathVariable Long id) {
        pedidosServices.ativarPedidos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }*/

}
