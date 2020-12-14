import java.time.LocalDate;

public class Exam {
	int id;
	int duration;
	String code;
	String title;
	CategoryQuestion[] categoryQuestions;
	CategoryQuestion categoryQuestion;
	Account creator;
	LocalDate createDate;
	Question[] questions;
}
