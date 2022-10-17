public class App3 {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Mateusz";
        client.surname = "Bereda";

        Client client2 = new Client("Janusz", "Kowalski",
                30, 87685L);

        System.out.println(client2.name);
        System.out.println(client2.surname);
        System.out.println(client2.age);
        System.out.println(client2.pesel);

        Client client3 = new Client("Imie", "Nazwisko",
                33, 324234L, "Ulica", "Miasto",
                31, "Kod");


    }
}
