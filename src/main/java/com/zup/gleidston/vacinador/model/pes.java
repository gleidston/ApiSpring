package com.zup.gleidston.vacinador.model;

import org.hibernate.validator.constraints.UniqueElements;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
@Table
@Entity
public class pes  extends AbstractEntity{


    @UniqueElements
    private  String nome ;
    @Email
    private String email;
    @CPF
    private String cpf;

    private String  datnasc ;

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
