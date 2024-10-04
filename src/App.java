import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Product kaffe = new Product();
        kaffe.setName("Kaffe");
        kaffe.setPrice(100);

        Product daim = new Product();
        daim.setName("Daim");
        daim.setPrice(5);



        // HEJ HEJ
        //test
        ArrayList<GameObject> middagsBord = new ArrayList<>();

        Person stefan = new Person("Stefan");
        stefan.setLevel(1);
        middagsBord.add(stefan);


        Person kerstin = new Person("Kerstin");
        middagsBord.add(kerstin);

        Person o = new Person("Oliver");
        middagsBord.add(o);

        Fly f = new Fly("Den lilla flugan");
        middagsBord.add(f);

        for(GameObject  gameObject : middagsBord){
            gameObject.act();
            gameObject.mightLevelUp();
           //System.out.println(gameObject.getName());
        }

        System.out.println("Hej"); 

        // while(true){
        //     for (Person person : middagsBord) {
        //         person.act();
        //         person.mightLevelUp();
        //     }
        //     for (Person person : middagsBord) {
        //         System.out.println(person.getName() + " " + person.getLevel() );
        //     }
        //     System.out.println("Tryck enter för nästa omgång i spelet");
        //     System.console().readLine();
        // }

 
    }
}
