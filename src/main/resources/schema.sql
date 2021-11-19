create table produto (
    id int not null,
    nome VARCHAR(90) not null,
    imagemUrl VARCHAR(255) not null,
    oldPrice float not null,
    price float not null,
    descricao varchar(90),
    parcela_id int not null
);

create table parcela (
    id int not null,
    numParcelas int not null,
    value float not null
);
