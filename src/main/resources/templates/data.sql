
CREATE TABLE USER (
dni VARCHAR() PRIMARY KEY,
name VARCHAR() NOT NULL,
surname VARCHAR() NOT NULL,
email VARCHAR() NOT NULL,
dateup LOCALTIME NOT NULL
);

CREATE TABLE ITEMS (
itemsId IDENTITY NOT NULL PRIMARY KEY,
description VARCHAR() NOT NULL,
price FLOAT NOT NULL,
status VARCHAR() NOT NULL,
creator VARCHAR() NOT NULL,
usermod VARCHAR() NOT NULL,
dateup LOCALTIME NOT NULL
);

CREATE TABLE PRICE_REDUCTION (
creator VARCHAR() NOT NULL,
reducedprice FLOAT NOT NULL,
datestart LOCALTIME NOT NULL,
dateend LOCALTIME NOT NULL,
IdItems IDENTITY,
FOREIGN KEY (IdItems) REFERENCES ITEMS(itemsId)
);

CREATE TABLE VENDOR {
vendorId IDENTITY NOT NULL PRIMARY KEY,
name VARCHAR() NOT NULL,
country VARCHAR() NOT NULL,
description VARCHAR() NOT NULL
}

CREATE TABLE ITEMS_VENDOR {
itemsId IDENTITY NOT NULL,
vendorId IDENTITY NOT NULL,
FOREIGN KEY (IdItems) REFERENCES ITEMS(itemsId),
FOREIGN KEY (vendorId) REFERENCES VENDOR(vendorId)
}

INSERT INTO USER
(dni,name,surname,email,dateup) VALUES
('45939593Z','PEPE','Gonzales','PEPE@Gonzales.com','2020-05-12'),
('35676534X','ANTONIO','Perez','ANTONIO@Perez.com','2020-06-12');

INSERT INTO ITEMS
(description,price,status,creator,usermod,dateup) VALUES
('Caja',3.65,'ACTIVE','PEPE',null,'2020-09-25'),
('Cojin',9.26,'INACTIVE','PEPE',null,'2020-12-14'),
('Silla',20.75,'ACTIVE','PEPE',null,'2020-04-08'),

INSERT INTO PRICE_REDUCTION
(creator,reducedprice,datestart,dateend) VALUES
('PEPE',1.25,'2021-04-09','2021-04-17'),
('PEPE',2,'2021-04-10','2021-10-01');


INSERT INTO VENDOR
(name,country,description) VALUES
('Maderas Experss','Spain','Proveedor de madera'),
('Philips','Países Bajos','Bombillas led');

INSERT INTO ITEMS_VENDOR VALUES
(1,1),
(2,1);
