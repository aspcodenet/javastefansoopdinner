import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Person> middagsBord = new ArrayList<>();

        Person stefan = new Person();
        stefan.setName("Stefan");
        stefan.setLevel(1);
        middagsBord.add(stefan);

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
            }
        }

 
    }
}
