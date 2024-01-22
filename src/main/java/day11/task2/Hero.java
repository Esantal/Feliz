package day11.task2;

public abstract class Hero { //можно было унаследовать интерфейсы и не пришлось бы использовать гетеры и сетеры и копирвоать ф-лы
    private double health;//не надо было делать приватными. можно было бы обойтись без гетеров и сетеров
    private double physAtt;// не у всех есть физ атака. надо было у каждого по потребности вводить
    private double magicAtt;
    private double phisDef;
    private double magicDef;

    public Hero(double health, double physAtt, double magicAtt, double phisDef, double magicDef) {
        this.health = health;// можно было убрать из ввода и инициализировать сразу равным 100
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
