package lesson6_2;

public class FightingDog extends Dog {
    private int wins;

    public FightingDog(int age, Color color, String commands, int wins) {
        super(age, color, commands);
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void fight() {
        System.out.println("Dog " + this.getAge() + " is fighting");
    }

    @Override
    public String info() {
        return super.info() + " WINS: " + this.wins;
    }
}
