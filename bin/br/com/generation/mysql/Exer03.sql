/* Crie um banco de dados para um registro de uma escola */
CREATE DATABASE db_escola;
USE db_escola;

/* Crie uma tabela estudantes */
CREATE TABLE tb_estudantes (
    id_estudante INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    data_nascimento DATE NOT NULL,
    genero VARCHAR(20) NOT NULL,
    curso VARCHAR(45) NOT NULL,
    nota INT(2) NOT NULL,
    PRIMARY KEY (id_estudante)
);

/* Popule esta tabela com até 8 dados; */
INSERT INTO tb_estudantes (nome, data_nascimento, genero, curso, nota) 
VALUES ('Harry Tiago Potter', '1980-07-31', 'Masculino', 'Poções', '10');

INSERT INTO tb_estudantes (nome, data_nascimento, genero, curso, nota) 
VALUES ('Hermione Jean Granger', '1979-09-19', 'Feminino', 'História da Magia', '10');

INSERT INTO tb_estudantes (nome, data_nascimento, genero, curso, nota) 
VALUES ('Ronald Abílio Weasley', '1980-03-01', 'Masculino', 'Herbologia', '6');

INSERT INTO tb_estudantes (nome, data_nascimento, genero, curso, nota) 
VALUES ('Ginevra Molly Weasley', '1981-08-11', 'Feminino', 'Teoria da Magia', '7');

INSERT INTO tb_estudantes (nome, data_nascimento, genero, curso, nota) 
VALUES ('Luna Lovegood', '1981-02-13', 'Feminino', 'Alquimia', '8');

INSERT INTO tb_estudantes (nome, data_nascimento, genero, curso, nota) 
VALUES ('Draco Lúcio Malfoy', '1985-06-05', 'Masculino', 'Poções', '9');

INSERT INTO tb_estudantes (nome, data_nascimento, genero, curso, nota) 
VALUES ('Fred Weasley', '1978-04-01', 'Masculino', 'Transfiguração', '5');

INSERT INTO tb_estudantes (nome, data_nascimento, genero, curso, nota) 
VALUES ('Jorge Weasley', '1978-04-01', 'Masculino', 'Transfiguração', '6');

/* Faça um select que retorne o/as estudantes com a nota maior do que 7 */
SELECT * FROM tb_estudantes WHERE nota > 7;

/* Faça um select que retorne o/as estudantes com a nota menor do que 7 */
SELECT * FROM tb_estudantes WHERE nota < 7;

/* Ao término atualize um dado desta tabela através de uma query de atualização */
UPDATE tb_estudantes
SET nome = 'Ginevra Molly Potter'
WHERE id_estudante = 4;