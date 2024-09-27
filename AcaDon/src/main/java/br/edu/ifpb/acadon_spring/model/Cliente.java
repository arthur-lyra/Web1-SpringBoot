package br.edu.ifpb.acadon_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String nome;
private String cpf;
private Integer idade;

private String sexo;

public Long getId() {
    return id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public Integer getIdade() {
    return idade;
}

public void setIdade(Integer idade) {
    this.idade = idade;
}

public String getSexo(){
    return sexo;
}
public void setSexo(String sexo){
    this.sexo = sexo;
}

}
