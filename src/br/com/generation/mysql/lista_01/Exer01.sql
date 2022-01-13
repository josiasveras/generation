CREATE DATABASE db_rh;
USE db_rh;

/* Crie uma tabela de funcionaries */
CREATE TABLE tb_funcionarios (
    id_usuario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    cargo VARCHAR(45) NOT NULL,
    setor VARCHAR(45) NOT NULL,
    salario DOUBLE NOT NULL,
    PRIMARY KEY (id_usuario)
);

/* Popule esta tabela com até 5 dados; */
INSERT INTO tb_funcionarios (nome, cargo, setor, salario) 
VALUES ('João da Silva', 'Assistente administrativo', 'administrativo', 2500);

INSERT INTO tb_funcionarios (nome, cargo, setor, salario) 
VALUES ('Ricardo Amorin', 'Diretor financeiro', 'financeiro', 30000);

INSERT INTO tb_funcionarios (nome, cargo, setor, salario) 
VALUES ('Rafael Soares de Brito', 'Programador Java', 'TI', 15000);

INSERT INTO tb_funcionarios (nome, cargo, setor, salario) 
VALUES ('Ana Ferreira dos Santos', 'Gestor de recrutamento e seleção', 'RH', 20000);

INSERT INTO tb_funcionarios (nome, cargo, setor, salario) 
VALUES ('Fernanda Oliveira Rodrigues', 'Diretora comercial', 'financeiro', 35000);

INSERT INTO tb_funcionarios (nome, cargo, setor, salario) 
VALUES ('Ana Borges de Souza', 'Auxiliar de Expedição', 'operacional', 1900);

/* Faça um select que retorne os funcionaries com o salário maior do que 2000. */
SELECT * FROM tb_funcionarios WHERE salario > 2000;

/* Faça um select que retorne os funcionaries com o salário menor do que 2000. */
SELECT * FROM tb_funcionarios WHERE salario < 2000;

/* Ao término atualize um dado desta tabela através de uma query de atualização. */
UPDATE tb_funcionarios
SET setor = 'Tecnologia da Informação'
WHERE id_usuario = 3;
