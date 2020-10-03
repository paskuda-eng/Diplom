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
    public String toString() {
        return name + Constants.DELIMITER + power + Constants.DELIMITER + volume + Constants.DELIMITER;
    }
}
