package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Contas;
import com.livraria.livraria.Entity.Editoras;
import com.livraria.livraria.Services.EditoresServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class EditoraController {

     EditoresServices editoresServices;

    public EditoraController(EditoresServices editoresServices) {
        this.editoresServices = editoresServices;
    }

    @PostMapping("/cadastrarEditora")
    public void cadastrarEditora(@Valid @RequestBody Editoras editoras) {
        editoresServices.cadastrarEditoras(editoras);
    }
    @DeleteMapping("/DeletarEditora/{id}")
    public void deletarEditoras(@PathVariable Long id) {
        editoresServices.deletarEditora(id);
    }
    @PutMapping("/editarContas")
    public Editoras editarEditora (@RequestBody Editoras editoras) {
        return editoresServices.editar(editoras);
    }

    @GetMapping("/listarContas")
    public List<Editoras> listarEditoras() {
        return editoresServices.listarTodosEditoras();
    }
    @GetMapping("/buscarPeloNome")
    public Optional<Editoras> buscarPeloNome(String nome) {
        return editoresServices.buscarPorEditora(nome);
    }
}
