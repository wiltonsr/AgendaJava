package models;

import java.util.ArrayList;

public class Usuario {

    private String usuario;
    private String nome;
    private char sexo;
    private Data dataNascimento;
    private char[] senha;
    private String email;
    private ArrayList<Agenda> minhasAgendas;

    public Usuario(String usuario, String nome, char sexo, Data dataNascimento, char[] senha, String email) {
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

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
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
}
