package zadania;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import zadanie2.Item;
import zadanie4.NegativeNumberException;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zadanie numer 1 PGO Zjazd 6:");

    Car car1 = new Car("Syrenka ", 1955);
    Car car2 = new Car("Łada ", 1948);
    Car car3 = new Car("Porsche ", 1997);
    Car car4 = new Car("Ford ", 2012);
    Car car5 = new Car("Subaru ", 2009);
    Car car6 = new Car("Skoda ", 1996);
    Car car7 = new Car("Jaguar ", 2014);
    Car car8 = new Car("Opel ", 2018);
    Car car9 = new Car("Renault ", 2001);
    Car car10 = new Car("Citroen ", 2003);
    
    Car.AddCar(car1);
    Car.AddCar(car2);
    Car.AddCar(car3);
    Car.AddCar(car4);
    Car.AddCar(car5);
    Car.AddCar(car6);
    Car.AddCar(car7);
    Car.AddCar(car8);
    Car.AddCar(car9);
    Car.AddCar(car10);
    
    Car.loop();

    System.out.println("Zadanie numer 2 PGO Zjazd 6");

        Item item1 = new Item("Słomka", 35);
        Item item2 = new Item("Blender", 73);
        Item item3 = new Item("Ekspres", 854);
        Item item4 = new Item("Młynek", 734);
        Item item5 = new Item("Kolba", 134);
        Item item6 = new Item("Filiżanka", 56);
        Item item7 = new Item("Kubek", 3);
        Item item8 = new Item("Syrop", 976);
        Item item9 = new Item("Kawa", 2935);
        Item item10 = new Item("Shaker", 53);
    
    
    



        Item.AddItem(item1);
        Item.AddItem(item2);
        Item.AddItem(item3);
        Item.AddItem(item4);
        Item.AddItem(item5);
        Item.AddItem(item6);
        Item.AddItem(item7);
        Item.AddItem(item8);
        Item.AddItem(item9);
        Item.AddItem(item10);

        Item.GetItem();



        System.out.println("Zadanie 4 PGO Zjazd 6");

        System.out.println("test metody ReadNumber");
        NegativeNumberException.ReadNumber();
        System.out.println("Uzupełnianie listy");
        NegativeNumberException.fillArray();

    }
}
