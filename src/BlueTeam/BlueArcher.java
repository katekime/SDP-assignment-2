package BlueTeam;

import PersonInterfaces.Archer;

public class BlueArcher implements Archer {
    @Override
    public void shootArrow() {
        System.out.println("Blue Archer shoots has target");
    }
    @Override
    public void multiShoot() {
        System.out.println("Blue Archer multi shoots has target");
    }
    @Override
    public void hide() {
        System.out.println("Blue Archer hides in the smoke");
    }
}
