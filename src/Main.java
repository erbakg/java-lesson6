public class Main {
    public static void main(String[] args) {

        System.out.println(Car.counter);
        System.out.println("Total Fuel = " + Car.get_fuel_amount());

        Car c1 = new Car(2000, "Nissan Patrol");
        Car c2 = new Car(2011, "Toyota Ist");

        c1.makeSignal();
        c2.makeSignal();
        System.out.println(Car.counter);
        // Car.total_fuel -= 100;
        System.out.println("Total Fuel = " + Car.get_fuel_amount());

        Car.fill_fuel(500);
        System.out.println("Total Fuel = " + Car.get_fuel_amount());
    }
}
