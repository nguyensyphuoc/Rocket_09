package backend;

import entity.MyMath;
import entity.MyNumber;
import entity.Salary;

public class Exercise1 {
    public void Question1() {
        Salary<Integer> salary = new Salary<>(5000);
        System.out.println(salary);
    }

    public void Question2(){
        MyNumber<Double> number = new MyNumber<>(123456.123);
        System.out.println(number);
    }

    public void Question3(){
        MyMath<Integer> math = new MyMath<>();

        int max = math.maximum(2, 3, 4);
        System.out.println(max);
        float maxFloat = math.maximum(2.0f, 3.0f, 4.0f);
        System.out.println(maxFloat);
    }

    public void Question4(){
        MyMath<Integer> mathInt = new MyMath<>();
        MyMath<Float> mathFloat = new MyMath<>();

        // sum
        int sumInt = mathInt.add(2, 3);
        System.out.println(sumInt);

        int sumInt1 = mathInt.add(2, 3, 4);
        System.out.println(sumInt1);
    }
}
