package zadanie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Item {
    String name;
     int id;

    static public List<Item> items = new ArrayList<Item>();
    static HashMap<Integer, String> mapOfItems = new HashMap<Integer,String>();
    

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public  String Show() {
        return this.name;
    }
    public static void  AddItem(Item item ) {
        items.add(item);
    }
    public static void GetItem(){
      for (int i = 0; i < items.size(); i++){
          System.out.print(items.get(i).Show());
      }
        }
        for (Item o : items){
          mapOfItems.put(o.id, o.name);
        }
        System.out.print(mapOfItems.entrySet());
    }
    public  String toString(){
        return this.name + " " + this.id;
    }
}

       




    




    
