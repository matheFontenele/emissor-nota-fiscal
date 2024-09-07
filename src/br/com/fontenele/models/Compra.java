package br.com.fontenele.models;

import br.com.fontenele.enuns.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    //Atributos
    private String nomeCliente;
    private long cpfCliente;
    private Pagamento formaDePagamento;
    private List<Produto> produtos;
    private double totalLiquido;
    private double totalBruto;
    private double impostos;

    //Construtor
    public Compra(Cliente cliente, Pagamento pagamento) {
        this.nomeCliente = cliente.getNome();
        this.cpfCliente = cliente.getCpf();
        this.formaDePagamento = pagamento;
        this.produtos = new ArrayList<>();
    }

    //Getters and Setters
    public String getNomeCliente() {
        return nomeCliente;
    }
    public long getCpfCliente() {
        return cpfCliente;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public double getTotalLiquido() {
        return totalLiquido;
    }
    public double getTotalBruto() {
        return totalBruto;
    }
    public double getImpostos() {
        return impostos;
    }


    //Metodo para adicionar produtos a lista de compras
    public void adicionarProduto(Produto p){
        produtos.add(p);
        totalLiquido = totalLiquido + p.getValorSemImpostos();
        totalBruto = totalBruto + p.getValorComImpostos();
        impostos = impostos + p.getImposto();
    }

    @Override
    public String toString() {
        return "Compra{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", cpfCliente=" + cpfCliente +
                ", produtos=" + produtos +
                ", totalLiquido=" + totalLiquido +
                ", totalBruto=" + totalBruto +
                ", impostos=" + impostos +
                '}';
    }

    public void exibirComprovante(){
        System.out.println("----COMPROVANTE DE COMPRA-----\n");
        System.out.println("Cliente: "+this.getNomeCliente()+" CPF: "+this.getCpfCliente()+"\n");
        System.out.println("LISTA DE PRODUTOS");
        for(Produto p : produtos){
            System.out.println(p.getNome()+" - valor s/impostos: "+p.getValorSemImpostos()+" - imposto: "+p.getImposto()+" - total: "+p.getValorComImpostos());
        }
        System.out.println("\n");
        System.out.println("Total de impostos: "+this.impostos);
        System.out.println("Total sem impostos : "+this.getTotalLiquido());
        System.out.println("TOTAL DA COMPRA: "+this.getTotalBruto());
    }
}
