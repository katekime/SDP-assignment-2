import PersonFactory.PersonFactory;
import PersonInterfaces.*;

public class Team {
    private Archer archer;
    private Warrior warrior;
    private Tank tank;
    private Healer healer;
    private Mage mage;

    public Team(PersonFactory factory) {
        this.archer = factory.createArcher();
        this.warrior = factory.createWarrior();
        this.tank = factory.createTank();
        this.healer = factory.createHealer();
        this.mage = factory.createMage();
    }
    public void ArcherSkills() {
        archer.shootArrow();
        archer.multiShoot();
        archer.hide();
    }
    public void WarriorSkills() {
        warrior.attack();
        warrior.block();
        warrior.powerStrike();
    }
    public void TankSkills() {
        tank.defend();
        tank.shield();
        tank.stomp();
    }
    public void HealerSkills() {
        healer.heal();
        healer.cleanse();
        healer.support();
    }
    public void MageSkills() {
        mage.castSpell();
        mage.fireball();
        mage.teleport();
    }
    public void startBattle() {
        System.out.println("Starting Battle");
        ArcherSkills();
        WarriorSkills();
        TankSkills();
        HealerSkills();
        MageSkills();
    }

}
