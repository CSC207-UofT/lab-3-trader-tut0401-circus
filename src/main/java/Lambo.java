public class Lambo implements Tradable, Drivable{
    private int maxSpeed;

    @Override
    public int getPrice(){ return 400000; }

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
        return 350;
    }
}
