import java.time.LocalDate;
import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		
		Random random = new Random();
//		int x = random.nextInt();
//		System.out.println(x);
		
		// Question 2
//		float x = random.nextFloat();
//		System.out.println(x);
		 
		// Question 3
//		String[] names = {"Ronaldo", "Messi", "Neymar", "Ramos", "Salah", "Pogba", "Bale"}; 
//		int i = random.nextInt(names.length);
//		System.out.println(names[i]);
		
		// Question 4
//		int day1 = (int) LocalDate.of(1995, 7, 24).toEpochDay();
//		int day2 = (int) LocalDate.of(1995, 12, 20).toEpochDay();
//		int intRandomDay = day1 + random.nextInt(day2 - day1);
//		LocalDate randomDay = LocalDate.ofEpochDay(intRandomDay);
//		System.out.println(randomDay);
		
		// Question 5
//		int now = (int) LocalDate.now().toEpochDay();
//		int randomInt = now - random.nextInt(365);
//		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
//		System.out.println(randomDay);
		
		// Question 6
//		int now = (int) LocalDate.now().toEpochDay();
//		int randomInt = now - random.nextInt();
//		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
//		System.out.println(randomDay);
		
		// Question 7
		int value = random.nextInt((999 - 100) + 1) + 100;
		System.out.println(value);
				
	}
}