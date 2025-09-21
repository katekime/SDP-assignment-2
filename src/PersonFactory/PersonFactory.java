package PersonFactory;

import PersonInterfaces.*;

public interface PersonFactory {
    Archer createArcher();
    Warrior createWarrior();
    Mage createMage();
    Tank createTank();
    Healer createHealer();
}
