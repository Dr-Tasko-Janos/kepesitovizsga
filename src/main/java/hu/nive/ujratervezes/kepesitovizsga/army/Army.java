package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit unit) {
        militaryUnits.add(unit);
    }

    public int getArmySize() {
        return militaryUnits.size();
    }

    public int getArmyDamage() {
        int allDamage = 0;
        for (MilitaryUnit item : militaryUnits) {
            allDamage += item.getAttackDamage();
        }
        return allDamage;
    }

    public void damageAll(int damage) {
        for (MilitaryUnit item : militaryUnits) {
            item.abateLifeScore(damage);
        }
        Iterator<MilitaryUnit> i = militaryUnits.iterator();
        while (i.hasNext()) {
            MilitaryUnit j = i.next();
            if (j.getHitPoints() < 25) {
                i.remove();
            }
        }
    }
}

