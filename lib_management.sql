use lib_management;
show variables like 'character_set%';

CREATE TABLE Member (
	id INT AUTO_INCREMENT,
    name VARCHAR(255),
    phoneNumber VARCHAR(20),
    PRIMARY KEY(id)
);

CREATE TABLE Book (
	id INT AUTO_INCREMENT,
    title VARCHAR(255),
    publisher VARCHAR(255),
    author VARCHAR(255),
    PRIMARY KEY(id)
);

CREATE TABLE Rental (
	rentalID INT AUTO_INCREMENT,
    memberID INT,
    bookID INT,
    rentalDate DATE,
    isOverdue BOOLEAN,
    PRIMARY KEY(rentalID),
    FOREIGN KEY(memberID) REFERENCES Member(id),
    FOREIGN KEY(bookID) REFERENCES Book(id)
);