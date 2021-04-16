package com.example.demo.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "USUARIOS")
public class User {
    @Id
    @GeneratedValue
    private long codigo;
    private String nome;
    private LocalDate datanascimento;
    @Column(columnDefinition = "text")
    private String foto;

    public User() {
    }

    public User(String nome, LocalDate datanascimento, String foto) {
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public long getId() {
        return codigo;
    }
}
