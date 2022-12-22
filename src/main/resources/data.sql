create table person
(
    id         integer      not null,
    name       varchar(255) not null,
    location   varchar(255) not null,
    birth_date timestamp,
    primary key (id)
);


INSERT INTO PERSON
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10002, 'HERA', 'CINGAMBUL', '2002-10-10 00:00:00');

INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10003, 'LATHIFA', 'CIKIJING', '2002-10-10 00:00:00');

INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10004, 'MARYAM', 'MAJALENGKA', '2002-10-10 00:00:00');



