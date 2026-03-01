CREATE TABLE student (
    id INT,
    name VARCHAR(50),
    marks INT
);

DELIMITER //

CREATE PROCEDURE DisplayStudents()
BEGIN
    SELECT * FROM student;
END //

DELIMITER ;

CALL DisplayStudents();