public class App {
    public static void main(String[] args) {
        Client[] clients = new Client[100];

        int a = 5;
        Client k = new Client();
        Client k2 = new Client();

        String b = "ABC";

        k.name = "Janusz";
        k2.name = "Bogdan";

        System.out.println(k.name);
        System.out.println(k2.name);

        k.surname = "Kowalski";
        k.age = 30;
        k.pesel = 234234234L;

        System.out.println(k2.age);
        System.out.println(k2.pesel);
        System.out.println(k2.surname);

        clients[0] = k;
        clients[1] = k2;
        clients[2] = new Client();
        clients[3] = new Client();

        clients[2].name = "Mateusz";

        clients[3].name = "Zbyszek";

        System.out.println(k);
        System.out.println(clients[4]);

        String string = "cos";
        Client client = new Client();

        System.out.println(string);
        System.out.println(client);

        Address address = new Address();
        address.street = "sadfasdf";
        address.city = "asdfasdfasdf";
        address.no = 45;
        address.postCode = "23-234";

        Client panJanusz = new Client();
        panJanusz.name = "Janusz";
        panJanusz.surname = "asdfasdf";
        panJanusz.age = 50;
        panJanusz.pesel = 324523452345L;
        panJanusz.address = address;

        Client panZbyszek = new Client();
        System.out.println(panZbyszek.address);
        panZbyszek.address = new Address();
        panZbyszek.address.street = "Ogrodowa";
    }
}
