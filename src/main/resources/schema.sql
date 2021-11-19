create table produto (
    id int not null,
    nome VARCHAR(100) not null,
    imagemUrl VARCHAR(300) not null,
    oldPrice float not null,
    price float not null,
    descricao varchar(200),
    parcela_id int not null
);

create table parcela (
    id int not null,
    numParcelas int not null,
    value float not null
);
