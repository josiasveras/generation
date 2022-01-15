/* Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome
do banco deverá ter o seguinte nome db_construindo_a_nossa_vida */
CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

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
    url_imagem VARCHAR(200) NOT NULL,
    fk_categoria INT,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id_categoria)
);

/* Popule esta tabela Categoria com até 5 dados */
INSERT INTO tb_categoria (categoria, descricao)
VALUES
('Hidráulica', 'Refere-se ao sistema de abastecimento, distribuição e escoamento de água numa casa.'),
('Ferramentas', 'Qualquer instrumento que se usa para a realização de um trabalho.'),
('Madeiras', 'Parte lenhosa das árvores, constituída de fibras e vasos condutores da seiva bruta, e aproveitada em construção e trabalhos de carpintaria e marcenaria.'),
('Elétrica', 'Uma instalação elétrica é composta por materiais elétricos como fios, cabos e disjuntores, com características coordenadas entre si e essenciais para o funcionamento de um sistema elétrico.'),
('Decoração', 'Arte de decorar, de ornamentar, de embelezar, de tornar um ambiente mais agradável, belo; ornamentação.');

/* Popule esta tabela Produto com até 8 dados */
INSERT INTO tb_produto (nome, descricao, preco, url_imagem, fk_categoria) 
VALUES 
('Registro', 'Registro Gaveta Bruto 4 Docol Industrial Registro De Gaveta Industrial 4"', 959.90, 'https://cdn.leroymerlin.com.br/products/registro_gaveta_bruto_4_docol_industrial_registro_de_gaveta_i_1567509033_92c1_600x600.png', 1),
('Alicate', 'Mini Alicate Bico Meia Cana Longo 5" Dexter', 31.90, 'https://cdn.leroymerlin.com.br/products/mini_alicate_bico_longo_5_dexter_89827444_0002_600x600.jpg', 2),
('Caibro', 'Caibro Aparelhado Saligna 4,5cmx5cmx3m Madvei', 27.49, 'https://cdn.leroymerlin.com.br/products/caibro_eucalipto_nat_aparelhado_4,5cmx5cmx3m_madvei_89377750_a816_600x600.jpg', 3),
('Tomada', 'Módulo de Tomada de Energia 10A Branco Stella Steck', 5.09, 'https://cdn.leroymerlin.com.br/products/modulo_de_tomada_de_energia_10a_branco_stella_steck_89281381_0001_600x600.jpg', 4),
('Mandala', 'Mandala Decorativa Ambiente Sala Quarto 65x65 -38.108 G', 270.00, 'https://cdn.leroymerlin.com.br/products/mandala_decorativa_ambiente_sala_quarto__65x65__38_108_g_1566741723_165f_600x600.jpeg', 5),
('Escultura', 'Escultura De Murano São Marcos - Âmbar 23cm', 369.99, 'https://cdn.leroymerlin.com.br/products/escultura_de_murano_sao_marcos_ambar_23cm_1566988918_0493_600x600.png', 5);

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

/* Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria hidráulica) */
SELECT * FROM tb_produto
WHERE fk_categoria = 5;