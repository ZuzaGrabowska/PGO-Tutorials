public class biblioteka {

    private String adres;

    static List<bibliotekarz> bibliotekarzList = new ArrayList<bibliotekarz>();
    static List<katalog> katalogList = new ArrayList<katalog>();

    public biblioteka(String adres) {
        this.adres = adres;

    public static void Add bibliotekarz(bibliotekarzList) {

        bibliotekarz.add(bibliotekarz);
    }
    public static void wypiszBibliotekarzy() {

        System.out.println("Lista Bibliotekarzy");
        System.out.println(bibliotekarz.toString());
    }
    public static void Addkatalog(katalogList) {
        if (katalog != null) {
            katalog.add(katalog);
        }
    }
    public static void AddPosition(Position position, String subject_department, Catalog catalog) {
        catalog.AddPosition(position);
    }
    public static Position FindPositionByTitle(String title) {

        for (Catalog catalog : Catalogs) {
            for (Position position : catalog.positions) {
                if (position.title.contains(title)) {
                    System.out.println(position.toString());
                }
            }
        }
        return null
    }
    public static pozycje znajdzPozycjePoID(int id) {

        for (katalog : katalog) {
                if (pozycje.id == id) {
                    System.out.println(pozycje.toString());
                }
            }
        return null
    }
}
