create schema onetable;

create table onetable.customers
(
    id           int primary key auto_increment,
    name         varchar(255),
    surname      varchar(255),
    age          int          not null,
    phone_number varchar(255) not null
);

insert into onetable.customers (name, surname, age, phone_number)
VALUES ('Mikey', 'Mouse', 16, +657609089),
       ('Alexey', 'Petrov', 23, +698790007),
       ('Ivan', 'Dudin', 44, +186848055),
       ('alexey', 'Serov', 87, +534763468);

create schema twotable;

create table twotable.orders
(
    id           int primary key auto_increment,
    date         varchar(255) not null,
    customer_id  int          not null,
    product_name varchar(255) not null,
    amount       int          not null
);
alter table twotable.orders
    add constraint fk_customer_id foreign key (customer_id) references onetable.customers (id);

insert into twotable.orders (date, customer_id, product_name, amount)
VALUES ('15.04.2023', 1, 'mouse', 1600),
       ('14.06.2020', 2, 'bread', 23),
       ('30.08.2012', 3, 'pc', 120000),
       ('25.11.1995', 4, 'car', 30000);