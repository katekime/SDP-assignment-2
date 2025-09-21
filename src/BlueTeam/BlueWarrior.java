package BlueTeam;

import PersonInterfaces.Warrior;

public class BlueWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Blue Warrior attacks his target");
    }
    @Override
    public void block() {
        System.out.println("Blue Warrior blocks attack of enemy");
    }
    @Override
    public void powerStrike() {
        System.out.println("Blue Warrior powerStriked his target");
    }
}
