
package Testes;

import controller.ControleBusca;
import junit.framework.Assert;
import model.bean.Produto;
import model.bean.Vendedor;
import org.junit.Test;

/*
== testa se dois objetos são idênticos. Ou seja, se ocupam o mesmo local na memória.
Equals testa conteúdo. 
*/

public class TesteFuncionalidade {
    
    @Test
    public void main(){
        ControleBusca controle= new ControleBusca();
        Vendedor Gustavo = controle.buscaVendedorCpf("1235343");
        Vendedor Fernando = controle.buscaVendedorCpf("123654");
        Vendedor Marinaldo = controle.buscaVendedorCpf("23456789101");
        Vendedor Godolfredo = controle.buscaVendedorCpf("23456789111");
        Vendedor Stefany = controle.buscaVendedorCpf("27346872");
        Vendedor Felipe = controle.buscaVendedorCpf("4564345334");
        
                           //valor esperado, valor atual
        Assert.assertEquals(9, Gustavo.getNumero());
        Assert.assertEquals(12, Fernando.getNumero());
        Assert.assertEquals(120, Marinaldo.getNumero());
        Assert.assertEquals(121, Godolfredo.getNumero());
        Assert.assertEquals(1, Stefany.getNumero());
        Assert.assertEquals(32, Felipe.getNumero());
        
        Produto teste1 = controle.buscaProdutocodigo("avl1");
        Produto teste2 = controle.buscaProdutocodigo("bte5");
        Produto teste3 = controle.buscaProdutocodigo("cam");
        Produto teste4 = controle.buscaProdutocodigo("dc2");
        Produto teste5 = controle.buscaProdutocodigo("de21");
        Produto teste6 = controle.buscaProdutocodigo("dfeq12");
        
        Assert.assertEquals("impressora", teste1.getNome());
        Assert.assertEquals("Celular", teste2.getNome());
        Assert.assertEquals("camera", teste3.getNome());
        Assert.assertEquals("Computador", teste4.getNome());
        Assert.assertEquals("Teclado", teste5.getNome());
        Assert.assertEquals("notebook", teste6.getNome());
        
    }
   
}
