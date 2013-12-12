package controllers;

import models.Usuario;
import java.util.ArrayList;

public class ControleUsuarios {

    private ArrayList<Usuario> listaUsuarios;

    public ControleUsuarios() {
        this.listaUsuarios = new ArrayList<Usuario>();
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void adicionar(Usuario novoUsuario) {
        listaUsuarios.add(novoUsuario);
    }

    public void remover(Usuario novoUsuario) {
        listaUsuarios.remove(novoUsuario);
    }

    public Usuario pesquisar(String usuario) {
        for (Usuario u : listaUsuarios) {
            if (u.getUsuario().equalsIgnoreCase(usuario)) {
                return u;
            }
        }
        return null;
    }
}