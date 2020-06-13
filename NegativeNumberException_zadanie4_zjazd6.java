package zadanie4;
import java.util.Arrays;
import java.util.Scanner;

public  class NegativeNumberException {

    static int[] tablica = new int[10];
    static int number;
    static Scanner object = new Scanner(System.in);

    public static int ReadNumber() throws ArithmeticException {
       
              number = object.nextInt();
           
        if (number < 0) {
            throw new ArithmeticException("Negative numbers are not allowed");
                                  
           } else {
          return number;
        }
    }
    public static void fillArray()  {
          for (int i = 0; i<=tablica.length; i++){
    try {
           tablica[i] += ReadNumber();
           System.out.print(Arrays.toString(tablica));
            }
         catch (ArithmeticException e)  {
           e.printStackTrace();
           System.out.println("replaced by 0");
          tablica[i] = 0;
          continue;
         } 
        }
      }
  }