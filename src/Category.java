import java.util.ArrayList;
import java.util.List;

public class Category {
    String nazwa;
    ArrayList<Product> listaProduktow;

    public Category() {
    }

    // podając tylko nazwę
    public Category(String nazwa) {
        this.nazwa = nazwa;
        this.listaProduktow = new ArrayList<Product>();
    }

    // podając oba parametry
    public Category(String nazwa, ArrayList<Product> listaProduktow) {
        this.nazwa = nazwa;
        this.listaProduktow = listaProduktow;
    }

    public void dodajProdukt(Product product){
        this.listaProduktow.add(product);
    }

    public void usunProdukt(Product product){
        this.listaProduktow.remove(product);
    }

}
