-- -----------------------------------------------------
-- Schema infotech
-- -----------------------------------------------------
CREATE SCHEMA `infotech` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Table `infotech`.`Produto`
-- -----------------------------------------------------
CREATE TABLE `infotech`.`Produto` (
  `codigo` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `quantidade` INT NOT NULL,
  `tempo_garantia` INT NULL,
  `descricao` VARCHAR(255) NULL,
  `preco` DOUBLE NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `infotech`.`Vendedor`
-- -----------------------------------------------------
CREATE TABLE `infotech`.`Vendedor` (
  `cpf` VARCHAR(11) NOT NULL,
  `rg` VARCHAR(15) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(100) NULL,
  `cidade` VARCHAR(100) NOT NULL,
  `bairro` VARCHAR(100) NOT NULL,
  `rua` VARCHAR(255) NOT NULL,
  `numero` INT NULL,
  `complemento` VARCHAR(255) NULL,
  `telefone1` VARCHAR(13) NULL,
  `telefone2` VARCHAR(45) NULL,
  `tipo` VARCHAR(20) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC))
ENGINE = InnoDB;

insert into infotech.vendedor(cpf, rg, nome, email, cidade, bairro, rua, numero, complemento, 
telefone1, telefone2, tipo, senha) values ('12345678900', '123456789', 'Antonio', '', 'Quebrangulo', 
'Centro', 'Paulo Jacinto', 231, '', '', '', 'gerente', 'admin');

update infotech.vendedor set complemento = 'em frente ao puteiro' where numero = 231;
select * from infotech.vendedor;
delete from infotech.vendedor where numero = 24;

-- -----------------------------------------------------
-- Table `infotech`.`Compra`
-- -----------------------------------------------------
create TABLE `infotech`.`Compra` (
  `Codigo_compra` BIGINT NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `valor` DOUBLE NOT NULL,
  `Vendedor_cpf` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`Codigo_compra`),
  INDEX `fk_Compra_Vendedor1_idx` (`Vendedor_cpf` ASC),
  CONSTRAINT `fk_Compra_Vendedor1`
    FOREIGN KEY (`Vendedor_cpf`)
    REFERENCES `infotech`.`Vendedor` (`cpf`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `infotech`.`Produto_tem_Compra`
-- -----------------------------------------------------
CREATE TABLE `infotech`.`Produto_tem_Compra` (
  `Produto_codigo` VARCHAR(45) NOT NULL,
  `Compra_Codigo_compra` BIGINT NOT NULL,
  PRIMARY KEY (`Produto_codigo`, `Compra_Codigo_compra`),
  INDEX `fk_Produto_has_Compra_Compra1_idx` (`Compra_Codigo_compra` ASC),
  INDEX `fk_Produto_has_Compra_Produto_idx` (`Produto_codigo` ASC),
  CONSTRAINT `fk_Produto_has_Compra_Produto`
    FOREIGN KEY (`Produto_codigo`)
    REFERENCES `infotech`.`Produto` (`codigo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Produto_has_Compra_Compra1`
    FOREIGN KEY (`Compra_Codigo_compra`)
    REFERENCES `infotech`.`Compra` (`Codigo_compra`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `infotech`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE `infotech`.`Cliente` (
  `cpf` VARCHAR(11) NOT NULL,
  `rg` VARCHAR(15) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(100) NULL,
  `cidade` VARCHAR(100) NOT NULL,
  `bairro` VARCHAR(100) NOT NULL,
  `rua` VARCHAR(255) NOT NULL,
  `numero` INT NULL,
  `complemento` VARCHAR(255) NULL,
  `telefone1` VARCHAR(13) NULL,
  `telefone2` VARCHAR(45) NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC))
ENGINE = InnoDB;

select * from infotech.Cliente;


-- -----------------------------------------------------
-- Table `infotech`.`Cliente_Realiza_Compra`
-- -----------------------------------------------------
CREATE TABLE `infotech`.`Cliente_Realiza_Compra` (
  `Compra_Codigo_compra` BIGINT NOT NULL,
  `Cliente_cpf` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`Compra_Codigo_compra`, `Cliente_cpf`),
  INDEX `fk_Compra_has_Cliente_Cliente1_idx` (`Cliente_cpf` ASC),
  INDEX `fk_Compra_has_Cliente_Compra1_idx` (`Compra_Codigo_compra` ASC),
  CONSTRAINT `fk_Compra_has_Cliente_Compra1`
    FOREIGN KEY (`Compra_Codigo_compra`)
    REFERENCES `infotech`.`Compra` (`Codigo_compra`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Compra_has_Cliente_Cliente1`
    FOREIGN KEY (`Cliente_cpf`)
    REFERENCES `infotech`.`Cliente` (`cpf`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;

insert into infotech.cliente (cpf, rg, nome, email, cidade, bairro, rua, numero, complemento, 
telefone1, telefone2)  values('23456789101', '1324546776', 'Marisvaldo', 'marisvaldo@gmail.com', 'Rolandia', 'Centro', 'rua das boquinhas', 120,
'virando a rua 16', '996669120', null);

insert into infotech.cliente (cpf, rg, nome, email, cidade, bairro, rua, numero, complemento, 
telefone1, telefone2)  values('23456789111', '1324578776', 'Godolfredo', null, 'Rolandia', 'Centro', 'rua das boquinhas', 121,
'virando a rua 16', '996669121', null);

select * from infotech.cliente;

select * from infotech.produto;

insert into infotech.produto (codigo, nome, quantidade, tempo_garantia, descricao, preco) values ('xxxtmto', 'moto z play', 
9, 24, 'celular', 1899.99);

select * from infotech.compra;

insert into infotech.compra (data, valor, Vendedor_cpf)

values ('2016-11-27', 1899.99, '12345678900');

SELECT * FROM `infotech`.`Compra` where Vendedor_cpf = '12345678900';

delete from `infotech`.`Compra` where data = '0000-00-00';

insert into infotech.produto_tem_compra (produto_codigo, Compra_Codigo_compra)
values ('xxxtmto', 2);

insert into infotech.cliente_realiza_compra (Compra_Codigo_compra, cliente_cpf) values (2,'23456789101' );

-- exibir o nome do cliente e seu cpf e produtos comprados e seus vendedores cpf e nome
