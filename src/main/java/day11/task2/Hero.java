package day11.task2;

public abstract class Hero {
    private double health;
    private double physAtt;
    private double magicAtt;
    private double phisDef;
    private double magicDef;

    public Hero(double health, double physAtt, double magicAtt, double phisDef, double magicDef) {
        this.health = health;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
        this.phisDef = phisDef;
        this.magicDef = magicDef;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    public double getMagicAtt() {
        return magicAtt;
    }

    public double getPhisDef() {
        return phisDef;
    }

    public double getMagicDef() {
        return magicDef;
    }
}
