import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // HEJ HEJ
        //test
        ArrayList<Person> middagsBord = new ArrayList<>();

        Person stefan = new Person("Stefan");
        stefan.setLevel(-10);
        middagsBord.add(stefan);


        Person kerstin = new Person("Kerstin");
        middagsBord.add(kerstin);

        Person o = new Person("Oliver");
        middagsBord.add(o);


        while(true){
            for (Person person : middagsBord) {
                person.act();
                person.mightLevelUp();
            }
            for (Person person : middagsBord) {
                System.out.println(person.getName() + " " + person.getLevel() );
            }
            System.out.println("Tryck enter för nästa omgång i spelet");
            System.console().readLine();
        }

 
    }
}
