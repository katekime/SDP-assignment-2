package RedTeam;

import PersonInterfaces.Archer;

public class RedArcher implements Archer {
    @Override
    public void shootArrow() {
        System.out.println("Red archer shoots has target");
    }
    @Override
    public void multiShoot() {
        System.out.println("Red archer multi shoots has target");
    }
    @Override
    public void hide() {
        System.out.println("Red archer hides in the smoke");
    }
}
