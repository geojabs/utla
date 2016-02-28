package com.example.georgebentes.utla.model;

/**
 * Created by George Bentes on 28/02/2016.
 */
public class Comentarios {

    private String id;
    private String texto;
    private String likes;
    private String deslikes;
    private Usuarios usuario;
    private Postagens postagem;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDeslikes() {
        return deslikes;
    }

    public void setDeslikes(String deslikes) {
        this.deslikes = deslikes;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Postagens getPostagem() {
        return postagem;
    }

    public void setPostagem(Postagens postagem) {
        this.postagem = postagem;
    }
}
