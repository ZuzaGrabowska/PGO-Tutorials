public class pozycja {

    private String tytul;
    private int id;
    private String wydawca;
    private int dataWydania;

    public pozycja(String tytul, int id, String wydawca, int dataWydania) {
        this.tytul = tytul;
        this.id = id;
        this.wydawca = wydawca;
        this.dataWydania = dataWydania;
    }
    public String toString() {
        return "Tytuł: " +  tytul + " id: " + id + " Wydawca: " + wydawca + " Data wydania: " + dataWydania;
    }
}


    
