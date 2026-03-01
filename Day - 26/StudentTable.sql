CREATE TABLE student (
    id INT,
    name VARCHAR(50),
    marks INT
);

DELIMITER //

CREATE PROCEDURE InsertStudent(
    IN s_id INT,
    IN s_name VARCHAR(50),
    IN s_marks INT
)
BEGIN
    INSERT INTO student(id, name, marks)
    VALUES(s_id, s_name, s_marks);
END //

DELIMITER ;

CALL InsertStudent(101, 'Rahul', 85);

SELECT * FROM student;