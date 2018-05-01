
package controller;

public interface IControleCadastro {
    public void CadastrarCliente(String nome, String cpf, String rg, String telefone1, String telefone2, 
            String email, String ciade, String rua, String bairro, String complemento, long numero);
    public void CadastrarProduto();
}
