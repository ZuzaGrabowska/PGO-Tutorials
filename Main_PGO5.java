class aplikacja {
	public static void main(String[] args) {
		{
			ksiazka RodzajeCementow = new ksiazka(548, "Rodzaje Cementów w Budownictwie", 33, "Czesław Budowniczy", 2005);
			ksiazka.autor CzeslawBudowniczy = new ksiazka.autor("Czeslaw", "Budowniczy", "Architektura");
			katalog cat = newkatalog("Literatura naukowa");
			kat.AddPozycje(cementy);

			cat.znajdzPozycjePoTytule("Rodzaje cementow w budownictwie");
			cat.znajdzPozycjePoID(21);
			cat.wyswietlWszystkiePozycje();

			bibliotekarz bibliotekarznr1 = new bibliotekarz("Albert", "Kunze", "21.03.2007", 2005);
			bibliotekarz.AddBibliotekarz(bibliotekarznr1);
			biblioteka.wyswietlBibliotekarzy();
			
			katalog catnr2 = new katalog("Lingwistyka");
			ksiazka KategorieGramatyczne = new ksiazka(213, "Kategorie Gramatyczne w Języku Norweskim", 721, 2013);
			biblioteka.AddKatalog(catnr2);
			Biblioteka.AddPozycje(KategorieGramatyczne, "Lingwistyka", catnr2);

			System.out.println("Poszukaj poprzez wpisanie tytułu");
			Biblioteka.znajdzPozycjePoTytule("Kategorie Gramatycczne w Języku Norweskim");
			System.out.println("Poszukaj poprzez wppisanie ID");
			Biblioteka.znajdzPozycjePoID(14);
			System.out.println("Wszystkie pozycje");
			biblioteka.wypiszWszystkiePozycje();
		}
	}
}