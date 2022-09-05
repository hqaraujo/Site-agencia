create table login (
id_login integer primary key auto_increment,
tipo_login varchar(10)

);

create table destino (
id_destino integer primary key auto_increment,
pais varchar(10),
cidade varchar(10),
id_pacote integer 

);

create table compras (
 valor_total decimal(10),
 forma_pagamento decimal(10),
 valor decimal(10),
 data_compras datetime,
 id_compras integer primary key auto_increment,
 id_cliente integer,
 id_destino integer,
 foreign key (id_destino) references destino (id_destino)
 
);

create table cliente (
id_cliente integer primary key auto_increment,
cpf_cliente varchar(10),
nome_cliente varchar(20),
email_cliente varchar(20),
id_login integer,
foreign key(id_login) references login (id_login)

);

create table pacotesPromocionais (
id_pacote integer primary key auto_increment,
origem varchar(10),
promocao decimal
);

alter table destino add foreign key (id_pacote) references pacotesPromocionais (id_pacote);
alter table compras add foreign key (id_cliente) references cliente (id_cliente);

select * from compras;

