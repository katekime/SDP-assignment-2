package RedTeam;

import PersonInterfaces.Warrior;

public class RedWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Red Warrior attacks his target");
    }
    @Override
    public void block() {
        System.out.println("Red Warrior blocks attack of enemy");
    }
    @Override
    public void powerStrike() {
        System.out.println("Red Warrior powerStriked his target");
    }
}
