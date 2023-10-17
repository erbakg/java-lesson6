package lesson6_2;

public class Dog extends Animal {
    private String commands;

    public Dog(int age, Color color, String commands) {
        super();
        this.setAge(age);
        this.setColor(color);
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public String info() {
        return super.info() + " COMMANDS: " + this.commands;
    }
}
