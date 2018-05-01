-- -----------------------------------------------------
-- Schema infotech
-- -----------------------------------------------------
CREATE SCHEMA `infotech` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Table `infotech`.`Produto`
-- -----------------------------------------------------
CREATE TABLE `infotech`.`Produto` (
  `codigo` VARCHAR(45) NOT NULL,
  `nome` VARCHAR(45) NULL,
  `quantidade` INT NULL,
  `tempo_garantia` INT NULL,
  `descricao` VARCHAR(255) NULL,
  `preco` VARCHAR(45) NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `infotech`.`Vendedor`
-- -----------------------------------------------------
CREATE TABLE `infotech`.`Vendedor` (
  `cpf` VARCHAR(11) NOT NULL,
  `rg` VARCHAR(15) NULL,
  `nome` VARCHAR(45) NULL,
  `email` VARCHAR(100) NULL,
  `cidade` VARCHAR(100) NULL,
  `bairro` VARCHAR(100) NULL,
  `rua` VARCHAR(255) NULL,
  `numero` INT NULL,
  `complemento` VARCHAR(255) NULL,
  `telefone1` VARCHAR(13) NULL,
  `telefone2` VARCHAR(45) NULL,
  `tipo` VARCHAR(20) NULL,
  `senha` VARCHAR(45) NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `infotech`.`Compra`
-- -----------------------------------------------------
CREATE TABLE `infotech`.`Compra` (
  `Codigo_compra` BIGINT NOT NULL AUTO_INCREMENT,
  `data` DATE NULL,
  `valor` DOUBLE NULL,
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
  `rg` VARCHAR(15) NULL,
  `nome` VARCHAR(45) NULL,
  `email` VARCHAR(100) NULL,
  `cidade` VARCHAR(100) NULL,
  `bairro` VARCHAR(100) NULL,
  `rua` VARCHAR(255) NULL,
  `numero` INT NULL,
  `complemento` VARCHAR(255) NULL,
  `telefone1` VARCHAR(13) NULL,
  `telefone2` VARCHAR(45) NULL,
  PRIMARY KEY (`cpf`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC))
ENGINE = InnoDB;


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
