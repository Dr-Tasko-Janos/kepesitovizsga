package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {

    public static int attackNumber = 0;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    int doDamage() {
        int resultOfAttack = 0;
        attackNumber++;

        if (attackNumber == 1) {
            return getAttackDamage() * 3;
        } else {
            return super.doDamage();
        }
    }
}
