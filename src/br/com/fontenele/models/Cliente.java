package br.com.fontenele.models;

public class Cliente {

    //Atributos
    private String nome;
    private String endereco;
    private long cpf;

    //Construtor
    public Cliente(String nome, String endereco, long cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public long getCpf() {
        return cpf;
    }

}
