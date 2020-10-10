import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        Car car1 = new Car("Volvo", 10);
        Car car2 = new Car("Mercedes", 12.5);
        Car car3 = new Car("Lada", 15);

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));

        System.out.printf("\n%s\n%s\n%s\n", car1, car2, car3);

        Engine engine1 = new Engine("B6", 145, 52);
        Engine engine2 = new Engine("V4", 205, 72);
        Engine engine3 = new Engine("C12", 175, 62);

        System.out.printf("\n%s\n%s\n%s\n", engine1, engine2, engine3);

        Bus bus1 = new Bus("BMW", 17.2, 15);
        Bus bus2 = new Bus("Lada", 18.5, 17);
        Bus bus3 = new Bus("Acura", 15.6, 19);

        System.out.printf("\n%s\n%s\n%s\n\n", bus1, bus2, bus3);

        ArrayList<String> list = new ArrayList<>();
        list.add(String.valueOf(car1));
        list.add(String.valueOf(car2));
        list.add(String.valueOf(car3));
        list.add(String.valueOf(bus1));
        list.add(String.valueOf(bus2));
        list.add(String.valueOf(bus3));
        list.remove(1); // remove Mercedes
        Collections.sort(list);
        for (String car : list) {
            System.out.println(car);
            if (car.contains("BMW")){
                System.out.println(car + "Найден");
            }
        }
    }
}
