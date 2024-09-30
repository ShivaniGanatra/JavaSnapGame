package src;

public class Player {
    private String name;
    private int number;

    public Player(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Player {" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

}
