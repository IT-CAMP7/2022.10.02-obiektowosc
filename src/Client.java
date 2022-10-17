public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    Client() {
    }

    Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Client(String name, String surname, int age, long pesel) {
        this(name, surname);
        this.age = age;
        this.pesel = pesel;
    }

    Client(String name,
           String surname,
           int age,
           long pesel,
           String street,
           String city,
           int no,
           String postCode) {
        this(name, surname, age, pesel);

        this.address = new Address(street, city, no, postCode);
    }

    int add(int a, int b) {
        a = a + 8;
        System.out.println(a);
        int result;
        result = a+b;
        return result;
    }

    int add(double a, double b) {
        return 4;
    }

    /*double add(double a, double b) {
        return 4;
    }*/

    void addProcedur(int a, int b) {
        System.out.println(a+b);
    }

    void jakasTrudnaMetoda(ArgumentWrapper wrapper) {
        System.out.println(wrapper.a);
        System.out.println(wrapper.b);
        System.out.println(wrapper.c);
        System.out.println(wrapper.d);
        System.out.println(wrapper.e);
        System.out.println(wrapper.f);
        wrapper.a = 20;
    }

    void powiedzImie() {
        System.out.println(this.name);
    }
}
