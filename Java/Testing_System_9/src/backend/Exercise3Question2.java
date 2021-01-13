package backend;

import entity.Car;


public class Exercise3Question2 {

    public static void main(String[] args) {
        Question2();
    }
    public static void Question2(){
        Car car = new Car("Mazda", "8WD");
        Car.Engine engine = car.new Engine();

        engine.setEngineType("Crysler");

        car.setEngine(engine);

        car.printInfoCar();
    }
}
