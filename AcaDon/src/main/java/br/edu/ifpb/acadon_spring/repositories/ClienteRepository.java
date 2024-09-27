package br.edu.ifpb.acadon_spring.repositories;

import br.edu.ifpb.acadon_spring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public List<Cliente> findByIdadeAndCpf(Integer idade, String cpf);

    @Query("SELECT u FROM Cliente u where u.idade>=20")
    public List<Cliente> getUsuariosIdosos();
}
