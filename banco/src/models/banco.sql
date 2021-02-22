CREATE DATABASE IF NOT EXISTS banco;

USE banco;

CREATE TABLE IF NOT EXISTS conta_corrente
(
    numero_conta integer primary key not null auto_increment,
    agencia integer not null,
    nome_cliente varchar(255) not null,
    saldo float not null,
    senha varchar(255) not null,
    status_conta boolean not null,
);
