package com.example.georgebentes.utla.model;

import java.util.List;

/**
 * Created by George Bentes on 28/02/2016.
 */
public class Usuarios {

    private String id;
    private String nome;
    private String senha;
    private Boolean ativo = true;
    private List<Postagens> postagens;
    private List<Comentarios> comentarios;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<Postagens> getPostagens() {
        return postagens;
    }

    public void setPostagens(List<Postagens> postagens) {
        this.postagens = postagens;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }
}
