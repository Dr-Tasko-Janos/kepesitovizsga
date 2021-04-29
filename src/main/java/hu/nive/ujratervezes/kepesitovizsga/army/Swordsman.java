package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private int attackCounter = 1;

    public Swordsman(boolean hasShield) {
        super(100, 10, hasShield);
    }

    @Override
    void sufferDamage(int damage) {
       setLifeScore((attackCounter == 1) ? getHitPoints() : getHitPoints() - damage/2);

    }
}
