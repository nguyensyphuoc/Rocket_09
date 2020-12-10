/*    ========= 	Create database 	===========	*/
DROP DATABASE IF EXISTS Testing_System;
CREATE DATABASE Testing_System;
USE Testing_System;

/*	======			CREATE TABLE		 =======	*/

-- create table 1: Department
DROP TABLE IF EXISTS Department;
CREATE TABLE Deparmnent 
(
	DepartmentID 			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    DepartmentName 			NVARCHAR(50) NOT NULL UNIQUE 
);

-- create table 2: Position

CREATE TABLE Position 
(
	PositionID 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    PositionName 			ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL UNIQUE 
);

-- create table 3: Account

CREATE TABLE `Account` 
(
	AccountID 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email 					NVARCHAR(50) NOT NULL UNIQUE,
    UserName				NVARCHAR(50) NOT NULL,
    FullName				NVARCHAR(50) NOT NULL, 
    DepartmentID			SMALLINT UNSIGNED NOT NULL,
    PositionID				SMALLINT UNSIGNED NOT NULL,
    CreateDate				DATETIME DEFAULT NOW()
);

-- create table 4: Group

CREATE TABLE `Group` 
(
	GroupID 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    GroupName 				NVARCHAR(50) NOT NULL UNIQUE,
    CreatorID				SMALLINT UNSIGNED NOT NULL,
    CreateDate				DATETIME DEFAULT NOW()
);

-- create table 5: GroupAccount

CREATE TABLE `GroupAccount` 
(
	GroupID					SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    AccountID				SMALLINT UNSIGNED NOT NULL UNIQUE,
    JoinDate				DATETIME DEFAULT NOW()
);

-- create table 6: TypeQuestion

CREATE TABLE TypeQuestion 
(
	 TypeID 				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	 TypeName 				ENUM('Essay','Multiple-Choice') NOT NULL UNIQUE 
);

-- create table 7: CategoryQuestion

CREATE TABLE CategoryQuestion 
(
	 CategoryID				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
     CategoryName			NVARCHAR(50) NOT NULL UNIQUE 
);

-- create table 8: Question

CREATE TABLE Question
(
	QuestionID				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content					NVARCHAR(100) NOT NULL,
    CategoryID				SMALLINT UNSIGNED NOT NULL UNIQUE,
    TypeID					SMALLINT UNSIGNED NOT NULL,
    CreatorID				SMALLINT UNSIGNED NOT NULL,
    CreateDate				DATETIME DEFAULT NOW()
);

-- create table 9: Answer

CREATE TABLE Answer
(
	 AnswerID				SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
     Content				NVARCHAR(100) NOT NULL,
     QuestionID				SMALLINT UNSIGNED NOT NULL UNIQUE ,
     isCorrect				SMALLINT
     CHECK (isCorrect = 0 or isCorrect = 1 )
);

-- create table 10: Exam

CREATE TABLE Exam
(
    ExamID					SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code`					CHAR(50) NOT NULL,
    Title					NVARCHAR(50) NOT NULL,
    CategoryID				SMALLINT UNSIGNED NOT NULL UNIQUE,
    Duration				SMALLINT UNSIGNED NOT NULL UNIQUE,
    CreatorID				SMALLINT UNSIGNED NOT NULL UNIQUE,
    CreateDate				DATETIME DEFAULT NOW()
);

-- create table 11: ExamQuestion

CREATE TABLE ExamQuestion
(
    ExamID					SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	QuestionID				SMALLINT UNSIGNED NOT NULL UNIQUE
);

/*         =======		INSERT DATA		=======*/
-- add data to Department
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES 			(1111, 'Hội Đồng Quản Trị');
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES 			(2222, 'Giám Đốc');
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES 			(3333, 'Thư kí');
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES 			(4444, 'Marketting');
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES 			(5555, 'Bảo vệ');
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES 			(6666, 'Tài vụ' );
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES 			(7777, 'Tổng Giám Đốc' );

-- Add data position
INSERT INTO Position	(PositionID, PositionName) 
VALUES 			(111, 'Giám đốc kĩ thuật');
INSERT INTO Position	(PositionID, PositionName) 
VALUES 			(222, 'Giám đốc nhân sự');
INSERT INTO Position	(PositionID, PositionName) 
VALUES 			(333, 'Giám đốc marketting');
INSERT INTO Position	(PositionID, PositionName) 
VALUES 			(444, 'Đội trưởng bảo vệ');
INSERT INTO Position	(PositionID, PositionName) 
VALUES 			(555, 'Kĩ sư trưởng');
INSERT INTO Position	(PositionID, PositionName) 
VALUES 			(888, 'Phó phòng marketting');
INSERT INTO Position	(PositionID, PositionName) 
VALUES 			(999, 'Trưởng ban tài vụ');

-- Add data Account
INSERT INTO `Account`	(AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 			(12345, 'cristianoronaldo@gmail.com', 'cr7', 'Cristiano Ronaldo', 1, 2, '21-05-1985');
INSERT INTO `Account`	(AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 			(23456, 'lionelmessi@gmail.com', 'm10', 'Lionel Messi', 2, 3, '21-05-1986');
INSERT INTO `Account`	(AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 			(34567, 'paulpogba@gmail.com', 'pogba6', 'Paul Pogba', 3, 4, '21-05-1987');
INSERT INTO `Account`	(AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 			(45678, 'tonikroos@gmail.com', 'kr8', 'Toni Kroos', 4, 5, '21-05-1988');
INSERT INTO `Account`	(AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 			(56789, 'robertlewandowski@gmail.com', 'lw9', 'Robert Lewandowski', 5, 6, '21-05-1989');
INSERT INTO `Account`	(AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 			(91011, 'mohamedsalh@gmail.com', 'salah9', 'Mohamed Salah', 7, 8, '21-05-1990');
INSERT INTO `Account`	(AccountID, Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 			(101112, 'kilyanmbappe@gmail.com', 'mbappe10', 'Kilyan Mbappe', 8, 9, '21-05-1998');	

-- Add data Group
INSERT INTO `Group`		(GroupName, CreatorID, CreateDate)
VALUES 			('Manchester United', 011, '1-1-2000');
INSERT INTO `Group`		(GroupName, CreatorID, CreateDate)
VALUES 			('Liverpool', 012, '1-1-2001');
INSERT INTO `Group`		(GroupName, CreatorID, CreateDate)
VALUES 			('Real Madrid', 013, '1-1-2002');
INSERT INTO `Group`		(GroupName, CreatorID, CreateDate)
VALUES 			('FC Barcelona', 015, '1-1-2003');
INSERT INTO `Group`		(GroupName, CreatorID, CreateDate)
VALUES 			('Juventus', 016, '1-1-2004');
INSERT INTO `Group`		(GroupName, CreatorID, CreateDate)
VALUES 			('Paris Saint Germain', 017, '1-1-2005');
INSERT INTO `Group`		(GroupName, CreatorID, CreateDate)
VALUES 			('Bayern Munich', 018, '1-1-2006');

-- Add data GroupAccount
INSERT INTO `GroupAccount`	(  GroupID	, AccountID	, JoinDate)
VALUES			(1, 1,'2019-03-05');
INSERT INTO `GroupAccount`	(  GroupID	, AccountID	, JoinDate)
VALUES			(2, 2,'1999-04-05');
INSERT INTO `GroupAccount`	(  GroupID	, AccountID	, JoinDate)
VALUES			(3, 3,'1998-01-05');
INSERT INTO `GroupAccount`	(  GroupID	, AccountID	, JoinDate)
VALUES			(4, 4,'1997-05-05');
INSERT INTO `GroupAccount`	(  GroupID	, AccountID	, JoinDate)
VALUES			(9, 9,'1996-06-05');

-- Add data TypeQuestion
INSERT INTO TypeQuestion	(TypeID, TypeName) 
VALUES 			(001122, 'Essay'); 
INSERT INTO TypeQuestion	(TypeID, TypeName) 
VALUES 			(778899, 'Multiple-Choice'); 

-- Add data CategoryQuestion
INSERT INTO CategoryQuestion		(CategoryName	)
VALUES 								('Java');
INSERT INTO CategoryQuestion		(CategoryName	)
VALUES 								('PHP');
INSERT INTO CategoryQuestion		(CategoryName	)
VALUES 								('C++');
INSERT INTO CategoryQuestion		(CategoryName	)
VALUES 								('SQL');
INSERT INTO CategoryQuestion		(CategoryName	)
VALUES 								('Javascript');
INSERT INTO CategoryQuestion		(CategoryName	)
VALUES 								('Python');
INSERT INTO CategoryQuestion		(CategoryName	)
VALUES 								('Ruby');

-- Add data Question
INSERT INTO Question	(QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
VALUES 					(111111, 'Hỏi đáp Java', 1, '1','2', '01-01-1999');
INSERT INTO Question	(QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
VALUES 					(222222, 'Hỏi đáp PHP', 12, '34','56', '01-01-1987');
INSERT INTO Question	(QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
VALUES 					(333333, 'Hỏi đáp C++', 6, '7','32523', '01-01-1989');
INSERT INTO Question	(QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
VALUES 					(444444, 'Hỏi đáp SQL', 144, '143','6436', '01-01-2000');
INSERT INTO Question	(QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
VALUES 					(555555, 'Hỏi đáp Python', 2354, '5345','654', '01-01-2001');
INSERT INTO Question	(QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
VALUES 					(999999, 'Hỏi đáp Javascript', 12, '4','89', '01-01-2002');

-- lấy ra thông tin các phòng ban 
