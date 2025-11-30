package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest { // Equivalente a CensoTest

    @Test
    void deveContarProdutosDisponiveisEstoque() {
        Estoque estoque = new Estoque(
                new Produto("TV", true),
                new Produto("Celular", true),
                new Produto("Geladeira", false),
                new Produto("Fogao", true)
        );
        assertEquals(3, Inventario.contarProdutosDisponiveis(estoque));
    }

    @Test
    void deveContarTotalProdutosEstoque() {
        Estoque estoque = new Estoque(
                new Produto("TV", true),
                new Produto("Celular", true),
                new Produto("Geladeira", false),
                new Produto("Fogao", true)
        );
        assertEquals(4, Inventario.contarTotalProdutos(estoque));
    }

}