package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    public Paladin(double health, double physAtt, double magicAtt, double phisDef, double magicDef) {
        super(health, physAtt, magicAtt, phisDef, magicDef);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        if (getHealth() > 100) {
            setHealth(100);
        }
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
        if (hero.getHealth() > 100) {
            hero.setHealth(100);
        }
        System.out.println(hero.toString());
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
        return "Paladin{"+getHealth()+"}";
    }
}
