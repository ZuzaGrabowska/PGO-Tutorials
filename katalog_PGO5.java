public class katalog implements ZarzadzaniePozycjami {

    private String dzialTematyczny;
    List<Position> pozycje = new ArrayList<Position>();
    public katalog(String dzialTematyczny)
        this.dzialTematyczny = dzialTematyczny;

    public void dodajPozycje(Pozycje) {
        dodajPozycje(pozycje);
    }
    public znajdzPozycjePoTytule(String tytul) {
        for (Pozycje : pozycje) {
                System.out.println(element.toString());
            }
        }
        return null;
    }
    public pozycje znajdzPozycjePoID(int id) {
        for (Pozycje : pozycje) {
            if (element.id == id) {
                System.out.println(element.toString());
            }
        }
        return null;
    }
    public void WypiszWszystkiePozycje() {
        for (Pozycje : pozycje) {
            System.out.println(element.toString());
        }
    }
}
