/* Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco deverá ter o seguinte nome db_pizzaria_legal, */
CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

/* Crie uma tabela tb_categoria e determine 3 atributos relevantes. */
CREATE TABLE tb_categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    categoria VARCHAR(45) NOT NULL,
    descricao VARCHAR(300)
);

/* Crie uma tabela tb_pizza e determine 5 atributos relevantes */
CREATE TABLE tb_pizza (
	id_pizza INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    preco FLOAT,
    sabor VARCHAR(45) NOT NULL,
    tamanho VARCHAR(45) NOT NULL,
    borda_recheada VARCHAR(3) NOT NULL,
    massa VARCHAR(45) NOT NULL,
    descricao VARCHAR(300),
    fk_categoria INT,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_categoria)
);

/* Popule esta tabela Categoria com até 5 dados */
INSERT INTO tb_categoria (categoria, descricao) 
VALUES
('doce', 'Pizza do tipo doce'),
('salgada', 'Pizza do tipo salgada');

/* Popule esta tabela pizza com até 8 dados */
INSERT INTO tb_pizza (preco, sabor, tamanho, borda_recheada, massa, descricao, fk_categoria) 
VALUES
('29.00', 'Calabresa', 'Brotinho', 'Sim', 'Tradicional', 'Mussarela, calabresa e cebola, oregano.', 2),
('55.00', 'Frango com Requeijão', 'Média', 'Não', 'Finissima', 'Frango desfiado, cebola, oregano e requeijão.', 2),
('40.00', 'Bauru', 'Grande', 'Sim', 'Fina', 'Mussarela, presunto, requeijão, oregano e tomate.', 2),
('60.00', 'Morango com chocolate', 'Giga', 'Sim', 'Pan', 'Creme de chocolate especial com fatias de morangos.', 1),
('70.00', 'Brigadeiro', 'Média', 'Sim', 'Finissima', 'Creme especial de chocolate e chocolate granulado.', 1),
('65.00', 'Prestigio', 'Grande', 'Não', 'Tradicional', 'Creme de chocolate especial com cobertura de coco ralado.', 1),
('55.00', 'Margherita', 'Grande', 'Sim', 'Tradicional', 'Mussarela, tomate, oregano e manjericão.', 2),
('58.00', 'Romeu e Julieta', 'Grande', 'Não', 'Fina', 'Goiabada cremosa com catupiry ou mussarela.', 1);

/* Faça um select que retorne os Produtos com o valor maior do que 45 reais */
SELECT * FROM tb_pizza WHERE preco > 45;

/* Faça um select trazendo os Produtos com valor entre 29 e 60 reais */
SELECT * FROM tb_pizza
WHERE preco BETWEEN 29 AND 60;

/* Faça um select  utilizando LIKE buscando os Produtos com a letra C */
SELECT * FROM tb_pizza
WHERE sabor LIKE 'c%';

/* Faça um um select com Inner join entre  tabela categoria e pizza */
SELECT tb_pizza.sabor, tb_pizza.preco, tb_categoria.categoria
FROM tb_pizza
INNER JOIN tb_categoria ON tb_pizza.fk_categoria = tb_categoria.id_categoria;

/* Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce) */
SELECT * FROM tb_pizza
WHERE fk_categoria = 2;