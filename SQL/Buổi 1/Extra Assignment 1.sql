/*					=== CREATE DATABASE ===      		      */ 
DROP DATABASE IF EXISTS Fresher;
CREATE DATABASE Fresher;
USE Fresher;

/*					=== CREATE TABLE ===						*/	
DROP TABLE IF EXISTS Trainee;

CREATE TABLE Trainee (
    Trainee_ID 				MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name 				NVARCHAR(100) NOT NULL,
    Birth_Date				DATETIME DEFAULT NOW() NOT NULL,
    Gender 					ENUM('MALE', 'FEMALE', 'UNKNOWN') NOT NULL,
    ET_IQ 					TINYINT UNSIGNED NOT NULL,
    ET_Gmath 				TINYINT UNSIGNED NOT NULL,
    ET_English 				TINYINT UNSIGNED NOT NULL,
    Training_Class 			TINYINT UNSIGNED NOT NULL,
    Evalution_Notes 		NVARCHAR(100),
    VTI_Account				SMALLINT NOT NULL UNIQUE KEY
);

 SELECT * FROM Trainee;

-- SELECT COUNT(Full_Name) FROM Trainee;
ALTER TABLE
		Trainee 
DROP COLUMN 
		VTI_Account;
-- alter table trainee modify column VIT_Account ;
DESC trainee;

INSERT INTO Trainee
VALUES  (1, 'Đình Tuấn', '1999-07-23', 'Male', 20, 20, 50, 0007, 'Perfect'),
		(2, 'Bảo Anh', '1999-10-05', 'Male', 10, 10, 25, 0008, 'Mischief'),
		(3, 'Thùy Dương', '1999-12-03', 'Female', 14, 16, 45, 0002, 'Docile'),
		(4, 'Quỳnh Anh', '1999-12-10', 'Female', 10, 20, 15, 0001, 'Docile'),
		(5, 'Đình Tú', '2002-01-22', 'Male', 9, 10, 36, 0004, 'Mischief'),
		(6, 'Đậu Hiền', '1999-06-14', 'Female', 3, 10, 50, 0002, 'Docile'),
		(7, 'Đắc Công', '1999-01-01', 'Male', 10, 10, 16, 0006, 'Mischief'),
		(8, 'Trà My', '1999-03-05', 'Female', 12, 14, 35, 0001, 'Docile'),
		(9, 'Phan Ngọc', '1977-06-01', 'Female', 20, 20, 40, 0003, 'Perfect'),
		(10, 'Nguyễn Ngân', '1999-07-23', 'Female', 15, 12, 25, 0005, 'Docile'),
		(11, 'Nguyễn Thảo', '1999-11-19', 'Female', 1, 2, 25, 0003, 'Mischief'),
		(12, 'Phương Hoa', '1999-04-16', 'Female', 5, 2, 29, 0004, 'Docile'),
		(13, 'Đức Vượng', '1999-07-19', 'Male', 15, 12, 45, 0005, 'Docile');

SELECT 
    Full_name, MONTH(Birth_date)
FROM
    trainee
WHERE
    ET_IQ > 10
ORDER BY month(Birth_date) ASC;

SELECT 
    length(full_name), full_name
FROM
    trainee
WHERE
    LENGTH(full_name) + (SELECT 
            MAX(full_name)
        FROM
            trainee);
            
SELECT 
    *
FROM
    trainee
WHERE
    ET_IQ >= 8 AND ET_Gmath >= 8
        AND ET_English >= 18;
        
DELETE FROM trainee 
WHERE
    traineeID = 3;
    
UPDATE trainee 
SET 
    training_class = 'A002'
WHERE
    traineeID = 5;