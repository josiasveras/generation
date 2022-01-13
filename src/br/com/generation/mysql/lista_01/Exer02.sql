/* Crie um banco de dados para um ecommerce */
CREATE DATABASE db_ecommerce;
USE db_ecommerce;

/* Crie uma tabela produtos */
CREATE TABLE tb_produtos (
    id_produto INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    categoria VARCHAR(45) NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    preco DOUBLE NOT NULL,
    url_imagem VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_produto)
);

/* Popule esta tabela com até 8 dados */
INSERT INTO tb_produtos (nome, categoria, descricao, preco, url_imagem) 
VALUES ('Apple iPhone', 'Celulares e Smartphones', 'Apple iPhone 13 Pro Max 1Tb Dourado MLUC3LL/A', 18349.90, 'https://m.media-amazon.com/images/I/51CJowBd+4L._AC_SL1390_.jpg');

INSERT INTO tb_produtos (nome, categoria, descricao, preco, url_imagem) 
VALUES ('Notebook Dell', 'Computadores e Informática', 'Notebook Dell Inspiron i15-3501-A10P 15.6" HD 11ª Geração Intel Pentium Gold 4GB 128GB SSD W10 Preto', 2602.66, 'https://m.media-amazon.com/images/I/616PBNK19aL._AC_SL1000_.jpg');

INSERT INTO tb_produtos (nome, categoria, descricao, preco, url_imagem) 
VALUES ('Blu-ray Moana', 'DVD e Blu-ray', 'Moana Um Mar De Aventuras Blu-ray', 29.90, 'https://m.media-amazon.com/images/I/91imMPBAuUL._AC_SL1500_.jpg');

INSERT INTO tb_produtos (nome, categoria, descricao, preco, url_imagem) 
VALUES ('Geladeira Brastemp', 'Eletrodomésticos', 'Geladeira Brastemp Frost Free Inverse 443 litros cor Inox com Turbo Ice - BRE57AK 110V', 4341.99, 'https://m.media-amazon.com/images/I/41ZkbnOcvXL._AC_SL1000_.jpg');

INSERT INTO tb_produtos (nome, categoria, descricao, preco, url_imagem) 
VALUES ('Fone de Ouvido JBL', 'Audio e Som', 'Fone de Ouvido Bluetooth JBL Tune 510BT Pure Bass Preto - JBLT510BTBLK', 248.90, 'https://m.media-amazon.com/images/I/51owZ6PAwPL._AC_SL1100_.jpg');

INSERT INTO tb_produtos (nome, categoria, descricao, preco, url_imagem) 
VALUES ('Bola Penalty', 'Esportes e Aventura', 'Bola Penalty Society Lider Xxi', 71.85, 'https://m.media-amazon.com/images/I/61CbBf7fkUL._AC_SL1050_.jpg');

INSERT INTO tb_produtos (nome, categoria, descricao, preco, url_imagem) 
VALUES ('Nintendo Switch', 'Games', 'Console Nintendo Switch - Cinza', 2279.91, 'https://m.media-amazon.com/images/I/61Gz5KlfPcL._AC_SL1457_.jpg');

INSERT INTO tb_produtos (nome, categoria, descricao, preco, url_imagem) 
VALUES ('Banco Imobiliário', 'Brinquedos e Jogos', 'Jogo Banco Imobiliário, Estrela', 109.14, 'https://m.media-amazon.com/images/I/910QO41sGRL._AC_SL1500_.jpg');

/* Faça um select que retorne os produtos com o valor maior do que 500 */
SELECT * FROM tb_produtos WHERE preco > 500;

/* Faça um select que retorne os produtos com o valor menor do que 500. */
SELECT * FROM tb_produtos WHERE preco < 500;

/* Ao término atualize um dado desta tabela através de uma query de atualização. */
UPDATE tb_produtos
SET nome = 'Notebook Dell Inspiron'
WHERE id_produto = 2;