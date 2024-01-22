package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {


    public Magician(double health, double physAtt, double magicAtt, double phisDef, double magicDef) {
        super(health, physAtt, magicAtt, phisDef, magicDef);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() > 0) {
            hero.setHealth(hero.getHealth() - ((getMagicAtt() - hero.getMagicDef() * getMagicAtt())));
            if (hero.getHealth() < 0) {
                hero.setHealth(0);
            }System.out.println(hero.toString());
        } else {
            System.out.println("Выбери живую цель");
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getHealth() > 0) {
            hero.setHealth(hero.getHealth() - ((getPhysAtt() - hero.getPhisDef() * getPhysAtt())));
            if (hero.getHealth() < 0) {
                hero.setHealth(0);
            }
            System.out.println(hero.toString());
        } else {
            System.out.println("Выбери живую цель");
        }
    }

    @Override
    public String toString() {
        return "Magician{"+getHealth()+"}";
    }
}
