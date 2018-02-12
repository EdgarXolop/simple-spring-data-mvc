
CREATE TABLE USER(
    IdUser INT NOT NULL auto_increment,
    Name VARCHAR(255) NOT NULL,
    Email VARCHAR(255) NOT NULL,
    Password VARCHAR(512) NOT NULL,
    PRIMARY KEY(IdUser),
    FOREIGN KEY (IdDepartament) REFERENCES DEPARTAMENT(IdDepartament)
);
