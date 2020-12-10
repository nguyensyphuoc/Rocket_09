USE testingsystem;

-- Question 1: lấy ra tất cả các phòng ban
SELECT 
    *
FROM
    Department;

-- Question 2: lấy ra id của phòng ban có tên là "Sale"
SELECT 
    DepartmentID
FROM
    Department
WHERE
    DepartmentName = 'sale';
    
-- Question 3: lấy ra thông tin account có full name dài nhất

SELECT 
    * , MAX(LENGTH(FullName))
FROM
    `Account`;
    
-- Question 4: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT 
    GroupName
FROM
    `Group`
WHERE
    CreateDate < '2019-12-20'; 

-- Question 5: Lấy ra ID của question có >= 4 câu trả lời
SELECT 
    QuestionID
FROM
    Answer
GROUP BY QuestionID
HAVING QuestionID >= 4;
    
-- Question 6: Lấy ra 5 group được tạo gần đây nhất
SELECT 
    *
FROM
    `Group`
ORDER BY CreateDate DESC LIMIT 5;

-- Question 8: Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE 
FROM 		Exam 
WHERE 		CreateDate < '2019-12-20';

-- Question 9: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
UPDATE `Account` 
SET 
    FullName = 'Nguyễn Bá Lộc',
    Email = 'loc.nguyenba@vti.com.vn'
WHERE
    AccountID = 5;
    
-- Question 10: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT 
    A.Email,
    A.Username,
    A.FullName,
    A.PositionID,
    A.CreateDate,
    A.DepartmentID,
    D.DepartmentName
FROM
    `Account` A
        INNER JOIN
    Department D ON A.DepartmentID = D.DepartmentID;
-- Question 11: Viết lệnh để lấy ra tất cả các developer
-- Question 12: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT 
    D.DepartmentID,
    D.DepartmentName,
    COUNT(A.DepartmentID) AS 'SO LUONG'
FROM
    `Account` A
        INNER JOIN
    Department D ON D.DepartmentID = A.DepartmentID
GROUP BY A.DepartmentID
HAVING COUNT(A.DepartmentID) > 3;

-- Question 13: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT 
    Q.QuestionID,
    Q.Content,
    Q.CategoryID,
    Q.TypeID,
    Q.CreatorID,
    Q.CreateDate,
    COUNT(Q.Content) AS 'SO LUONG'
FROM
    Question Q
        INNER JOIN
    ExamQuestion EQ ON Q.QuestionID = EQ.QuestionID
GROUP BY Q.Content
HAVING COUNT(Q.Content) = (SELECT 
        MAX(CountQ)
    FROM
        (SELECT 
            COUNT(Q.QuestionID) AS CountQ
        FROM
            ExamQuestion EQ
        INNER JOIN Question Q ON EQ.QuestionID = Q.QuestionID
        GROUP BY Q.QuestionID) AS MaxContent);


-- Question 14: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT 
    CQ.CategoryID,
    CQ.CategoryName,
    COUNT(Q.CategoryID) AS 'SO LUONG'
FROM
    CategoryQuestion CQ
        LEFT JOIN
    Question Q ON CQ.CategoryID = Q.CategoryID
GROUP BY CQ.CategoryID
ORDER BY CQ.CategoryID ASC;

-- Question 15: Lấy ra Question có nhiều câu trả lời nhất
SELECT 
    Q.QuestionID, Q.Content, COUNT(A.QuestionID) AS 'SO LUONG'
FROM
    Question Q
        INNER JOIN
    Answer A ON Q.QuestionID = A.QuestionID
GROUP BY A.QuestionID
HAVING COUNT(A.QuestionID) = (SELECT 
        MAX(CountQ)
    FROM
        (SELECT 
            COUNT(A.QuestionID) AS CountQ
        FROM
            Answer A
        RIGHT JOIN Question Q ON A.QuestionID = Q.QuestionID
        GROUP BY A.QuestionID) AS MaxCountQ);
        
-- Question 16: Tìm chức vụ có ít người nhất
SELECT 
    P.PositionID,
    P.PositionName,
    COUNT(A.PositionID) AS 'SO LUONG'
FROM
    Position P
        INNER JOIN
    `Account` A ON P.PositionID = A.PositionID
GROUP BY P.PositionID
HAVING COUNT(A.PositionID) = (SELECT 
        MIN(CountP)
    FROM
        (SELECT 
            COUNT(P.PositionID) AS CountP
        FROM
            Position P
        INNER JOIN `Account` A ON P.PositionID = A.PositionID
        GROUP BY P.PositionID) AS MinCountP);
-- Question 17: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM

-- Question 18: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...
SELECT 
    T.TypeName AS 'LOAI CAU HOI',
    Q.CreatorID AS 'ID NGUOI TAO',
    Q.Content AS 'CAU HOI',
    A.Content AS 'CAU TRA LOI',
    Q.CreateDate AS 'NGAY TAO'
FROM
    Question Q
        INNER JOIN
    Answer A ON Q.QuestionID = A.QuestionID
        INNER JOIN
    TypeQuestion T ON Q.TypeID = T.TypeID;

-- Question 19: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT 
    T.TypeName AS 'LOAI CAU HOI', COUNT(Q.TypeID) AS 'SO LUONG'
FROM
    Question Q
        INNER JOIN
    TypeQuestion T ON Q.TypeID = T.TypeID
GROUP BY Q.TypeID;