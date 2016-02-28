package com.example.georgebentes.utla.model;

import java.util.List;

/**
 * Created by George Bentes on 28/02/2016.
 */
public class Postagens {

    private String id;
    private String texto;
    private Integer likes;
    private Integer deslikes;
    private Usuarios usuario;
    private List<Comentarios> comentarios;

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

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDeslikes() {
        return deslikes;
    }

    public void setDeslikes(Integer deslikes) {
        this.deslikes = deslikes;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }
}