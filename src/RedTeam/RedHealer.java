package RedTeam;

import PersonInterfaces.Healer;

public class RedHealer implements Healer {
    @Override
    public void heal() {
        System.out.println("RedHealer is healing his teammates");
    }
    @Override
    public void cleanse() {
        System.out.println("RedHealer is cleansing his teammates");
    }
    @Override
    public void support() {
        System.out.println("RedHealer is supporting to his teammates");
    }
}
