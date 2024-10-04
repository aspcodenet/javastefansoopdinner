import java.util.Random;

public class Fly extends GameObject {
 
    public Fly(String name){
        super(name);
    }

    public void mightLevelUp(){
    }

    public void act(){
        String[] actions = {"flyga runt", "surra", "landa i maten"};

        int rnd = new Random().nextInt(actions.length);

        String selectedAction = actions[rnd];
        System.out.println( getName() + " " + selectedAction);
    }

 
      
}
