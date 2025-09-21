package BlueTeam;

import PersonInterfaces.Mage;

public class BlueMage implements Mage {
    @Override
    public void castSpell(){
        System.out.println("Blue Mage is casting Spell");
    }
    @Override
    public void fireball(){
        System.out.println("Blue Mage is casting fireball");
    }
    @Override
    public void teleport() {
        System.out.println("Blue Mage is teleporting in the back of enemy");
    }
}
