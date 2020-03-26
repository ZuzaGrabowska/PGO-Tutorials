public class User {

    private String imie;
    private String nazwisko;
    private String email;
    private String haslo;
    private boolean gosc;

    User(String imie, String nazwisko, String email, String haslo) {
        if (imie == null || nazwisko == null || email == null || haslo == null) {
            throw new IllegalArgumentException("Imie, nazwisko, email oraz haslo musza byc podane");
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.haslo = haslo;
        this.gosc = false;
    }

    User(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Adres mailowy musi byc podany");
        }
        this.email = email;
        this.gosc = true;
    }

    void zmienKontoGosciaNaKontoUzytkownika(String imie, String nazwisko, String haslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.haslo = haslo;
        this.gosc = false;
    }

    void Print(){
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(email);
        System.out.println(haslo);
    }
}
