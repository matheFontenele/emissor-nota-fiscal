import br.com.fontenele.models.Cliente;
import br.com.fontenele.models.Compra;
import br.com.fontenele.enuns.Pagamento;
import br.com.fontenele.enuns.Categoria;
import br.com.fontenele.enuns.Nacionalidade;
import br.com.fontenele.models.Produto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto1", 25.00, Categoria.ELETRONICO, Nacionalidade.INTERNACIONAL);
        Produto p2 = new Produto("Produto2", 30.00, Categoria.OUTROS, Nacionalidade.NACIONAL);
        Produto p3 = new Produto("Produto3", 30.00, Categoria.OUTROS, Nacionalidade.INTERNACIONAL);
        Produto p4 = new Produto("Produto4", 30.00, Categoria.OUTROS, Nacionalidade.INTERNACIONAL);

        Cliente c1 = new Cliente("Cliente1", "Rua tal", 063657736);

        Compra compra1 = new Compra(c1, Pagamento.PIX);
        compra1.adicionarProduto(p1);
        compra1.adicionarProduto(p2);
        compra1.adicionarProduto(p3);
        compra1.adicionarProduto(p4);

        compra1.exibirComprovante();

    }
}