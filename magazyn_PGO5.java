public class magazyn extends pozycja {

    public magazyn(int numer, String tytul, int id, String wydawca, int dataWydania) {
        super(tytul, id, wydawca, dataWydania);
        this.numer = numer;
}
}