public class App2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Reksio";
        dog1.race = "Kundel";

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
    }
}
