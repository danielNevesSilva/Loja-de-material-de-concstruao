create database projetoevolucao;

use projetoevolucao;

create table Cliente (
id_cliente int primary key not null auto_increment,
cpf char(11) UNIQUE,
nome varchar(50),
telefone varchar(15),
email varchar(100),
dataNascimento date,
sexo char(1),
estadocivil varchar(30),
nomePais varchar(100),
nomeCidade varchar(100),
cep char(8),
logradouro varchar(100),
numero varchar(20),
complemento varchar(100)
);

desc cliente;

create table Produto(
id_produto int primary key not null auto_increment,
nome varchar(50),
valorUnitario float,
unidadeMedida varchar(10)
);

desc Produto;

create table Vendedor(
id_vendedor int primary key not null auto_increment,
codigoVendedor varchar(100),
nome varchar(50)
);

desc Vendedor;

create table Orcamento(
id_orcamento int primary key not null auto_increment,
fk_cliente int,
fk_produto int,
quantidade int,
valorParcial float,
FOREIGN KEY (fk_cliente) REFERENCES Cliente(id_cliente),
FOREIGN KEY (fk_produto) REFERENCES Produto(id_produto)
);

desc Orcamento;

create table Venda(
id_venda int primary key not null auto_increment,
numeroOrcameneto bigint not null,
fk_orcamento int,
fk_vendedor int,
valorTotal float,
dataVenda date,
FOREIGN KEY (fk_orcamento) REFERENCES Orcamento(id_orcamento),
FOREIGN KEY (fk_vendedor) REFERENCES Vendedor(id_vendedor)
);

desc Venda;

/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

# Venda Analitica

CREATE VIEW vw_vendas_analitica AS
SELECT v.dataVenda, ve.nome AS nomeVendedor, o.id_orcamento AS numeroOrcamento, p.nome AS nomeProduto, p.unidadeMedida, p.valorUnitario, o.quantidade  
FROM venda v
JOIN Vendedor AS ve ON ve.id_vendedor = v.fk_vendedor
JOIN Orcamento AS o ON o.id_orcamento = v.fk_orcamento
JOIN Produto AS p ON p.id_produto = o.fk_produto
WHERE v.dataVenda BETWEEN '2022-11-01' AND '2022-11-30';

# Venda Geral

CREATE VIEW vw_vendas_geral AS
SELECT v.dataVenda, ve.nome AS nomeVendedor, SUM(v.valorTotal) as somaVendas FROM Venda v
JOIN Vendedor AS ve ON ve.id_vendedor = v.fk_vendedor
WHERE v.dataVenda BETWEEN '2022-11-01' AND '2022-11-30'
GROUP BY v.dataVenda, nomeVendedor;

SELECT * FROM vw_vendas_geral;
SELECT * FROM vw_vendas_analitica;





