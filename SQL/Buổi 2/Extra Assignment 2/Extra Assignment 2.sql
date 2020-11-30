drop table IF EXISTS Deparment;
create table Department 
(
	Department_number		INT,
    Department_name			nvarchar(50)
);

DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table 
(
	Employee_Number			int,
    Employee_Name			INT,
    Department_Number		INT
);

DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table 
(
	Employee_Number			INT,
    Skill_Code				INT,
    Date_Registered			datetime
);