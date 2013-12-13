package models;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {

    private String usuario;
    private String nome;
    private char sexo;
    private Date dataNascimento;
    private char[] senha;
    private String email;
    private ArrayList<Evento> meusEventos;
    
    public Usuario(String usuario, String nome, char sexo, Date dataNascimento, char[] senha, String email) {
        this.usuario = usuario;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.email = email;
    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public ArrayList<Evento> getMeusEventos() {
        return meusEventos;
    }

    public void setMeusEventos(ArrayList<Evento> meusEventos) {
        this.meusEventos = meusEventos;
    }
    
    public void adicionarEvento(Evento novoEvento){
        this.meusEventos.add(novoEvento);
    }
    
    public void removerEvento(Evento umEvento){
        this.meusEventos.remove(umEvento);
    }
}
