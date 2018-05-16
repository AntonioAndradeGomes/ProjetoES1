
package Testes;

import controller.ControleBusca;
import junit.framework.Assert;
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
        Vendedor antonio = controle.buscaVendedorCpf("12345678900");
                           //valor esperado, valor atual
        Assert.assertEquals(69, antonio.getNumero());
    }
   
}
