import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Create department
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

		System.out.println("= = = = = = = = List request = = = = = = =");
		System.out.println("1: in ra thông tin các department.");
		System.out.println("2: in ra thông tin các position.");
		System.out.println("3: in ra thông tin các accounts.");
		System.out.println("4: in ra thông tin các type question.");
		System.out.println("5: in ra thông tin các category question.");
		System.out.println("6: in ra thông tin các question.");
		System.out.println("7: in ra thông tin các answers.");
		System.out.println("8: in ra thông tin các exams.");

		System.out.print("Nhập lựa chọn: ");
		int luaChon = sc.nextInt();
		
		switch (luaChon) {
		case 1:
			// print department
			System.out.println("*	*	*Thông tin Department 1*	*	*");
			System.out.println("Department ID: " + department1.id);
			System.out.println("Department Name: " + department1.name);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Department 2*	*	*");
			System.out.println("Department ID: " + department2.id);
			System.out.println("Department Name: " + department2.name);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Department 3*	*	*");
			System.out.println("Department ID: " + department3.id);
			System.out.println("Department Name: " + department3.name);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Department 4*	*	*");
			System.out.println("Department ID: " + department4.id);
			System.out.println("Department Name: " + department4.name);
			System.out.println("\n");
			break;
		case 2:

			// print position
			System.out.println("*	*	*Thông tin Position 1*	*	*");
			System.out.println("Position ID: " + position1.id);
			System.out.println("Position Name: " + position1.name);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Position 2*	*	*");
			System.out.println("Position ID: " + position2.id);
			System.out.println("Position Name: " + position2.name);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Position 3*	*	*");
			System.out.println("Position ID: " + position3.id);
			System.out.println("Position Name: " + position3.name);
			System.out.println("\n");
			break;
		case 3:
			// print account
			System.out.println("*	*	*Thông tin Account 1*	*	*");
			System.out.println("Account ID: " + account1.id);
			System.out.println("Account Name: " + account1.fullName);
			System.out.println("Account Gender: " + account1.gender);
			System.out.println("Account User: " + account1.userName);
			System.out.println("Account email: " + account1.email);
			System.out.println("Account Department: " + account1.department.name);
			System.out.println("Account Position: " + account1.position.name);
			System.out.println("Account CreateDate: " + account1.createDate);
			System.out.println("List group of Account 1");
			for (int i = 0; i < account1.groups.length; i++) {
				System.out.println(account1.groups[i].name);
			}
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Account 2*	*	*");
			System.out.println("Account ID: " + account2.id);
			System.out.println("Account Name: " + account2.fullName);
			System.out.println("Account Gender: " + account2.gender);
			System.out.println("Account User: " + account2.userName);
			System.out.println("Account email: " + account2.email);
			System.out.println("Account Department: " + account2.department.name);
			System.out.println("Account Position: " + account2.position.name);
			System.out.println("Account CreateDate: " + account2.createDate);
			System.out.println("List group of Account 2");
			for (int i = 0; i < account2.groups.length; i++) {
				System.out.println(account2.groups[i].name);
			}
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Account 3*	*	*");
			System.out.println("Account ID: " + account3.id);
			System.out.println("Account Name: " + account3.fullName);
			System.out.println("Account Gender: " + account3.gender);
			System.out.println("Account User: " + account3.userName);
			System.out.println("Account email: " + account3.email);
			System.out.println("Account Department: " + account3.department.name);
			System.out.println("Account Position: " + account3.position.name);
			System.out.println("Account CreateDate: " + account3.createDate);
			System.out.println("List group of Account 1");
			for (int i = 0; i < account3.groups.length; i++) {
				System.out.println(account3.groups[i].name);
			}
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Account 4*	*	*");
			System.out.println("Account ID: " + account4.id);
			System.out.println("Account Name: " + account4.fullName);
			System.out.println("Account Gender: " + account4.gender);
			System.out.println("Account User: " + account4.userName);
			System.out.println("Account email: " + account4.email);
			System.out.println("Account Department: " + account4.department.name);
			System.out.println("Account Position: " + account4.position.name);
			System.out.println("Account CreateDate: " + account4.createDate);
			System.out.println("List group of Account 1");
			for (int i = 0; i < account4.groups.length; i++) {
				System.out.println(account4.groups[i].name);
			}
			System.out.println("\n");
			break;
		case 4:
			// print type question
			System.out.println("*	*	*Thông tin Type Question1*	*	*");
			System.out.println("Type Question ID: " + typeQuestion1.id);
			System.out.println("Type Question Name: " + typeQuestion1.typeName);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Type Question2*	*	*");
			System.out.println("Type Question ID: " + typeQuestion2.id);
			System.out.println("Type Question Name: " + typeQuestion2.typeName);
			System.out.println("\n");
			break;
		case 5:

			// print Category Question
			System.out.println("*	*	*Thông tin Category Question 1*		*	*");
			System.out.println("Category Question ID: " + categoryQuestion1.id);
			System.out.println("Category Question Name: " + categoryQuestion1.name);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Category Question 2*		*	*");
			System.out.println("Category Question ID: " + categoryQuestion2.id);
			System.out.println("Category Question Name: " + categoryQuestion2.name);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Category Question 3*		*	*");
			System.out.println("Category Question ID: " + categoryQuestion3.id);
			System.out.println("Category Question Name: " + categoryQuestion3.name);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Category Question 4*		*	*");
			System.out.println("Category Question ID: " + categoryQuestion4.id);
			System.out.println("Category Question Name: " + categoryQuestion4.name);
			System.out.println("\n");
			break;
		case 6:
			// print question
			System.out.println("*	*	*Thông tin Question 1*	*	*");
			System.out.println("Question ID: " + question1.id);
			System.out.println("Question content: " + question1.content);
			System.out.println("Question creator: " + question1.creator.fullName);
			System.out.println("Question createDate: " + question1.createDate);
			System.out.println("Category Question: " + question1.categoryQuestion.name);
			System.out.println("Type Question: " + question1.typeQuestion.typeName);
			for (int i = 0; i < question1.exams.length; i++) {
				System.out.println(question1.exams[i].title);
			}
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Question 2*	*	*");
			System.out.println("Question ID: " + question2.id);
			System.out.println("Question content: " + question2.content);
			System.out.println("Question creator: " + question2.creator.fullName);
			System.out.println("Question createDate: " + question2.createDate);
			System.out.println("Category Question: " + question2.categoryQuestion.name);
			System.out.println("Type Question: " + question2.typeQuestion.typeName);
			for (int i = 0; i < question2.exams.length; i++) {
				System.out.println(question2.exams[i].title);
			}
			System.out.println("\n");
			break;

		case 7:

			// print Answer
			System.out.println("*	*	*Thông tin Answer1*		*	 *");
			System.out.println("Answer ID: " + answer1.id);
			System.out.println("Answer content: " + answer1.content);
			System.out.println("Answer question: " + answer1.question.content);
			System.out.println("Answer correct: " + answer1.isCorrect);
			break;

		case 8:
			// print Exam
			System.out.println("*	*	*Thông tin Exam1*	*	*");
			System.out.println("Exam ID: " + exam1.id);
			System.out.println("Exam Code: " + exam1.code);
			System.out.println("Exam Name: " + exam1.title);
			System.out.println("List question in Exam");
			for (int i = 0; i < exam1.questions.length; i++) {
				System.out.println(exam1.questions[i].content);
			}
			System.out.println("Exam duration: " + exam1.duration);
			System.out.println("Create Date: " + exam1.createDate);
			System.out.println("Creator: " + exam1.creator.fullName);
			System.out.println("\n");

			System.out.println("*	*	*Thông tin Exam2*	*	*");
			System.out.println("Exam ID: " + exam2.id);
			System.out.println("Exam Code: " + exam2.code);
			System.out.println("Exam Name: " + exam2.title);
			System.out.println("List question in Exam");
			for (int i = 0; i < exam2.questions.length; i++) {
				System.out.println(exam2.questions[i].content);
			}
			System.out.println("Exam duration: " + exam2.duration);
			System.out.println("Create Date: " + exam2.createDate);
			System.out.println("Creator: " + exam2.creator.fullName);
			break;

		default:
			System.out.println("Chưa nhập lựa chọn! xin chào!");
		}
		sc.close();
	}
}
