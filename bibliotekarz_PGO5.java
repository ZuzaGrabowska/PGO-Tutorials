public class bibliotekarz extends osoba  {

    private String dataZatrudnienia;
    private double wynagrodzenie;

    public bibliotekarz(String imie, String nazwisko, StringdataZatrudnienia, double wynagrodzenie) {
        super(imie, nazwisko);
        this.dataZatrudnienia = dataZatrudnienia;
        this.wynagrodzenie = wynagrodzenie;
    }
    public String toString() {
        return "Imie: " + imie + " Nazwisko: " + nazwisko + " Data Zatrudnienia: " + dataZatrudnienia + " Wynagrodzenie: " +  wynagrodzenie;
    }