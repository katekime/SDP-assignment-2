package TeamFactorys;

import PersonInterfaces.*;
import RedTeam.RedArcher;
import PersonFactory.PersonFactory;
import RedTeam.*;

public class RedTeamFactory implements PersonFactory {
    @Override
    public Archer createArcher() {
        return new RedArcher();
    }
    @Override
    public Warrior createWarrior() {
        return new RedWarrior();
    }
    @Override
    public Mage createMage() {
        return new RedMage();
    }
    @Override
    public Tank createTank() {
        return new RedTank();
    }
    @Override
    public Healer createHealer() {
        return new RedHealer();
    }
}
