package RedTeam;

import PersonInterfaces.Tank;

public class RedTank implements Tank {
    @Override
    public void defend() {
        System.out.println("Red Tank is defend his teammates");
    }
    @Override
    public void shield() {
        System.out.println("Red Tank is activated shield");
    }
    @Override
    public void stomp() {
        System.out.println("Red Tank is stomping enemies");
    }
}
