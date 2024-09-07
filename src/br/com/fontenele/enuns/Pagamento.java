package br.com.fontenele.enuns;

public enum Pagamento {

    //Atributos enum
    PIX(1, "Pix", 0.0),
    CARTAO_CREDITO(2, "Cartão de Credito", 0.1),
    CARTAO_DEBITO(3, "Cartão de Debito", 0.05),
    BOLETO(4, "Boleto Bancario",0.02);

    //Atributos
    public final int VALOR;
    public final String NOME;
    public final double IMPOSTO;

    //Construtor
    Pagamento(int valor, String nome, double imposto) {
        this.VALOR = valor;
        this.NOME = nome;
        this.IMPOSTO = imposto;
    }
}
