create database if not exists dbproduits; 

use dbproduits; 

create table if not exists PRODUIT
(
	numProd int primary key auto_increment,
	description varchar(40),
	famille varchar(40),
	prixAchat decimal(10,2),
	prixVente decimal(10,2) 
);

insert into PRODUIT values (null,'Cuisinière','Electromenager',1200.80,1500.70);
insert into PRODUIT values (null,'Four micro-ondes','Electromenager',550.50,760.00);
insert into PRODUIT values (null,'Four à vapeur','Electromenager',2300.80,3000.70);
insert into PRODUIT values (null,'Cuisinière à gaz','Electromenager',850.50,1260.00);
insert into PRODUIT values (null,'Lave-vaisselle','Electromenager',2460.80,2800.00);
insert into PRODUIT values (null,'Sèche-linge','Electromenager',350.50,660.99);
insert into PRODUIT values (null,'Raisin','Fruit',22.80,29.70);
insert into PRODUIT values (null,'Cerises','Fruit',30.99,35.00);
insert into PRODUIT values (null,'Céleri branche','Fruit',32.40,35.70);
insert into PRODUIT values (null,'Pomme','Fruit',15.50,19.00);
insert into PRODUIT values (null,'Orange','Fruit',10.80,13.00);
insert into PRODUIT values (null,'Abricot','Fruit',30.50,33.00);
insert into PRODUIT values (null,'Tomates','Legumes',7.50,10.00);
insert into PRODUIT values (null,'Carottes','Legumes',2.80,4.00);
insert into PRODUIT values (null,'Pois','Legumes',10.50,13.00);
insert into PRODUIT values (null,'Sel','Epicerie',5.50,7.00);
insert into PRODUIT values (null,'Poivres','Epicerie',6.50,8.50);
insert into PRODUIT values (null,'Epices','Epicerie',2.80,4.00);
insert into PRODUIT values (null,'Vanille','Epicerie',1.50,3.00);
insert into PRODUIT values (null,'Huiles','Epicerie',17.50,20.00);

