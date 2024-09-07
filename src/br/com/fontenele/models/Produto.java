package br.com.fontenele.models;

import br.com.fontenele.enuns.Categoria;
import br.com.fontenele.enuns.Nacionalidade;

public class Produto {

    //Atributos
    private String nome;
    private double valorComImpostos;
    private double valorSemImpostos;
    private Categoria categoria;
    private Nacionalidade nacionalidade;
    private double imposto;

    //Construtor
    public Produto(String nome, double valorSemImpostos, Categoria categoria, Nacionalidade nacionalidade) {
        this.nome = nome;
        this.valorSemImpostos = valorSemImpostos;
        this.categoria = categoria;
        this.nacionalidade = nacionalidade;
        calcularImposto();
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public double getValorComImpostos() {
        return valorComImpostos;
    }
    public double getValorSemImpostos() {
        return valorSemImpostos;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }
    public double getImposto() {
        return imposto;
    }

    //Metodo para calcular valores
    public void calcularImposto(){
        this.imposto = this.valorSemImpostos * this.nacionalidade.IMPOSTO_IMPORTACAO;
        this.valorComImpostos = this.valorSemImpostos + this.imposto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valorComImpostos=" + valorComImpostos +
                ", valorSemImpostos=" + valorSemImpostos +
                ", categoria=" + categoria +
                ", nacionalidade=" + nacionalidade +
                ", imposto=" + imposto +
                '}';
    }

}
