import java.util.Objects;

public class Engine {
    private String name;
    private double power;
    private double volume;

    public Engine(String name, double power, double volume) {
        this.name = name;
        this.power = power;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.power, power) == 0 &&
                Double.compare(engine.volume, volume) == 0 &&
                Objects.equals(name, engine.name);
    }

    @Override
    public String toString() {
        return name + Constants.DELIMITER + power + Constants.DELIMITER + volume + Constants.DELIMITER;
    }
}
