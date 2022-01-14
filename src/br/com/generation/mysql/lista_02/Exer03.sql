/* Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco deverá ter o seguinte nome db_farmacia_do_bem */
CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

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
('Medicamentos', 'Os medicamentos são substâncias ou preparações que se utilizam como remédio, elaborados em farmácias ou indústrias farmacêuticas e atendendo especificações técnicas e legais.'),
('Beleza', 'Os melhores produtos para cuidar da aparência.'),
('Dermocosméticos', 'Os dermocosméticos são produtos destinados aos cuidados com a pele.'),
('Higiene pessoal', 'A higiene pessoal diz respeito a manter o seu corpo limpo e saudável.'),
('Infantil', 'Os melhores produtos de cuidados para as crianças.');

/* Popule esta tabela com até 8 dados */
INSERT INTO tb_produto (nome, descricao, preco, url_imagem, fk_categoria) 
VALUES 
('Vitamina C', 'Vitamina c 45mg Moov 40 Comprimidos', 5.99, 'https://cdn.ultrafarma.com.br/static/produtos/815049/large-637254292806176479-815049.jpg', 1),
('Máscara de Cílios', 'Máscara de Cílios Curvatura e Volume Luk 5ml', 5.99, 'https://cdn.ultrafarma.com.br/static/produtos/819106/large-637662751348749585-819106.jpg', 2),
('Sabonete Líquido', 'Darrow Actine Sabonete Líquido Facial para Pele Acneica 240ml', 48.38, 'https://cdn.ultrafarma.com.br/static/produtos/805558/large-637316556196911227-805558_5.jpg', 3),
('Sabonete', 'Sabonete Nivea Lavanda e Óleos 85g', 3.00, 'https://cdn.ultrafarma.com.br/static/produtos/808505/large-637586705362486207-808505.jpg', 4),
('Copos Bico Silicone', 'Kit 2 Copos Bico Silicone Rosa 180ml', 39.92, 'https://cdn.ultrafarma.com.br/static/produtos/819937/large-637738843710797181-819937.png', 5),
('Protetor Facial', 'Pó Claro Ganhe Kit 50% Protetor Facial Sunless', 60.00, 'https://cdn.ultrafarma.com.br/static/produtos/817210/large-637643867784734348-817210.png', 2),
('Leite Ninho', 'Leite Ninho Fases 1+ Prebio 800g', 38.00, 'https://cdn.ultrafarma.com.br/static/produtos/796056/large-637729516693304583-796056_5.png', 5),
('Dorflex', 'Analgésico - Dorflex 36 Comprimidos', 15.99, 'https://cdn.ultrafarma.com.br/static/produtos/807587/large-637099574264381592-807587_2.png', 1),
('Bálsamo', 'Avène Physiolift Noite - Bálsamo Noturn Anti-idade e Antienvelhecimento 30ml', 220.05, 'https://cdn.ultrafarma.com.br/static/produtos/808141/large-808141.jpg', 3);

/* Faça um select que retorne os Produtos com o valor maior do que 50 reais */
SELECT * FROM tb_produto WHERE preco > 50;

/* Faça um select trazendo  os Produtos com valor entre 3 e 60 reais */
SELECT * FROM tb_produto
WHERE preco BETWEEN 3 AND 60;

/* Faça um select  utilizando LIKE buscando os Produtos com a letra B */
SELECT * FROM tb_produto
WHERE nome LIKE 'b%';

/* Faça um um select com Inner join entre tabela categoria e produto */
SELECT tb_produto.nome, tb_categoria.categoria
FROM tb_produto
INNER JOIN tb_categoria ON tb_produto.fk_categoria = tb_categoria.id_categoria;

/* Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos). */
SELECT * FROM tb_produto
WHERE fk_categoria = 3;