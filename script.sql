use mydb;

CREATE TABLE product(
	id INT AUTO_INCREMENT,
	name VARCHAR(20),
	description VARCHAR(100),
	price decimal(8,3),
	PRIMARY KEY(id)
);

SELECT * FROM product p ;