import java.util.ArrayList;

public class Koszyk {

    ArrayList<Product> listaProduktow = new ArrayList<>();
    User kontoUzytkownika;

    // nie podając żadnych parametrów
    public Koszyk() {
    }

    // podając konto użytkownika
    public Koszyk(User kontoUzytkownika) {
        this.kontoUzytkownika = kontoUzytkownika;
    }

    // podając konto i listę
    public Koszyk(User kontoUzytkownika, ArrayList<Product> listaProduktow) {
        this.listaProduktow = listaProduktow;
        this.kontoUzytkownika = kontoUzytkownika;
    }

    public void dodajUzytkownika(User kontoUzytkownika) {
        this.kontoUzytkownika = kontoUzytkownika;
    }

    public void dodajProdukt(Product product, int liczbaSztuk) {
        if (liczbaSztuk > product.getLiczbaSztuk()) {
            throw new IllegalArgumentException("Liczba sztuk nie może być większa niż liczba na stanie!");
        } else {
            this.listaProduktow.add(new Product(product.getNazwa(), product.getCena(), product.getKodProduktu(), liczbaSztuk));
            product.zmienSztuki(product.getLiczbaSztuk() - liczbaSztuk);
        }
    }

    public void usunProdukt(Product product) {
        this.listaProduktow.remove(product);
    }

    public void zaplac() {
        System.out.println("========== Zawartosc koszyka: ==========");

        for (Product product : listaProduktow) {
            System.out.println(product.getNazwa() + ": \t sztuk: " + product.getLiczbaSztuk() + "\t należność: " + product.getLiczbaSztuk() * product.getCena());
        }

        System.out.println("========================================");
        System.out.println();
    }

}
