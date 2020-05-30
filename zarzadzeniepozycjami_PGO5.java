public interface IZarzadzaniePozycjami {

    Pozycja znajdzPozycjePoTytule(String tytul);
    
    Pozycja znajdzPozycjePoID(int id);

    void wypiszWszystkiePozycje();
}