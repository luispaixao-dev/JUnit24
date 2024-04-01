package carrinho;

import produto.*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class CarrinhoTest {

    
    static Carrinho c1;
    private Produto p1;
    private Produto p2;
    

    @DisplayName("Testar pegar o Valor Total do Carrinho Vazio")
    @Test
    public void testValorTotal() {
        Carrinho c1 = new Carrinho();
        double valorTotal = c1.getValorTotal();
        assertTrue( valorTotal ==  0.0);
    }

    @DisplayName("Testar Adcionar item ao Carrinho")
    @Test
    public void testAddItemCarrinho() {
        p1 = new Produto("Camisa", 50);
        p2 = new Produto("Calça", 80);
        Carrinho c1 = new Carrinho();
        c1.addItem(p1);
        c1.addItem(p2);
        int  qtdItens = c1.getQtdeItems();
        assertTrue("A quantidade de itens no carrinho está correta.",qtdItens==2 );
    }

    @DisplayName("Testar o limpar carrinho")
    @Test
    public void testGetQtdItems() {
        p1 = new Produto("Camisa", 50);
        p2 = new Produto("Calça", 80);
        Carrinho c1 = new Carrinho();
        c1.esvazia();
        int items = c1.getQtdeItems();
        assertTrue( items==0);
       
    }
    @Test
    public void testValorTotalCarrinho() {
        p1 = new Produto("Camisa", 50);
        p2 = new Produto("Calça", 30);
        Carrinho c1 = new Carrinho();
        c1.addItem(p1);
        c1.addItem(p2);
        double  valorTotal = c1.getValorTotal();
        Assertions.assertEquals(valorTotal, 80.0);
    }


    

}
