/*			CREATE DATABASE ThucTap			*/

DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;


/*============================== TẠO BẢNG DỮ LIỆU (3 BẢNG) =============================*/
/*======================================================================================*/

-- Tao bang 1: Country
DROP TABLE IF EXISTS Country;
CREATE TABLE Country
(
	Country_ID 			INT PRIMARY KEY,
    Country_name		VARCHAR(255) NOT NULL
);

-- Tao bang 2: Location
DROP TABLE IF EXISTS Location;
CREATE TABLE Location
(
	Location_ID 				INT PRIMARY KEY,
    Street_Address 				VARCHAR(255) NOT NULL,
    Postal_code					INT UNSIGNED NOT NULL,
    Country_ID					INT	UNSIGNED NOT NULL
);

-- Tao bang 3: Employee
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee
(
	Employee_ID 			INT PRIMARY KEY,
    Full_name 				NVARCHAR(255) NOT NULL,
    Email					VARCHAR(255),
    Location_ID				INT UNSIGNED NOT NULL
);

INSERT INTO Country
VALUES 	(10, 'Việt Nam'),
		(9, 'Anh'),
		(8, 'Trung Quốc'),
		(7, 'Hàn Quốc'),
		(6, 'Nhật Bản');
        
INSERT INTO Location
VALUES 	(1, 'Minh Khai', 1234, 6),
		(2, 'Bac Ninh', 1256, 7),
		(3, 'Ha Noi', 1267, 7),
		(4, 'Ho Chi Minh', 1289, 9),
		(5, 'Nha Trang', 1298, 10);
        
INSERT INTO Employee
VALUES 	(2, 'Nguyễn Văn A', 'nguyenvana@gmail.com', 5),
		(3, 'Nguyễn Văn B', 'nn03@gmail.com', 		5),
		(4, 'Nguyễn Văn C', 'nguyenvanc@gmail.com', 2),
		(5, 'Nguyễn Văn J', 'nguyenvanj@gmail.com', 3),
		(6, 'Nguyễn Văn K', 'nguyenvank@gmail.com', 1);
        
-- Question 1: Tạo table với các ràng buộc và kiểu dữ liệu. Thêm ít nhất 3 bản ghi vào table
-- Question 2a: Lấy tất cả các nhân viên thuộc Việt nam
SELECT 
    *
FROM
    Employee 
        WHERE Location_ID = (SELECT 
        L.Location_ID
    FROM
        Location L
            JOIN
        Country C ON L.Country_ID = C.Country_ID
        WHERE C.Country_Name = 'Việt Nam');

-- Question 2b: Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT 
    Country_Name
FROM
    Country
WHERE
    Country_ID = (SELECT 
            L.Country_ID
        FROM
            Location L
                JOIN
            Employee E ON L.Location_ID = E.Location_ID
        WHERE
            E.Email = 'nn03@gmail.com');
            
-- Question 2c: Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.

SELECT 
    C.Country_Name,
    L.Street_Address,
    COUNT(E.Employee_ID) AS 'SO LUONG'
FROM
    Country C
        JOIN
    Location L ON L.Country_ID = C.Country_ID
        JOIN
    Employee E ON E.Location_ID = E.Location_ID
GROUP BY Country_Name , Street_Address;

-- Question 3:Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
DROP TRIGGER IF EXISTS emp_Insert; 
DELIMITER $$
	CREATE TRIGGER  emp_Insert
    BEFORE INSERT ON Employee
	FOR EACH ROW
    BEGIN 
	IF (COUNT(NEW.Employee_ID) > 10) THEN
				SIGNAL SQLSTATE '12345'
				SET MESSAGE_TEXT = 'khong dc them qua 10 ban ghi';
	END IF;
END$$
 DELIMITER ;
-- Question 4: Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null
DROP TRIGGER IF EXISTS emp_update; 
DELIMITER $$
	CREATE TRIGGER  emp_update
	BEFORE DELETE ON Location
	FOR EACH ROW
    BEGIN 
		UPDATE employee SET location_id = NULL WHERE location_id = old.location_id;
    END $$
DELIMITER ;