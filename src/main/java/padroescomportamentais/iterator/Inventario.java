package padroescomportamentais.iterator;

import java.util.Iterator;

public class Inventario {
    public static Integer contarProdutosDisponiveis(Estoque estoque) {
        int quantidade = 0;
        for (Produto produto : estoque) {
            if (produto.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalProdutos(Estoque estoque) {
        int quantidade = 0;
        for (Iterator<Produto> it = estoque.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }

}