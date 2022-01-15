/* Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco
deverá ter o seguinte nome db_cursoDaMinhaVida */
CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

/* Crie uma tabela de categorias e determine 3 atributos relevantes da tb_categoria */
CREATE TABLE tb_categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    categoria VARCHAR(45) NOT NULL,
    descricao VARCHAR(300)
);

/* Crie uma tabela de Cursos e determine 5 atributos relevantes da tb_curso */ 
CREATE TABLE tb_curso (
    id_curso INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
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
('Desenvolvimento', 'Desenvolvimento de softwares é a atividade de criar programas de computação, executada por um desenvolvedor ou grupo de desenvolvedores.'),
('Negócios', 'Denomina-se negócio a toda atividade consistente na aquisição de renda em função da entrega de bens e serviços como contrapartida.'),
('Finanças e contabilidade', 'Enquanto a contabilidade se concentra nas informações sobre as transações e patrimônio da empresa, o financeiro controla o dinheiro que entra e sai do caixa no dia a dia e faz projeções para prever a situação futura.'),
('Produtividade no escritório', 'É a relação da capacidade de produção com o tempo.'),
('Design', 'É um processo de pensamento que compreende a criação de produtos para solucionar problemas, incluindo aspectos funcionais e estéticos.');

/* Popule esta tabela com até 8 dados */
INSERT INTO tb_curso (nome, descricao, preco, url_imagem, fk_categoria) 
VALUES 
('Java', 'Java COMPLETO Programação Orientada a Objetos + Projetos', 189.90, 'https://img-c.udemycdn.com/course/240x135/1701388_0134.jpg', 1),
('Gestão de Projetos', 'Planejamento e Gestão de Projetos COMPLETO + 5 cursos Extras', 229.90, 'https://img-c.udemycdn.com/course/240x135/775066_a5bb_5.jpg', 2),
('Gestão Financeira', 'Gestão Financeira Para Pequenas e Médias Empresas', 199.90, 'https://img-c.udemycdn.com/course/240x135/720994_40b8_7.jpg', 3),
('Excel', 'Curso Excel COMPLETO do Básico ao Avançado', 99.90, 'https://img-b.udemycdn.com/course/240x135/2365840_bd05_5.jpg?secure=QM55vAr63BnnnKi8PSI6Bg%3D%3D%2C1642317735', 4),
('UX & Design Thinking', 'UX & Design Thinking: Experiência do Usuário nos negócios', 234.90, 'https://img-c.udemycdn.com/course/240x135/1334432_b8b0_9.jpg', 5),
('Modelagem de Dados', 'Modelagem de Dados UML (Análise&Projeto Orientado a Objetos)', 189.90, 'https://img-c.udemycdn.com/course/240x135/1597778_6b5a.jpg', 1),
('Java', 'Reconhecimento Facial com Java', 39.90, 'https://img-c.udemycdn.com/course/240x135/1411348_4efd.jpg', 1);

/* Faça um select que retorne os Produtos com o valor maior do que 50 reais */
SELECT * FROM tb_curso WHERE preco > 50;

/* Faça um select trazendo  os Produtos com valor entre 3 e 60 reais */
SELECT * FROM tb_curso
WHERE preco BETWEEN 3 AND 60;

/* Faça um select  utilizando LIKE buscando os Produtos com a letra J */
SELECT * FROM tb_curso
WHERE nome LIKE 'j%';

/* Faça um um select com Inner join entre tabela categoria e curso */
SELECT tb_curso.descricao, tb_categoria.categoria
FROM tb_curso
INNER JOIN tb_categoria ON tb_curso.fk_categoria = tb_categoria.id_categoria;

/* Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria Java). */
SELECT * FROM tb_curso
WHERE fk_categoria = 1;