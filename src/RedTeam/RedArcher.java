package RedTeam;

import PersonInterfaces.Archer;

public class RedArcher implements Archer {
    @Override
    public void shootArrow() {
        System.out.println("Read archer shoots has target");
    }
    @Override
    public void multiShoot() {
        System.out.println("Read archer multi shoots has target");
    }
    @Override
    public void hide() {
        System.out.println("Read archer hides in the smoke");
    }
}
