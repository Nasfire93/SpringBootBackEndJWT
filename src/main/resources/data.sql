INSERT INTO USER
( DNI ,EMAIL,NAME,PASSWORD) VALUES
('45939593Z','PEPE@Gonzales.com','PEPE','$2a$10$J6T6seWCJ8lYOrrtRc2BOetOA/t3UhSKLzmMDwsZJXSnsmsMj5i.W');

INSERT INTO VENDOR
(VENDOR_ID,NAME,COUNTRY) VALUES
(1,'Maderas Experss','Spain'),
(2,'Philips','Países Bajos');

INSERT INTO ROLE
(ID,NAME) VALUES
(1,'ROLE_USER'),
(2,'ROLE_ADMIN');

INSERT INTO ITEMS
(ITEMS_ID ,DESCRIPTION,PRICE,STATE,CREATOR ,CREATION_DATE) VALUES
(1,'Caja',3.65,'Active','PEPE','2020-09-25'),
(2,'Cojin',9.26,'Inactive','PEPE','2020-12-14'),
(3,'Silla',20.75,'Active','PEPE','2020-04-08');

INSERT INTO PRICE_REDUCTION
(PRICE_REDUCTION_ID,NAME,CREATOR,REDUCEDPRICE,DATESTART ,DATEEND ) VALUES
(1,'DESCUENTO 1','PEPE',1.25,'2021-04-09','2021-04-17'),
(2,'DESCUENTO 2','PEPE',2,'2021-04-10','2021-10-01');

INSERT INTO ITEMS_REDUCTIONPRICE
(ITEMS,PRICE_REDUCTIONS) VALUES
(1,1),
(1,2),
(2,1),
(3,2);

INSERT INTO ITEMS_VENDORS
(ITEMS,VENDOR) VALUES
(1,1),
(1,2),
(2,1),
(3,2);

INSERT INTO USER_ROLES
(USER_ID,ROLE_ID) VALUES
('45939593Z',1),
('45939593Z',2);
