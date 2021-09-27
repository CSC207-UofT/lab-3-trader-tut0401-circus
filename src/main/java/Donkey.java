public class Donkey implements Tradable, Domesticatable, Drivable {

    private static int speed;
    private static int maxSpeed;
    private static int price;

    public Donkey(int s, int m, int p){
        speed = s;
        maxSpeed = m;
        price = p;
    }

    @Override
    public String sound() {
        return "mooooo";
    }

    @Override
    public void upgradeSpeed() {
        if (speed < maxSpeed)
            speed++;
    }

    @Override
    public void downgradeSpeed() {
        speed--;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }
}
