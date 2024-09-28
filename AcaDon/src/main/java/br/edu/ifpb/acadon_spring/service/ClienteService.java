package br.edu.ifpb.acadon_spring.service;

import br.edu.ifpb.acadon_spring.repositories.ClienteRepository;
import br.edu.ifpb.acadon_spring.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository ClienteRepository;

    public List<Cliente> getClientes() {
        return this.ClienteRepository.findAll();
    }

    public Cliente getClientePorId(Long idCliente) {
        return this.ClienteRepository.findById(idCliente).orElse(null);
    }

    @Transactional(rollbackFor = Exception.class)
    public Cliente inserirOuAtualizar(Cliente cliente) {
        if (cliente.getIdade() < 14) {
            throw new RuntimeException("Menor de idade não permitido");
        }
        Cliente ClienteInserido = this.ClienteRepository.save(cliente);
        return ClienteInserido;
    }

    public void apagar(Long id) {
        this.ClienteRepository.deleteById(id);
    }
}

