package zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car implements Comparable<Car> {
    int publish_year;
    public static List<Car> cars = new ArrayList<Car>();

    public Car(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }
    @Override
    public String toString(){
        return model + productionYear;
    }

    public static void AddCar(Car) {
        cars.add(Car);
    }
	public int compareTo(Car o) {
        if (publish_year == o.productionYear){
            return 0;
        }
        else if (productionYear > o.productionYear){
            return 1;
        }
        else
		return -1;
    }
    public static void loop(){
        Collections.sort(cars);
        for (Car o : cars) {
            System.out.println(o);
        }
    }


	

   




   




}