-- ----------------------------------
-- Comando principal para o sistema de busca
-- ----------------------------------

SELECT infotech.Cliente.nome as NomedoCliente, infotech.Cliente.cpf as CPFdoCliente, infotech.Produto.nome as ProdutoComprado, infotech.Produto.preco as PrecodoProduto,
infotech.Vendedor.cpf as CPFdovendedor, infotech.Vendedor.nome as NomedoVendedor
	FROM infotech.Cliente, infotech.Produto, infotech.Cliente_Realiza_Compra, infotech.Compra, infotech.Produto_tem_Compra, infotech.Vendedor
	where (Cliente.cpf = Cliente_Realiza_Compra.Cliente_cpf and Cliente_Realiza_Compra.Compra_Codigo_compra = Compra.Codigo_compra) and
    (Compra.Codigo_compra = Produto_tem_Compra.Compra_Codigo_compra and Produto.codigo = Produto_tem_Compra.Produto_codigo) and
    (Vendedor.cpf = Compra.Vendedor_cpf);


-- ----------------------------------
-- Listar produtos comprados por cpf
-------------------------------------

SELECT infotech.Cliente.cpf as CPFdoCliente, infotech.Cliente.nome as NomedoCliente, infotech.Produto.nome as ProdutoComprado, infotech.Produto.preco as PrecodoProduto, infotech.Compra.data as Datadacompra, infotech.Vendedor.nome as NomedoVendedor
	FROM infotech.Cliente, infotech.Produto, infotech.Cliente_Realiza_Compra, infotech.Compra, infotech.Produto_tem_Compra, infotech.Vendedor
	where (Cliente.cpf = Cliente_Realiza_Compra.Cliente_cpf and Cliente_Realiza_Compra.Compra_Codigo_compra = Compra.Codigo_compra) and
    (Compra.Codigo_compra = Produto_tem_Compra.Compra_Codigo_compra and Produto.codigo = Produto_tem_Compra.Produto_codigo) and
    (Vendedor.cpf = Compra.Vendedor_cpf) and (Cliente.cpf = '1235343'); -- Nessa ultima linha que inseri 1235343 é o cpf para checar as compras do cliente, então é só trocar para qual cliente deseja procurar
        


-- -----------------------------------
-- Comandos testes
-- -----------------------------------

select * from infotech.vendedor;

delete from infotech.vendedor where numero = 24;

select * from infotech.Cliente;

select * from infotech.cliente;

select * from infotech.produto;

select * from infotech.compra;

select * from produto;

SELECT * FROM `infotech`.`Compra` where Vendedor_cpf = '12345678900';

delete from `infotech`.`Compra` where data = '0000-00-00';

SELECT * FROM `infotech`.`Produto` where quantidade > 1;

select * from produto_tem_compra;
select infotech.compra.Codigo_compra, infotech.compra.data, infotech.compra.valor, infotech.compra.Vendedor_cpf
from infotech.compra,
infotech.produto_tem_compra, infotech.produto 
where infotech.compra.Codigo_compra = infotech.produto_tem_compra.Compra_Codigo_compra and 
infotech.produto.codigo = infotech.produto_tem_compra.Produto_codigo and
infotech.produto.codigo = 'xxxtmto';
 
select * from Vendedor where cpf = '12345678900';
 
Select * from `infotech`.`Produto` where `infotech`.`Produto`.`nome` =  'moto z play';

update `infotech`.`Produto` set `infotech`.`Produto`.`quantidade` = `infotech`.`Produto`.`quantidade` + 1 where `infotech`.`Produto`.`codigo` = 'xxxtmto';
select * from produto;


Select * from `infotech`.`Cliente`;

Select * from `infotech`.`Produto` where `infotech`.`Produto`.`codigo` = 'teste';

