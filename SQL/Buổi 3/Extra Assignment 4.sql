
DROP DATABASE IF EXISTS Project_1;
CREATE DATABASE Project_1;
USE Project_1;

-- create table 1: Employee
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee
(
	Employee_ID						INT AUTO_INCREMENT PRIMARY KEY,
    Employee_Last_Name				VARCHAR(50),
    Employee_First_Name				VARCHAR(50),
    Employee_Hire_Date				DATETIME,
    Employee_Status					TINYINT,
    Supervisor_ID					INT,
    Social_Security_Number			INT
);
-- create table 2: Project
DROP TABLE IF EXISTS Project;
CREATE TABLE Projects
(
    Project_ID					INT AUTO_INCREMENT PRIMARY KEY,
	Manager_ID					INT,
    Project_Name				VARCHAR(100),
    Project_Start_Date			DATETIME,
	Project_Description			VARCHAR(255),
    Project_Detailt				VARCHAR(255),
    Project_CompleteOn			DATETIME
);

-- create table 3: Project_mOdules
DROP TABLE IF EXISTS Project_Modules;
CREATE TABLE Project_Modules
(
	Module_ID						INT AUTO_INCREMENT PRIMARY KEY,
    Project_ID						INT,
    Project_Modules_Date			DATETIME ,
    Project_Modules_CompletedOn		DATETIME,
    Project_Modules_Description		VARCHAR(255),
	FOREIGN KEY(Project_ID) REFERENCES Projects(Project_ID)
);

-- create table 4: Work_Done
DROP TABLE IF EXISTS Work_Done;
CREATE TABLE Work_Done
(
	Work_Done_ID			INT AUTO_INCREMENT PRIMARY KEY,
    Employee_ID				INT,
    Module_ID				INT,
    Work_Done_Date			DATETIME,
	Work_Done_Description	VARCHAR(255),
	Work_Done_Status		TINYINT,
    FOREIGN KEY(Employee_ID) REFERENCES Employee(Employee_ID),
    FOREIGN KEY(Module_ID) 	REFERENCES Project_Modules(Module_ID)
);

/*				INSERT DATA				*/
-- table 1
INSERT INTO Employee(Employee_ID, Employee_Last_Name, Employee_First_Name, Employee_Hire_Date, Employee_Status, Supervisor_ID, Social_Security_Number)
VALUE				(1, 'Thành', 'Nguyễn Huy', '2019-01-03', 1, NULL, 214294),
					(2, 'Đông', 'Công Phương', '2019-01-03', 1, 1, 215462),
                    (3, 'Trang', 'Đặng Nguyễn Phương', '2019-01-03', 1, 1, NULL),
                    (4, 'Thủy', 'Thạch Thanh', '2019-01-05', 1, NULL, 236454),
                    (5, 'Hiệp', 'Hoàng Mạnh', '2019-01-06', 1, 1, NULL),
                    (6, 'Hằng', 'Hồ Thị', '2019-02-01', 1, 4, 365446),
                    (7, 'Anh', 'Nguyễn Tú', '2019-03-05', 1, 4, NULL),
                    (8, 'Giang', 'Trần Thị Thu', '2019-03-06', 1, 4, 332546),
                    (9, 'Dũng', 'Bùi Ngọc', '2019-04-03', 1, 10, 123654),
                    (10, 'Đạt', 'Giang Tiến', '2019-03-08', 1, NULL, NULL),
                    (11, 'Kiên', 'Lại Trung', '2019-04-09', 1, NULL, 512983),
                    (12, 'Anh', 'Vũ Tuấn', '2019-05-01', 1, NULL, NULL),
                    (13, 'Thảo', 'Nguyễn Ngọc', '2019-05-01', 1, 12, 412123),
                    (14, 'An', 'Lê Ngọc', '2019-06-09', 1, 12, 135123),
                    (15, 'Việt', 'Nguyễn Việt', '2019-04-09', 1, 2, 123141),
                    (16, 'Hiếu', 'Đỗ Duy', '2019-04-08', 1, 2, 1231445);
                    
-- table 2: projects
INSERT INTO Projects
VALUE 	(1, 1, 'Web_MyGo', '2020-03-01', 'Web for customer', 'just a web', '2020-07-15'),
		(2, 1, 'Android_MyGo', '2020-03-05', 'Android App for customer', 'just a app', '2020-08-29'),
        (3, 1, 'Ios_MyGo', '2020-03-05', 'iOS App for customer', 'just a app', NULL),
        (4, 1, 'Backend_MyGo', '2020-03-01', 'BE for MyGo applicaton', 'Big BE', NULL),
        (5, 4, 'Test_MyGo', '2020-04-01', 'Test', 'Automation', '2020-11-01');
	        
-- table 3: Project_module
INSERT INTO Project_Modules(Module_ID, Project_ID, Project_Modules_Date, Project_Modules_CompletedOn, Project_Modules_Description)
VALUES  (1, 1, '2020-03-01', '2020-05-01', 'Web customer'),
		(2, 1, '2020-03-01', '2020-05-29', 'Web profile'),
        (3, 1, '2020-03-01', '2020-08-29', 'Web_report'),
        (4, 2, '2020-03-05', '2020-09-15', 'App driver'),
        (5, 2, '2020-03-05', '2020-10-14', 'App customer'),
        (6, 3, '2020-03-05', NULL, 'App driver'),
        (7, 3, '2020-03-10', NULL, 'App customer'),
        (8, 4, '2020-03-01', NULL, 'Backend web'),
        (9, 4, '2020-03-01', '2020-09-09', 'Backend database'),
        (10, 5, '2020-04-01', '2020-09-01', 'Manual'),
        (11, 5, '2020-04-01', '2020-11-14', 'Automation');
        
-- table 4 : work_done
INSERT INTO Work_Done(Work_Done_ID, Employee_ID, Module_ID, Work_Done_Date, Work_Done_Description, Work_Done_Status)
VALUES 	(1, 5, 1, '2020-05-01', 'Design', 1),
		(2, 5, 1, '2020-05-01', 'Core JS', 1),
        (3, 5, 2, '2020-05-29', 'HTML, CSS', 1),
        (4, 11, 2, '2020-05-29', 'Javascript and Vue', 1),
        (5, 14, 3, '2020-08-29', 'Make Data', 1),
        (6,13, 3, '2020-08-29', 'Vue Design', 1),
        (7, 2, 4, '2020-09-15', 'App driver - Design', 1),
        (8, 15, 4, '2020-09-15', 'App driver - api done', 1),
        (9, 16, 5, '2020-10-14', 'Api customer - design', 1),
        (10, 2, 5, '2020-10-14', 'Api customer - api done', 1),
        (11, 9, 6, NULL, 'Ios Design', 1),
        (12, 10, 7, NULL, 'Ios design + api work', 1),
        (13, 11, 8, NULL, 'Backend core', 1),
        (14, 12, 8, NULL, 'Backend System', 1),
        (15, 4, 8, NULL, 'Backend api', 1),
        (16, 1, 9, '2020-09-09', 'Backend data config', 1),
        (17, 3, 9, '2020-09-09', 'Backend data create', 1),
        (18, 8, 10, '2020-09-01', 'Write test case', 1),
        (19, 8, 10, '2020-09-01', 'Sumary test case', 1),
        (20, 7, 11, '2020-11-14', 'Write code done', 1);