package zadanie_2;

public class Add {
    public static void dodaj(int jeden, long dwa){
        System.out.println("Suma dwóch liczb to: " + (jeden + Math.toIntExact(dwa)));
    }

    public static void dodaj(int trzy, int cztery, long piec){
        System.out.println("Suma 3 liczb to: " + (trzy + cztery + Math.toIntExact(piec)));
    }

    public static void dodaj(int szesc, int siedem, long osiem, long dziewiec){
        System.out.println("Suma 4 liczb to: " + (szesc + siedem + Math.toIntExact(osiem) + Math.toIntExact(dziewiec)));
    }
}
