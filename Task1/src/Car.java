public class Car {
    private String name;
    private double mass;

    public Car(String name, double mass) {
        this.mass = mass;
        this.name = name;
        
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.mass, mass) == 0 &&
                name == car.name;
    }

    @Override
    public String toString() {
        return name + Constants.DELIMITER + mass + Constants.DELIMITER;
    }
}
