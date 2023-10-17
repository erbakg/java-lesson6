package lesson6_2;

public class Animal {
    private int age;
    private Color color;

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String info() {
        return "AGE: " + this.age
                + " COLOR: " + this.color.getCode() + this.color + "\u001B[0m";
    }
}
