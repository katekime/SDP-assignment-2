package TeamFactorys;
import BlueTeam.*;
import PersonFactory.PersonFactory;
import PersonInterfaces.*;

public class BlueTeamFactory implements PersonFactory{
    @Override
    public Archer createArcher() {
        return new BlueArcher();
    }
    @Override
    public Warrior createWarrior() {
        return new BlueWarrior();
    }
    @Override
    public Mage createMage() {
        return new BlueMage();
    }
    @Override
    public Tank createTank() {
        return new BlueTank();
    }
    @Override
    public Healer createHealer() {
        return new BlueHealer();
    }
}