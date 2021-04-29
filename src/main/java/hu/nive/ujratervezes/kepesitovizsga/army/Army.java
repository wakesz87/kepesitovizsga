package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> militaryUnitList =new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit){
        militaryUnitList.add(militaryUnit);

    }

    public void damageAll(int damage){
        List<MilitaryUnit> remove =new ArrayList<>();
        for(MilitaryUnit i : militaryUnitList){
            if(i.getHealth() >= 25){
                remove.add(i);
            }
        }

    }


    public int getArmySize() {
        return militaryUnitList.size();
    }

    public  int  getArmyDamage(){
        int damages =0;
         for(MilitaryUnit mu : militaryUnitList){
             damages = damages + mu.doDamage();
         }
         return damages;

    }




}
