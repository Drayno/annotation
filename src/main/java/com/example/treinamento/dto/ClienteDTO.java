package com.example.treinamento.dto;
import com.example.treinamento.annotation.Atributo;
import com.example.treinamento.annotation.Classe;

public class ClienteDTO { 
private String nome; 
private String telefone; 

public ClienteDTO() {
}
public ClienteDTO( String nome, String telefone) {
this.nome = nome;
this.telefone = telefone;
}

public String getNome() { 
return nome;
}
public String getTelefone() { 
return telefone;
}

public void setNome(String nome) { 
this.nome = nome;
}
public void setTelefone(String telefone) { 
this.telefone = telefone;
}

 }