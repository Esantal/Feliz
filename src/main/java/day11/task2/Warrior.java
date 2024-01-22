package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(double health, double physAtt, double magicAtt, double phisDef, double magicDef) {
        super(health, physAtt, magicAtt, phisDef, magicDef);
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
        return "Warrior{"+getHealth()+"}";
    }
}
