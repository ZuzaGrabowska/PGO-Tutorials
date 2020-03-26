import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User uzytkownik1 = new User("Jan", "Kowalski", "jankowalski@email.com", "janek");

        User gosc1 = new User("gosc1@email.com");
        User gosc2 = new User("gosc2@email.com");

        gosc2.zmienKontoGosciaNaKontoUzytkownika("Han", "Solo", "haslo");

        gosc2.Print();

        Product produkt1 = new Product("mleko", 2, "kod1");
        Product produkt2 = new Product("woda", 3, "kod2", 5);
        Product produkt3 = new Product("sok", 5, "kod3", 5);

        produkt1.zmienCene(10);
        produkt1.zmienSztuki(10);

        // Zadanie 3 d.
        Category pustaKategoria = new Category();
        Category nabial = new Category("nabial");

        ArrayList<Product> lista = new ArrayList<>();
        lista.add(produkt2);
        lista.add(produkt3);
        Category napoje = new Category("napoje", lista);

        // Zadanie 4 d.
        Koszyk  koszyk1 = new Koszyk();
        Koszyk  koszyk2 = new Koszyk(gosc1);

        // bez sensu
        ArrayList<Product> produktyWReceUzytkownika = new ArrayList<Product>();
        produktyWReceUzytkownika.add(new Product(produkt1.getNazwa(), produkt1.getCena(), produkt1.getKodProduktu(), 1));
        produktyWReceUzytkownika.add(new Product(produkt2.getNazwa(), produkt2.getCena(), produkt2.getKodProduktu(), 1));
        Koszyk  koszyk3 = new Koszyk(uzytkownik1, produktyWReceUzytkownika);


        koszyk1.dodajProdukt(produkt1, 1 );
        koszyk1.dodajProdukt(produkt3, 3 );
        koszyk1.usunProdukt(produkt3);
        koszyk1.zaplac();

        koszyk2.dodajProdukt(produkt1,1);
        koszyk2.dodajProdukt(produkt2,1);
        koszyk2.zaplac();


    }
}
