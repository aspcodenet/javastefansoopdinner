import java.util.Random;

public class Person extends GameObject {
    private  int level;

    public Person(String name){
        super(name);
        level = 1;
    }

    private String lastAction = "";
    private String secondLastAction = "";
    //private int antalBurpsInARow = 0;
    public void mightLevelUp(){
        // if(antalBurpsInARow == 2){
        //     level++;
        // }
        if(lastAction.equals("rapar") && secondLastAction.equals("rapar")){
            level++;
        }
    }

    public void act(){
        String[] actions = {"äter", "rapar", "pratar", "dricker"};

        int rnd = new Random().nextInt(actions.length);

        String selectedAction = actions[rnd];
        // if(selectedAction.equals("rapar")){
        //     antalBurpsInARow++;
        // }else{
        //     antalBurpsInARow = 0;
        // }
        secondLastAction=lastAction;
        lastAction = selectedAction;

        System.out.println( getName() + " " + selectedAction);
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        if(level < 0 || level > 100){
            throw new IllegalArgumentException("Felaktigt värde");
        }
        this.level = level;
    }

}
