package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior w = new Warrior(100, 30, 0, 0.8, 0);
        Paladin p = new Paladin(100, 15, 0, 0.5, 0.2);
        Magician m = new Magician(100, 5, 20, 0, 0.8);
        Shaman s = new Shaman(100, 10, 15, 0.2, 0.2);
        w.physicalAttack(p);
        p.physicalAttack(m);
        s.healTeammate(m);
        m.magicalAttack(p);
        s.physicalAttack(w);
        p.healHimself();
        w.physicalAttack(m);
        w.physicalAttack(m);
        w.physicalAttack(m);
        w.physicalAttack(m);
        w.physicalAttack(m);
    }
}
