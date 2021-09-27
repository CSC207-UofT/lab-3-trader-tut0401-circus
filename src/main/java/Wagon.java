public class Wagon implements  Tradable, Drivable{
    private int Maxspeed;

    public Wagon() {
        this.Maxspeed = 3;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }


    @Override
    public void downgradeSpeed() {
        this.Maxspeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.Maxspeed;
    }

    @Override
    public int getPrice() {
        return 24;
    }
}
