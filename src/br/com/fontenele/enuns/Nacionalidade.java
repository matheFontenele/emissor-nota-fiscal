package br.com.fontenele.enuns;

public enum Nacionalidade {
    //Atributos enum
    NACIONAL("BR", "Produto Nacional", 0.0),
    INTERNACIONAL("OUT", "Produto Internacional", 0.10);

    //Atributos
    public final String SIGLA;
    public final String RELATORIO;
    public final double IMPOSTO_IMPORTACAO;

    //Construtor
    Nacionalidade(String SIGLA, String RELATORIO, double impostoImportacao) {
        this.SIGLA = SIGLA;
        this.RELATORIO = RELATORIO;
        IMPOSTO_IMPORTACAO = impostoImportacao;
    }
}
