package models;

import java.util.ArrayList;

public class Usuario {
	private String id;
	private String nome;
	private char sexo;
	private Data dataNascimento;
	private String senha;
	private String telefone;
	private String email;
        private ArrayList<Agenda> minhasAgendas;

    public Usuario(String id, String nome, char sexo, Data dataNascimento, String senha, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
    }
        
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
