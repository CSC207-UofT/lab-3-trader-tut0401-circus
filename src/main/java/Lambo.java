public class Lambo implements Tradable, Drivable{
    private int maxSpeed = 350;

    @Override
    public void upgradeSpeed() {
        maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getPrice() {
        return 400000;
    }
}
