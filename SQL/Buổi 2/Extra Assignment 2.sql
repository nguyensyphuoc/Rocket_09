/*	============   CREATE DATABASE	==========*/
DROP DATABASE IF EXISTS Employee_B2;
CREATE DATABASE Employee_B2;
USE	Employee_B2;

-- create table: Department
DROP TABLE IF EXISTS Department;
CREATE TABLE Department
(
	Department_Number 			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name				NVARCHAR(50) UNIQUE KEY NOT NULL
);

-- create table: Employee_Table
DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table
(
	Employee_Number 			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Employee_Name				NVARCHAR(50) NOT NULL,
    Department_Number			INT UNSIGNED NOT NULL,
    
    FOREIGN KEY(Department_Number) REFERENCES Department(Department_Number)
);

-- Create table: Employee_Skill_Table
DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table
(
	Employee_Number 			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Skill_Code					NVARCHAR(50) NOT NULL,
    Date_Registered				DATETIME DEFAULT NOW(),
    
    FOREIGN KEY(Employee_Number) REFERENCES Employee_Table(Employee_Number)
);

/* ============			INSERT DATA		============*/

INSERT INTO Department	(Department_Name, Department_Number) 
VALUES 					('SAMSUNG', 			1),
						('SONY', 				2),
                        ('LG', 					3),	
                        ('CANON', 				4);


INSERT INTO Employee_Table 	(Employee_Name		, Department_Number	, Employee_Number)
VALUES						('Soobin Hoang Son', 		2,					1),
							('Tran Than MC', 			3,					2),
							('Truong Giang MC', 		1,					3),
							('Quan AP', 				4,					4),
							('My Tam', 					1,					5),
							('Dam Vinh Hung', 			3,					6),
							('Binz', 					2,					7),
							('SuBoi', 					1,					8),
							('BigDaddy', 				2,					9),
							('Erik', 					3,					10),
							('Duc Phuc', 				4,					11),
							('Hari Won', 				2,					12);


INSERT INTO Employee_Skill_Table 	(Employee_Number, Skill_Code	, Date_Registered	)
VALUES									(1, 		'JAVA', 		'2020-11-28'),
										(2, 		'PYTHON', 		'2020-11-28'),
                                        (3, 		'HTML', 		'2020-11-28'),
                                        (4, 		'CSS', 			'2020-11-28'),
                                        (5, 		'JAVA', 		'2020-11-28'),
                                        (6, 		'C#', 			'2020-11-28'),
                                        (7, 		'SQL', 			'2020-11-28'),
                                        (8, 		'PHOTOSHOP', 	'2020-11-28'),
                                        (9, 		'JAVA', 		'2020-11-28'),
                                        (10, 		'JAVA', 		'2020-11-28'),
                                        (11, 		'HTML', 		'2020-11-28'),
                                        (12, 		'C#', 			'2020-11-28');

/*	=	=	=	=	=	=	=	=	=	=	=	=	=	=	=	=	=	=	=	=	=	=	*/


-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu
-- Question 2: Thêm ít nhất 10 bản ghi vào table
-- Question 3: Lấy ra danh sách nhân viên có skill java	
SELECT 
    ET.Employee_Number,
    ET.Employee_Name,
    EST.Skill_Code
FROM
    Employee_Table ET
        RIGHT JOIN
    Employee_Skill_Table EST  ON  ET.Employee_Number = EST.Employee_Number
WHERE
    Skill_Code = 'Java';
    
-- Question 4: Lấy ra danh sách có phòng ban > 3 nv
SELECT 
    D.Department_Number,
    D.Department_Name,
    COUNT(ET.Department_Number)
FROM
    Department D
        INNER JOIN
    Employee_Table ET ON D.Department_Number = ET.Department_Number
GROUP BY ET.Department_Number
HAVING COUNT(ET.Department_Number) >= 3
ORDER BY D.Department_Number ASC;
    
-- Question 5: Lẩy ra danh sách nhân viên của mỗi phòng ban
SELECT 
     ET.*
FROM
    Department D
        INNER JOIN
     Employee_Table ET ON D.Department_Number =  ET.Department_Number
ORDER BY D.Department_Number ASC;

-- Question 6: Lấy ra danh sách nhân viên > 1 skills
SELECT 
    ET.*, COUNT(EST.Employee_Number)
FROM
    Employee_Table ET
        RIGHT JOIN
    Employee_Skill_Table EST ON ET.Employee_Number = EST.Employee_Number
GROUP BY ET.Employee_Number
HAVING COUNT(EST.Employee_Number) > 1;

-- đếm số lương nhân viên 