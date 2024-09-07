package br.com.fontenele.enuns;

public enum Categoria {
    //Atributos enum
    ELETRONICO("Eletronicos"),
    SUPERMERCADO("SuperMercado"),
    OUTROS("Outros");

    //Atributos
    public final String NOME_CATEGORIA;

    //Construtor
    Categoria(String NOME_CATEGORIA) {
        this.NOME_CATEGORIA = NOME_CATEGORIA;
    }
}
