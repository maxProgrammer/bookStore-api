package com.maxprogrammer.apicdc.dtos;

import com.maxprogrammer.apicdc.models.Autor;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;

public class AutorDto {
    @NotBlank
    private String nome;

    @NotBlank
    @URL
    private String linkGithub;

    public AutorDto(String nome, String linkGithub) {
        this.nome = nome;
        this.linkGithub = linkGithub;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinkGithub() {
        return linkGithub;
    }

    public void setLinkGithub(String linkGithub) {
        this.linkGithub = linkGithub;
    }

    public Autor novoAutor() {
        return new Autor(nome, linkGithub);
    }
}
