/* Crie um banco de um game Online, o nome do banco deverá ter o seguinte nome db_generation_game_online */
CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

/* Crie uma tabela tb_classe e determine 3 atributos relevantes */
CREATE TABLE tb_classe (
	id_classe INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    classe VARCHAR(45) NOT NULL,
    descricao VARCHAR(300)
);

/* Crie uma tabela tb_personagem e determine 5 atributos relevantes */
CREATE TABLE tb_personagem (
	id_personagem INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45) NOT NULL,
    raça VARCHAR(45) NOT NULL,
    ataque INT NOT NULL,
    defesa INT NOT NULL,
    fk_classe INT,
    FOREIGN KEY (fk_classe) REFERENCES tb_classe (id_classe)
);

/* Popule esta tabela classe com até 5 dados. */
INSERT INTO tb_classe (classe, descricao) 
VALUES
("Guerreiros", "Verdadeiros mestres de armas, eles estão presentes em todas as sociedades, e seus estilos de combate variam muito, dependendo do local de origem."),
("Magos", "Magos na Terra-Média são conhecidos como Istari, uma raça de seres divinos extremamente sábios e poderosos."),
("Bárbaros", "Bárbaros na Terra Média são guerreiros tribais de grande força e coragem, que combatem com grande selvageria e temeridade."),
("Ladinos", "Os ladinos na Terra-Média são espiões, batedores e exploradores extremamente versáteis e hábeis nas artes da furtividade. Alguns deles, especialmente os ladinos anões, são especialmente hábeis no uso de mecanismos e armadilhas."),
("Clérigos", "Os“clérigos” da Terra-Média são na verdade elfos (mais especificamente, os Eldar e seus descendentes) que tiveram contato direto ou indireto com a sabedoria e poder dos Valar, aprendendo a utilizar uma forma de magia muito parecida com a empregada pelos próprios Istari.");

/* Popule esta tabela personagem com até 8 dados */
INSERT INTO tb_personagem (nome, raça, ataque, defesa, fk_classe)
VALUES
("Legolas Verdefolha", "Elfo", "3000", "2000", 1),
("Gandalf", "Maiar", "5000", "5000", 2),
("Beorn", "Troca-peles", "4000", "3000", 3),
("Bilbo Bolseiro", "Hobbit", "1000", "1000", 4),
("Galadriel", "Elfo", "4000", "4000", 5),
("Thorin Escudo de Carvalho", "Anão", "4500", "4000", 1),
("Saruman", "Maiar", "4900", "4800", 2),
("Gimli", "Anão", "3500", "3000", 1),
("Celeborn", "Elfo", "3500", "3000", 5);

/* Faça um select que retorne os personagens com o poder de ataque maior do que 2000 */
SELECT * FROM tb_personagem WHERE ataque > 2000;

/* Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000 */
SELECT * FROM tb_personagem
WHERE defesa BETWEEN 1000 AND 2000;

/* Faça um select utilizando LIKE buscando os personagens com a letra C */
SELECT * FROM tb_personagem
WHERE nome LIKE 'c%';

/* Faça um um select com Inner join entre tabela classe e personagem */
SELECT tb_personagem.nome, tb_classe.classe
FROM tb_personagem
INNER JOIN tb_classe ON tb_personagem.fk_classe = tb_classe.id_classe;

/* Faça um select onde traga todos os personagens de uma classe específica (exemplo todos os personagens que são arqueiros) */
SELECT * FROM tb_personagem
WHERE fk_classe = 1;