public class ksiazka extends pozycja {

    private static int numerStrony;
    List <autor> autor = new ArrayList<Author>;

    public ksiazka(int numerStrony, String tytul, int id, String wydawca, int dataPublikacji) {
        super(tytul, id, wydawca, dataPublikacji);
        this.numerStrony = numerStrony;
    }
    public static class autor extends osoba {
        private static String narodowosc;

        public autor(String imie, String nazwisko, String narodowosc) {
            super(imie, nazwisko);
            autor.narodowosc = narodowosc
            ;
        }
    }
    public void Add autor(autor autor) {
        Add(autor);

    }
}