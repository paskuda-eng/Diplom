public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 10);
        Car car2 = new Car("Mercedes", 12.5);
        Car car3 = new Car("Lada", 15);

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));
        System.out.printf("\n%s\n%s\n%s\n", car1, car2, car3);

        Engine engine1 = new Engine("Name1", 145, 52);
        Engine engine2 = new Engine("Name2", 205, 72);
        Engine engine3 = new Engine("Name3", 175, 62);

        System.out.printf("\n%s\n%s\n%s\n", engine1, engine2, engine3);
    }
}
