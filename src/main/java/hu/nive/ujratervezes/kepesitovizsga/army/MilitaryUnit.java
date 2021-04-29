package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int lifeScore;
    private int attackDamage;
    private boolean hasShield;

    public MilitaryUnit(int lifeScore, int attackDamage, boolean hasShield) {
        this.lifeScore = lifeScore;
        this.attackDamage = attackDamage;
        this.hasShield = hasShield;
    }

    public int getHitPoints() {
        return lifeScore;
    }

    public void setLifeScore(int lifeScore) {
        this.lifeScore = lifeScore;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public boolean isHasShield() {
        return hasShield;
    }

    public void setHasShield(boolean hasShield) {
        this.hasShield = hasShield;
    }

    int doDamage() {
        return attackDamage;
    }

    void sufferDamage(int damage) {
        lifeScore = (hasShield) ? lifeScore - (damage / 2) : lifeScore - damage;
    }

    public void abateLifeScore(int number) {
        lifeScore -= number;
    }
}
