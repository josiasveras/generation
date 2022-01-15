CREATE DATABASE bd_blog_pessoal;
USE bd_blog_pessoal;

CREATE TABLE tb_temas (
	id_tema BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL
);

CREATE TABLE tb_usuarios (
	id_usuario BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    usuario VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    foto VARCHAR(255)
);

CREATE TABLE tb_postagens (
    id_postagem BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    texto VARCHAR(1000) NOT NULL,
    data_postagem DATE,
    fk_id_tema BIGINT,
    fk_id_usuario BIGINT,
    FOREIGN KEY (fk_id_tema) REFERENCES tb_temas (id_tema),
    FOREIGN KEY (fk_id_usuario) REFERENCES tb_usuarios (id_usuario)
);
