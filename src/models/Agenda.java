package models;

import java.util.ArrayList;

class Agenda {

    String nomeAgenda;
    String descricao;
    ArrayList<Evento> meusEventos;
    
    public Agenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }
}
