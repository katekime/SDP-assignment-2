package RedTeam;

import PersonInterfaces.Mage;

public class RedMage implements Mage {
    @Override
    public void castSpell(){
        System.out.println("Red Mage is casting Spell");
    }
    @Override
    public void fireball(){
        System.out.println("Red Mage is casting fireball");
    }
    @Override
    public void teleport() {
        System.out.println("Red Mage is teleporting in the back of enemy");
    }
}
