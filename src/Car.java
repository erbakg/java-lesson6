public class Car {
    private int year;
    private String model;
    public static int counter;
    private static int total_fuel = 1000;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
        counter++;
        Car.total_fuel -= 50;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void makeSignal() {
        System.out.println("Beeep");
    }

    public static int get_fuel_amount() {
        return Car.total_fuel;
    }

    public static void fill_fuel(int amount) {
        Car.total_fuel += amount;
        // System.out.println(this.model);
    }

}
