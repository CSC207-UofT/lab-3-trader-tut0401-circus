public class Car implements Tradable, Drivable {
    private int maxSpeed;

    public Car() {
        this.maxSpeed = 5;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
