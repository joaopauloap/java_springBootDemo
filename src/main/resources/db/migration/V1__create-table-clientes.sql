create table clientes(
	id bigint not null auto_increment,
	nome varchar(100) not null,
	telefone varchar(100),
	logradouro varchar(100),
	bairro varchar(100),
	cep varchar(9),
	complemento varchar(100),
	numero varchar(20),
	uf char(2),
	cidade varchar(100),

	primary key(id)
);