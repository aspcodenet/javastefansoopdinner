import java.util.Random;

public class Cat extends GameObject {
    public Cat(String name){
        super(name);
    }

    @Override
    public void act() {
        String[] actions = {"jamar", "är sur", "vill gå ut"};

        int rnd = new Random().nextInt(actions.length);

        String selectedAction = actions[rnd];
        System.out.println( getName() + " " + selectedAction);

    }
    
}
