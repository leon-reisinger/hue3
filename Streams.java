package net.htlgrieskirchen.pos3.streams;

import java.util.ArrayList;
import java.util.List;

public class Streams {

    public double average(int[] numbers) {
        int count = 0;
        int inhalt = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            inhalt = numbers[i];
            count++;
        }
        int erg = inhalt / count;
        return erg;
    }
    
    public List<String> upperCase(String[] strings) {
        List<String> allUpperCaseStrings = new ArrayList<>();
        for(int i = 0; i < strings.length; i++)
        {
            String tmps = strings[i].toUpperCase();
            allUpperCaseStrings.add(tmps);
        }
        return allUpperCaseStrings;
    }
    
    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        return null;
        //implement this
    }
    
    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        return null;
        //implement this
    }
    
    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        return null;
        //implement this
    }
    
    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        return null;
        //implement this
    }
    
    public List<String> toNameList(List<Weapon> weapons) {
        return null;
        //implement this
    }
    
    public int[] toSpeedArray(List<Weapon> weapons) {
        return null;
        //implement this
    }
    
    public int sumUpValues(List<Weapon> weapons) {
        return 0;
        //implement this
    }
    
    public long sumUpHashCodes(List<Weapon> weapons) {
        return 0;
        //implement this
    }
    
    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return null;
        //implement this
    }
    
    public void increaseValuesByTenPercent(List<Weapon> weapons) {
       //implement this
    }
}
