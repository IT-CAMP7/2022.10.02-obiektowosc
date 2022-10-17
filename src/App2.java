import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Reksio";
        dog1.race = "Kundel";

        Random random = new Random();

        Dog dog2 = new Dog();
        dog2.name = "Reksio";
        dog2.race = "Kundel";

        int a = 5;
        int b = 5;

        System.out.println(a == b);
        System.out.println(dog1 == dog2);
        System.out.println(dog1.name == dog2.name);

        /*Dog dog3 = new Dog();
        dog3.name = "Max";
        dog3.race = "Owczarek";
        Dog dog4 = dog3;

        System.out.println(dog3 == dog4);

        System.out.println(dog3.name);
        System.out.println(dog4.name);

        dog3.name = "Rex";

        System.out.println(dog3.name);
        System.out.println(dog4.name);*/

        String s1 = "OK";
        System.out.println(s1);


        String s2 = new String("OK");
        System.out.println(s2);

        System.out.println(s1 == s2);

        s2 = s2 + "ABCD";

        System.out.println(s1);
        System.out.println(s2);

        Client client = new Client();
        int wynik = client.add(4,7);
        System.out.println(wynik);
        //int wynik2 = client.addProcedur(3,3);
        System.out.println(client.add(5,5));
        //System.out.println(client.addProcedur(7,7));

        System.out.println("------------------------------");

        ArgumentWrapper argumentWrapper = new ArgumentWrapper();
        argumentWrapper.a = 5;
        argumentWrapper.b = 7;
        argumentWrapper.c = 9;

        System.out.println(argumentWrapper.a);
        System.out.println(argumentWrapper.b);
        System.out.println(argumentWrapper.c);

        client.jakasTrudnaMetoda(argumentWrapper);

        System.out.println(argumentWrapper.a);
        System.out.println(argumentWrapper.b);
        System.out.println(argumentWrapper.c);

        System.out.println("----------------------------");
        int a1 = 5;
        int b1 = 7;

        client.add(a1, b1);
        client.add(1.1, 5.5);

        System.out.println(a1);
        System.out.println(b1);

        client.powiedzImie();

    }
}
