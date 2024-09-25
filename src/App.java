import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Person> middagsBord = new ArrayList<>();

        Person stefan = new Person();
        stefan.setName("Stefan");
        stefan.setLevel(1);
        middagsBord.add(stefan);

        stefan.act();
        stefan.act();
        stefan.act();


        Person kerstin = new Person();
        kerstin.setName("Kerstin");
        kerstin.setLevel(1);
        middagsBord.add(kerstin);

        Person o = new Person();
        o.setName("Oliver");
        o.setLevel(1);
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
