package controllers;

import models.Evento;
import java.util.ArrayList;


public class ControleEventos {

    private ArrayList<Evento> listaEventos;

    public ControleEventos() {
        this.listaEventos = new ArrayList<Evento>();
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void adicionar(Evento novoEvento) {
        listaEventos.add(novoEvento);
    }

    public void remover(Evento novoEvento) {
        listaEventos.remove(novoEvento);
    }

    public Evento pesquisar(String evento) {
        for (Evento e : listaEventos) {
            if (e.getNomeEvento().equalsIgnoreCase(evento)) {
                return e;
            }
        }
        return null;
    }
}