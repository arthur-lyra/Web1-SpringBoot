package br.edu.ifpb.acadon_spring.controller;

import br.edu.ifpb.acadon_spring.model.Cliente;
import br.edu.ifpb.acadon_spring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(value = "*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarClientes() {
        return this.clienteService.getClientes();
    }

    @GetMapping("/{id}")
    public Cliente getClientePorId(@PathVariable("id") Long idcliente) {
        return this.clienteService.getClientePorId(idcliente);
    }

    @PostMapping
    public Cliente inserirCliente(@RequestBody Cliente cliente){
        return this.clienteService.inserirOuAtualizar(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizarCliente(@RequestBody Cliente cliente){
        return this.clienteService.inserirOuAtualizar(cliente);
    }

    @DeleteMapping("/{id}")
    public void apagarUsuario(@PathVariable("id") Long id) {
        this.clienteService.apagar(id);
    }
}

