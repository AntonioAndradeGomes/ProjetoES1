package Testes;

import controller.ControleBusca;
import model.bean.Produto;
import model.bean.Vendedor;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
== testa se dois objetos são identicos. Ou seja, se ocupam o mesmo local na memória.
Equals testa conteúdo. 
*/

public class TesteFuncionalidade {
    
    @Test
    public void test1(){
        ControleBusca controle= new ControleBusca();
        
        Vendedor Fernando = controle.buscaVendedorCpf("123456789");
        Vendedor Francisco = controle.buscaVendedorCpf("127461723");
        Vendedor Junior = controle.buscaVendedorCpf("172462234");
        Vendedor Gilberto = controle.buscaVendedorCpf("2738273498");
        Vendedor Carlos = controle.buscaVendedorCpf("2837823473");
        
                           //valor esperado, valor atual
        assertEquals(2, Fernando.getNumero());
        assertEquals(76, Francisco.getNumero());
        assertEquals(97, Junior.getNumero());
        assertEquals(65, Gilberto.getNumero());
        assertEquals(56, Carlos.getNumero());
    }
    
    @Test
    public void test2(){
    ControleBusca controle= new ControleBusca();
    
    Produto teste1 = controle.buscaProdutocodigo("avl1");
    Produto teste2 = controle.buscaProdutocodigo("bte5");
    Produto teste3 = controle.buscaProdutocodigo("cam");
    Produto teste4 = controle.buscaProdutocodigo("dc2");
    Produto teste5 = controle.buscaProdutocodigo("de21");
    Produto teste6 = controle.buscaProdutocodigo("dfeq12");

    assertEquals("impressora", teste1.getNome());
    assertEquals("Celular", teste2.getNome());
    assertEquals("camera", teste3.getNome());
    assertEquals("Computador", teste4.getNome());
    assertEquals("Teclado", teste5.getNome());
    assertEquals("notebook", teste6.getNome());

    }
}
