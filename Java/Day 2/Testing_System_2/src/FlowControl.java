import java.time.LocalDate;

public class FlowControl {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Thủ môn";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Hậu vệ";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Tiền vệ";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Tiền đạo";

		// Create position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.SCRUM_MASTER;

		Position position4 = new Position();
		position4.id = 4;
		position4.name = PositionName.TEST;

		// Create account
		Account account1 = new Account();
		account1.id = 1;
		account1.fullName = "Cristiano Ronaldo";
		account1.userName = "CR7";
		account1.email = "crisronaldo@gmail.com";
		account1.department = department4;
		account1.position = position1;
		account1.createDate = LocalDate.of(2010, 12, 21);
		account1.gender = Gender.MALE;

		Account account2 = new Account();
		account2.id = 2;
		account2.fullName = "Toni Kroos";
		account2.userName = "KRoos";
		account2.email = "tonikroos@gmail.com";
		account2.department = department3;
		account2.position = position3;
		account2.createDate = LocalDate.of(2020, 10, 10);
		account2.gender = Gender.MALE;

		Account account3 = new Account();
		account3.id = 3;
		account3.fullName = "Virgil van Dijk";
		account3.userName = "vanDijk";
		account3.email = "virgilvandijk@gmail.com";
		account3.department = department2;
		account3.position = position2;
		account3.createDate = LocalDate.of(2020, 9, 10);
		account3.gender = Gender.MALE;

		Account account4 = new Account();
		account4.id = 4;
		account4.fullName = "Lionel Messi";
		account4.userName = "M10";
		account4.email = "leomessi@gmail.com";
		account4.department = department4;
		account4.position = position3;
		account4.createDate = LocalDate.of(2020, 12, 12);
		account4.gender = Gender.MALE;

		// Create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Juventus FC";
		group1.creator = account1;
		group1.CreateDate = LocalDate.of(2018, 12, 12);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Real Madrid";
		group2.creator = account2;
		group2.CreateDate = LocalDate.of(2018, 11, 11);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "FC Barcelona";
		group3.creator = account3;
		group3.CreateDate = LocalDate.of(2018, 10, 10);

		Group group4 = new Group();
		group4.id = 4;
		group4.name = "FC  Bayer Munich";
		group4.creator = account4;
		group4.CreateDate = LocalDate.of(2018, 9, 9);

		Group group5 = new Group();
		group5.id = 5;
		group5.name = "Liverpool FC";
		group5.creator = account1;
		group5.CreateDate = LocalDate.of(2018, 8, 8);

		Group[] groupOfAccount1 = { group1, group2 };
		account1.groups = groupOfAccount1;

		Group[] groupOfAccount2 = { group2, group4 };
		account2.groups = groupOfAccount2;

		Group[] groupOfAccount3 = { group5 };
		account3.groups = groupOfAccount3;

		Group[] groupOfAccount4 = { group3 };
		account4.groups = groupOfAccount4;

		Account[] accountOfGroup1 = { account1, account2 };
		group1.accounts = accountOfGroup1;

		Account[] accountOfGroup2 = { account1, account3 };
		group2.accounts = accountOfGroup2;

		Account[] accountOfGroup3 = { account2, account3 };
		group3.accounts = accountOfGroup3;

		// Create TypeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.typeName = TypeName.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.typeName = TypeName.MULTIPLE_CHOICE;

		// CateGoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = "C++";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = "Javascript";

		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = "C#";

		CategoryQuestion categoryQuestion5 = new CategoryQuestion();
		categoryQuestion5.id = 5;
		categoryQuestion5.name = "Python";

		// Create Question
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Câu hỏi về Java!";
		question1.categoryQuestion = categoryQuestion1;
		question1.typeQuestion = typeQuestion1;
		question1.creator = account1;
		question1.createDate = LocalDate.of(2012, 1, 1);

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Câu hỏi về C++!";
		question2.categoryQuestion = categoryQuestion2;
		question2.typeQuestion = typeQuestion2;
		question2.creator = account2;
		question2.createDate = LocalDate.of(2012, 2, 10);

		Question question3 = new Question();
		question3.id = 3;
		question3.content = "Câu hỏi về Javascript!";
		question3.categoryQuestion = categoryQuestion3;
		question3.typeQuestion = typeQuestion1;
		question3.creator = account3;
		question3.createDate = LocalDate.of(2012, 11, 11);

		Question question4 = new Question();
		question4.id = 4;
		question4.content = "Câu hỏi về Python!";
		question4.categoryQuestion = categoryQuestion5;
		question4.typeQuestion = typeQuestion1;
		question4.creator = account4;
		question4.createDate = LocalDate.of(2012, 10, 10);

		// Create Answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "Câu trả lời 1!";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "Câu trả lời 2!";
		answer2.question = question2;
		answer2.isCorrect = true;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "Câu trả lời 3!";
		answer3.question = question1;
		answer3.isCorrect = false;

		Answer answer4 = new Answer();
		answer4.id = 4;
		answer4.content = "Câu trả lời 4!";
		answer4.question = question1;
		answer4.isCorrect = false;

		// Create Exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "IT1";
		exam1.title = "Đề thi IT1 Java!";
		exam1.categoryQuestion = categoryQuestion1;
		exam1.duration = 120;
		exam1.creator = account1;
		exam1.createDate = LocalDate.of(1999, 11, 11);

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "IT2";
		exam2.title = "Đề thi IT1 Javascript!";
		exam2.categoryQuestion = categoryQuestion2;
		exam2.duration = 120;
		exam2.creator = account2;
		exam2.createDate = LocalDate.of(1996, 10, 10);

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "IT3";
		exam3.title = "Đề thi IT1 Python!";
		exam3.categoryQuestion = categoryQuestion3;
		exam3.duration = 120;
		exam3.creator = account2;
		exam3.createDate = LocalDate.of(1998, 9, 9);

		Question[] questionsOfExam1 = { question1, question2, question3 };
		exam1.questions = questionsOfExam1;

		Question[] questionsOfExam2 = { question2, question3, question4 };
		exam2.questions = questionsOfExam2;

		Question[] questionsOfExam3 = { question1, question2, question4 };
		exam3.questions = questionsOfExam3;

		Exam[] ExamOfQuestions1 = { exam1, exam2 };
		question1.exams = ExamOfQuestions1;

		Exam[] ExamOfQuestions2 = { exam2, exam3 };
		question2.exams = ExamOfQuestions2;

		Exam[] ExamOfQuestions3 = { exam1, exam3 };
		question3.exams = ExamOfQuestions3;

//		// Question 1
//		if (account2.department == null) {
//			System.out.println("Nhân viên chưa có phòng ban!");
//		} else {
//			System.out.println("Nhân viên này thuộc phòng ban " + account2.department.name);
//		}

//		// Question 2
//		if (account2.groups == null) {
//			System.out.println("Nhân viên này chưa có group!.");
//		} else if (account2.groups.length == 1) {
//			System.out.println("Nhân viên này thuộc team " + account2.groups[0].name);
//		} else if (account2.groups.length == 2) {
//			System.out.println("Nhân viên này thuộc team " + account2.groups[0].name + ", " + account2.groups[1].name);
//		} else if (account2.groups.length == 3) {
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group " + account2.groups[0].name
//					+ ", " + account2.groups[1].name + ", " + account2.groups[2].name);
//		} else {
//			System.out.println("Nhân viên này là người hóng chuyện!");
//		}

//		// Question 3
//		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
//				: "Nhân viên này thuộc phòng ban: " + account2.department.name);

//		// Question 4
//		System.out.println(account1.position.equals("Dev") ? "Đây là Developer" : "Người này không phải là Developer");

//		// Question 5
//		int x = group1.accounts.length;
//		switch (x) {
//		case 1:
//			System.out.println("Nhóm có 1 thành viên !");
//			break;
//		case 2:
//			System.out.println("Nhóm có 2 thành viên !");
//			break;
//		case 3:
//			System.out.println("Nhóm có 3 thành viên !");
//			break;
//		default:
//			System.out.println("Nhóm có nhiều thành viên !");
//		}

//		// Question 6
//		int y = account2.groups.length;
//		switch (y) {
//		case 0:
//			System.out.println("Nhân viên này chưa có team !");
//			break;
//		case 1:
//			System.out.println("Nhân viên này thuộc team " + account2.groups[0].name);
//			break;
//		case 2:
//			System.out.println(
//					"Nhân viên này thuộc các team " + account2.groups[0].name + ", " + account2.groups[1].name + " !");
//			break;
//		case 3:
//			System.out.println("Nhân viên này thuộc các team " + account2.groups[0].name + ", "
//					+ account2.groups[1].name + account2.groups[2].name + " !");
//			break;
//		default:
//			System.out.println("Nhân viên này là người pro, đá cho nhiều team !");
//		}

//			// Question 7
//			String p = account1.position.name;
//				
//			switch(p) {	
//			case "Dev": 
//				System.out.println("Đây là Developer");
//				break;
//				default:
//					System.out.println("Đây là cầu thủ!");
//			}

//		// Question 8
		Account[] accounts = { account1, account2, account3, account4 };
		for (Account account : accounts) {
			System.out.println("Email: " + account.email);
			System.out.println("Fullname: " + account.fullName);
			System.out.println("Department: " + account.department.name);
			System.out.println("\n");
		}

//		// Question 9
		Department[] departments = { department1, department2, department3, department4 };
//		for (Department department : departments) {
//			System.out.println("ID: " + department.id);
//			System.out.println("Name: " + department.name);
//		}

//		// Question 10
//		for (int i = 0; i < accounts.length; i++) {
//			System.out.println("Account thứ " + (i + 1));
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Fullname: " + accounts[i].fullName);
//			System.out.println("Department: " + accounts[i].department.name);
//		}

//		// Question 11
//		for (int i = 0; i < departments.length; i++) {
//			System.out.println("Thông tin department thứ " + (i + 1));
//			System.out.println("ID: " + departments[i].id);
//			System.out.println("Name: " + departments[i].name);
//		}

//		// Question 12
//		for (int i = 0; i < 2; i++) {
//			System.out.println("Account thứ " + (i + 1));
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Name: " + accounts[i].fullName);
//			System.out.println("Department: " + accounts[i].department.name);
//			System.out.println("\n");
//		}

//		// Question 13
		Group[] groups = { group1, group2, group3, group4, group5 };
//		Account[] accounts = { account1, account2, account3, account4 };
//
//		for (int i = 0; i < accounts.length; i++) {
//			if (i == 1) {
//				continue;
//			} else {
//				System.out.println("Thông tin Account thứ: " + (i + 1));
//				System.out.println("ID: " + accounts[i].id);
//				System.out.println("Fullname: " + accounts[i].fullName);
//				System.out.println("Gender: " + accounts[i].gender);
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Department: " + accounts[i].department.name);
//				System.out.println("Position: " + accounts[i].position.name);
//				for (int j  = 0; j < groups.length; j++) {
//					System.out.println("Group: " + accounts[i].groups[j].name);
//				}
//				System.out.println("\n");
//			}
//		}

//		// Question 14
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i].id < 4) {
//				System.out.println("Thông tin Account thứ: " + (i + 1));
//				System.out.println("ID: " + accounts[i].id);
//				System.out.println("Fullname: " + accounts[i].fullName);
//				System.out.println("Gender: " + accounts[i].gender);
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Department: " + accounts[i].department.name);
//				System.out.println("Position: " + accounts[i].position.name);
//			}
//		}

//		// Question 15
//		for(int i = 0; i <= 20; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i + " ");
//			}
//		}

//		// Question 15
//		int i = 0;
//		while (i <= 20) {
//			if (i % 2 == 0) {
//				System.out.println(i + " ");
//			}
//			i++;
//		}

//		// Question 16.11
//		Department[] departments = { department1, department2, department3, department4 };
//		int i = 0;
//		while (i < departments.length) {
//			System.out.println("Thông tin department thứ " + (i + 1));
//			System.out.println("ID: " + departments[i].id);
//			System.out.println("Name: " + departments[i].name);
//			i++;
//		}

//		// Question 16.12
//		int i = 0;
//		while (i < 2) {
//			System.out.println("Department thứ " + (i + 1));
//			System.out.println("ID: " + departments[i].id);
//			System.out.println("Name: " + departments[i].name);
//			System.out.println("\n");
//			i++;
//		}

		// Question 16.13
//		int i = 0;
//		while (i < accounts.length) {
//			if (i == 1) {
//				i++;
//				continue;
//			}
//			System.out.println("Thông tin Account thứ " + (i + 1));
//			System.out.println("ID: " + accounts[i].id);
//			System.out.println("Fullname: " + accounts[i].fullName);
//			System.out.println("Gender: " + accounts[i].gender);
//			System.out.println("Email: " + accounts[i].email);
//			System.out.println("Department: " + accounts[i].department.name);
//			System.out.println("Position: " + accounts[i].position.name);
//			i++;
//		}

		// Question 16.14
//		int i = 0;
//		while (i < accounts.length) {
//			if (accounts[i].id < 4) {
//				System.out.println("Thông tin Account thứ: " + (i + 1));
//				System.out.println("ID: " + accounts[i].id);
//				System.out.println("Fullname: " + accounts[i].fullName);
//				System.out.println("Gender: " + accounts[i].gender);
//				System.out.println("Email: " + accounts[i].email);
//				System.out.println("Department: " + accounts[i].department.name);
//				System.out.println("Position: " + accounts[i].position.name);
//				i++;
//			}
//		}
	}
}
