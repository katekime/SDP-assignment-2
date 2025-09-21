package BlueTeam;

import PersonInterfaces.Healer;

public class BlueHealer implements Healer {
    @Override
    public void heal() {
        System.out.println("Blue Healer is healing his teammates");
    }
    @Override
    public void cleanse() {
        System.out.println("Blue Healer is cleansing his teammates");
    }
    @Override
    public void support() {
        System.out.println("Blue Healer is supporting to his teammates");
    }
}
