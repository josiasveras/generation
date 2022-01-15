/* Crie um banco de dados para um serviço de um açougue, o nome do banco deverá ter o nome db_cidade_das_carnes */
CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;

/* Crie uma tabela de categorias e determine 3 atributos relevantes da tb_categoria */
CREATE TABLE tb_categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    categoria VARCHAR(45) NOT NULL,
    descricao VARCHAR(300)
);

/* Crie uma tabela de Produtos e determine 5 atributos relevantes da tb_produto */ 
CREATE TABLE tb_produto (
    id_produto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45) NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    preco DOUBLE NOT NULL,
    url_imagem VARCHAR(100) NOT NULL,
    fk_categoria INT,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_categoria)
);

/* Popule esta tabela Categoria com até 5 dados */
INSERT INTO tb_categoria (categoria, descricao)
VALUES
('Suínos', 'É a denominação dada às diferentes espécies de mamíferos bunodontes, artiodáctilos, não ruminantes da subordem dos suiformes, a que pertence o porco-doméstico e outras espécies e gêneros.'),
('Bovinos', 'Os bovinos (latim científico: Bovinae) constituem uma subfamília de mamíferos artiodáctilos bovídeos, distribuídos por todos os continentes e com enorme importância econômica como fonte de leite e carne para o homem.'),
('Aves', 'Aves são uma classe de seres vivos vertebrados endotérmicos caracterizada pela presença de penas, um bico sem dentes, oviparidade de casca rígida, elevado metabolismo, um coração com quatro câmaras e um esqueleto pneumático resistente e leve.'),
('Peixes', 'São animais que possuem a pele coberta por escamas. Sua respiração acontece de maneira aeróbica, através dos brônquios. '),
('Carne processada', 'Carne processada é qualquer tipo de carne que tenha sido transformada por salga, cura, fermentação, defumação e outros processos para realçar sabor ou melhorar a preservação.');

/* Popule esta tabela Produto com até 8 dados */
INSERT INTO tb_produto (nome, descricao, preco, url_imagem, fk_categoria) 
VALUES 
('Bisteca', 'Bisteca Suína Congelado Sadia Peça 700g', 20.99, 'https://www.madrid.com.br/imagens/produtos/big/34584.jpg', 1),
('Filé Mignon', 'Bife de Filé Mignon Congelado SWIFT 900G', 89.96, 'https://static.paodeacucar.com/img/uploads/1/776/19421776.jpg', 2),
('Frango', 'Frango Congelado SADIA 3kg', 38.97, 'https://static.paodeacucar.com/img/uploads/1/52/607052.png', 3),
('Salmão', 'Pedaços de Salmão Congelados QUALITÁ 500g', 66.99, 'https://static.paodeacucar.com/img/uploads/1/502/634502.png', 4),
('Linguiça', 'Linguiça Toscana AURORA Bandeja 500g', 14.79, 'https://static.paodeacucar.com/img/uploads/1/77/473077.jpg', 5),
('Sardinha', 'Sardinha Espalmada SWIFT 500G', 10.96, 'https://static.paodeacucar.com/img/uploads/1/25/19425025.jpg', 4),
('Fraldinha', 'Fraldinha Bovina Resfriada Maturatta FRIBOI 1,2kg', 85.52, 'https://static.paodeacucar.com/img/uploads/1/743/518743.jpg', 2),
('Peru', 'Peru Temperado Congelado PERDIGÃO 4kg', 39.60, 'https://static.paodeacucar.com/img/uploads/1/832/542832.jpg', 3),
('Costela', 'Costela Suína SWIFT 800g', 23.17, 'https://static.paodeacucar.com/img/uploads/1/623/19341623.jpg', 1);

/* Faça um select que retorne os Produtos com o valor maior do que 50 reais */
SELECT * FROM tb_produto WHERE preco > 50;

/* Faça um select trazendo  os Produtos com valor entre 3 e 60 reais */
SELECT * FROM tb_produto
WHERE preco BETWEEN 3 AND 60;

/* Faça um select  utilizando LIKE buscando os Produtos com a letra C */
SELECT * FROM tb_produto
WHERE nome LIKE 'c%';

/* Faça um um select com Inner join entre tabela categoria e produto */
SELECT tb_produto.descricao, tb_categoria.categoria
FROM tb_produto
INNER JOIN tb_categoria ON tb_produto.fk_categoria = tb_categoria.id_categoria;

/* Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são aves ou legumes). */
SELECT * FROM tb_produto
WHERE fk_categoria = 2;