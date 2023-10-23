create table clientes(
	id bigint not null auto_increment,
	nome varchar(100) not null,
	telefone varchar(100),
	idade varchar(100),
	logradouro varchar(100) not null,
	bairro varchar(100) not null,
	cep varchar(9) not null,
	complemento varchar(100),
	numero varchar(20),
	uf char(2) not null,
	cidade varchar(100) not null,

	primary key(id)
);