package BlueTeam;

import PersonInterfaces.Tank;

public class BlueTank implements Tank {
    @Override
    public void defend() {
        System.out.println("Blue Tank is defend his teammates");
    }
    @Override
    public void shield() {
        System.out.println("Blue Tank is activated shield");
    }
    @Override
    public void stomp() {
        System.out.println("Blue Tank is stomping enemies");
    }
}
