package com.zup.gleidston.vacinador.model;

import org.hibernate.validator.constraints.UniqueElements;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Table
@Entity
public class pes  extends AbstractEntity{
    // anotaçoes de mnsagem exibida no caso de error
    /*
    o nome nao pode ser vazio por favor insira um nome
    o nome precisa ter pelo menos  3 letras
    o E-mail digitado nao é um E-mail valido
    o E-mail nao pode ser nulo ou em branco


     */


    @Column(name = "nome",nullable = false)
    @NotEmpty
    @Size(min = 3 ,message = "o nome precisa ter pelo menos  3 letras")
    private  String nome ;

    @Email
    @NotEmpty
    @Column(name = "email",nullable = false, unique = true)
    private String email;
    @NotEmpty
    @Column(name = "cpf",nullable = false, unique = true)
    @CPF
    private String cpf;

    private String  datnasc ;

    private boolean estaVacinada;

    @OneToMany
    private List<Vacina> vacinas ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatnasc() {
        return datnasc;
    }

    public void setDatnasc(String datnasc) {
        this.datnasc = datnasc;
    }
}
