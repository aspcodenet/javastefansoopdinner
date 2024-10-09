import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Product kaffe = new Product();
        kaffe.setName("Kaffe");
        kaffe.setPrice(100);

        Product daim = new Product();
        daim.setName("Daim");
        daim.setPrice(5);



        // UPPTÄCKT : 
        // programmering är mer än att lösa ett problem här och nu
        // LÖS PROBLEMET SÅ ATT DET INTE BLIR ANDRA PROBLEM I FRAMTIDEN


        // 1. Vi skriver INTE all kod själva. 
        // dom som bygger en klass måste säkerställa 
        //    valid state (getters/setters/consatructors)
        //    att man inte använder klassen på fel sätt!

        // ABSTRACT = kan inte instansiera
        // abstract class - KAN INTE new:a den
        // abstract method - MÅSTE IMPLEMENTERA VISSA METODER I SUBCLASSEN 

        // FÖR ATT MINSKA RISKEN ATT NÅN PROGRAMMERAR FEL - 

        // @Override betyder INGENTING

        


        // HEJ HEJ
        //test
        ArrayList<GameObject> middagsBord = new ArrayList<>();

        Person stefan = new Person("Stefan");
        stefan.setLevel(1);
        middagsBord.add(stefan);

        Cat cat = new Cat("Musse");
        middagsBord.add(cat);


        // GameObject obj = new GameObject("sdadasasd"); // new Däggdjur
        // middagsBord.add(obj);


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
