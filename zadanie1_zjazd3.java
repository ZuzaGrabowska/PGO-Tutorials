import java.util.ArrayList;

public class zadanie1_zjazd3 {

    public static void wypisz(String nazwa) {
        System.out.println("Pierwszy znak słowa: " + nazwa.charAt(0));

    }

    public static void wypisz(String slowo1, String slowo2) {
        System.out.println("Pierwszy znak pierwszego słowa: " + slowo1.charAt(0));
        System.out.println("Ostatni znak drugiego słowa: " + slowo2.charAt(slowo2.length()-1));
    }
}
