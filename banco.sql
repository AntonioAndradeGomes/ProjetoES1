-- -----------------------------------------------------
-- Schema infotech
-- -----------------------------------------------------
CREATE SCHEMA `infotech` DEFAULT CHARACTER SET latin1 ;
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

-- ------------------------------------------------------
-- Inserindo dados
-- ------------------------------------------------------

INSERT INTO `infotech`.`Cliente` VALUES ('0','0','Avulso',NULL,'Sem cidade','Sem Bairro','Sem rua',NULL,NULL,NULL,NULL),
('1235343','3453456','Gustavo','gustavo@hotmail.com','Maceio','centro','Fernandes',9,'Perto do colegio educar',NULL,NULL),
('123654','564478','Fernando','Fernando@gmail.com','Arapiraca','centro','Primavera',12,'perto do posto de saúde',NULL,NULL),
('23456789101','1324546776','Marisvaldo','marisvaldo@gmail.com','Rolandia','Centro','rua das boquinhas',120,'virando a rua 16','996669120',NULL),
('23456789111','1324578776','Godolfredo',NULL,'Rolandia','Centro','rua das boquinhas',121,'virando a rua 16','996669121',NULL),
('27346872','24342738','Stefany','stefany@gmail.com','Quebrangulo','centro','São jorge',1,NULL,NULL,NULL),
('4564345334','2343633545','Felipe','Ronaldo@gmail.com','Barcelona','Nobre','Stanford',32,'Proximo ao Estadio','98765434','96785432'),
('783429247','236582384','Vitoria','vitoria@gmail.com','Quebrangulo','centro','Napoleão',8,'perto do posto de gasolina JB','94637484',NULL),
('78646743','93574257','fernando','fernando@gmail.com','Batalha','Centro','Avenida paulista',12,NULL,'93456234',NULL),
('8472634','3528374','Gabriela','gabriela@gmail.com','Arapiraca','centro','São jorge',23,'',NULL,NULL),
('847537495','293475294','Afonso','afonso@gmail.com','Arapiraca','Centro','Santo espedito',6,'Perto da Praça',NULL,NULL);


INSERT INTO `infotech`.`Vendedor` VALUES ('123456789','987654321','Fernando','fernando@gmail.com','Arapiraca','centro','Vereador ruy barbosa',2,'Perto do posto JB','96273849','92574639','Vendedor','infotech1'),
('127461723','873458399','Francisco','francisco@gmail.com','Arapiraca','Centro','Tiradentes',76,'Perto a auto escola JBL','95684753',NULL,'Vendedor','trabalhar1'),
('172462234','243284723','Junior','junior@gmail.com','Arapiraca','centro','São paulo',97,'Perto da Fabrica são luiz',NULL,NULL,'Vendedor','semgrana1'),
('2738273498','4234283484','Gilberto','gilberto@outlook.com','Arapiraca','centro','Santo Antônio',65,NULL,NULL,NULL,'Gerente','carro1'),
('2837823473','4234823475','Carlos','carlos@gmail.com','Arapiraca','centro','Avenida Brasil',56,'Perto ao colegio 
aprender','98464784',NULL,'Vendedor','falido1'),('3636534','8327523','Eduardo','eduardo@hotmail.com','Arapiraca','centro','Sete de setembro',78,'Perto da livraria globo','98467385',NULL,'Vendedor','troll1'),
('394983745','374829023','Gilberto','gilberto@hotmail.com','Arapiraca','centro','Rua principal',8,NULL,NULL,NULL,'Vendedor','tech1'),
('82784278','83748234','Pedro','pedro@gmail.com','Arapiraca','centro','São Pedro',4,NULL,NULL,NULL,'Vendedor','grana1'),
('968327346','283748234','Roberio','roberio@hotmail.com','Arapiraca','centro','São José',54,'Perto das lojas 
guido','98365734',NULL,'Gerente','chefe1'),
('968738573','538459384','Juliano','juliano@gmail.com','Arapiraca','centro','Rua B',7,'Perto da pousada 
Luiz','91382745',NULL,'Gerente','admin1');


INSERT INTO `infotech`.`Produto` VALUES ('aa13','Mouse',10,2,'sem fio',21),
							('avl1','impressora',6,2,'Epson',1200),
							('bte5','Celular',6,2,'Asus',2000),
							('camolaggg','camisinha',9,0,'camisinha ola retardante tamanho grande',2.25),
							('dc2','Computador',12,2,'Gamer',1200.99),
							('de21','Teclado',9,1,'sem fio',120),
							('dfeq12','notebook',3,2,'MacBook pro',20000),
							('dfg32','Monitor',12,2,'LG',899.99),
							('js12','Kindle',15,3,'E-reader',230.99),
							('xxxffff','moto z2 force',9,24,'celular',1899.99),
							('xxxtmto','moto z play',9,24,'celular',1899.99);


INSERT INTO `infotech`.`Compra` VALUES (2,'2018-05-09',21,'123456789'),
							(3,'2018-05-09',1200,'123456789'),
							(4,'2018-05-09',2000,'123456789'),
							(5,'2018-05-10',1200.99,'127461723'),
							(6,'2018-05-10',120,'127461723'),
							(7,'2018-05-10',20000,'127461723'),
							(8,'2018-05-11',899.99,'172462234'),
							(9,'2018-05-11',230.99,'172462234'),
							(10,'2018-05-11',1899.99,'172462234'),
							(11,'2018-05-11',1899.99,'172462234');


INSERT INTO `infotech`.`Cliente_Realiza_Compra` VALUES (2,'1235343'),
											(3,'1235343'),
											(4,'1235343'),
											(5,'123654'),
											(6,'123654'),
											(7,'123654'),
											(8,'23456789101'),
											(9,'23456789101'),
											(10,'23456789101'),
											(11,'0');





INSERT INTO `infotech`.`Produto_tem_Compra` VALUES ('aa13',2),
										('avl1',3),
										('bte5',4),
										('dc2',5),
										('de21',6),
										('dfeq12',7),
										('dfg32',8),
										('js12',9),
										('xxxffff',10),
										('xxxtmto',11);




