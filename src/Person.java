import java.util.Random;

public class Person {
    private String name;
    private  int level;

    public void act(){
        String[] actions = {"äter", "rapar", "pratar", "dricker"};

        int rnd = new Random().nextInt(actions.length);

        String selectedAction = actions[rnd];

        System.out.println( name + " " + selectedAction);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

}
