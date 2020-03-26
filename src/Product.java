import java.nio.file.NoSuchFileException;

public class Product {

    private String nazwa;
    private double cena;
    private String kodProduktu;
    private int liczbaSztuk;

    // 2.b
    public Product(String nazwa, double cena, String kodProduktu) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kodProduktu = kodProduktu;
        this.liczbaSztuk = 0;
    }

    //2.c - podając wszystkie parametry
    public Product(String nazwa, double cena, String kodProduktu, int liczbaSztuk) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kodProduktu = kodProduktu;
        this.liczbaSztuk = liczbaSztuk;
    }

    public void zmienCene(double cena) {
        this.cena = cena;
    }

    public void zmienSztuki(int inneSztuki) throws IllegalArgumentException {
        if (inneSztuki < 0) {
            throw new IllegalArgumentException("Liczba sztuk nie może być mniejsza niż 0!");
        } else {
            liczbaSztuk = inneSztuki;
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public String getKodProduktu() {
        return kodProduktu;
    }

    public int getLiczbaSztuk() {
        return liczbaSztuk;
    }
}
