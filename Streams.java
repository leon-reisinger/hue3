package net.htlgrieskirchen.pos3.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public double average(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
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
        return weapons.stream().min((a,b) -> a.getDamage() - b.getDamage()).orElse(null);
    }
    
    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        return weapons.stream().max((a,b) -> a.getMinStrength() - b.getMinStrength()).orElse(null);
    }
    
    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        return weapons.stream().filter((a) -> a.getDamageType().equals(DamageType.MISSILE)).collect(Collectors.toList());
    }
    
    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        return weapons.stream().max((a,b) -> a.getName().length() - b.getName().length()).orElse(null);
    }
    
    public List<String> toNameList(List<Weapon> weapons) {
        return weapons.stream().map((a) -> a.getName()).collect(Collectors.toList()); //Immer wenn man eine Liste hat toList
    }
    
    public int[] toSpeedArray(List<Weapon> weapons) {
        return weapons.stream().mapToInt((a) -> a.getSpeed()).toArray();
    }
    
    public int sumUpValues(List<Weapon> weapons) {
        return weapons.stream().mapToInt((a) -> a.getValue()).reduce(0, (a,b) -> a+b);
    }
    
    public long sumUpHashCodes(List<Weapon> weapons) {
        return weapons.stream().mapToLong((a) -> a.hashCode()).reduce(0, (a,b) -> a+b);
    }
    
    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return weapons.stream().distinct().collect(Collectors.toList()); //distinct überprüft ob Duplikate drinnen sind
    }
    
    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        weapons.stream().forEach((a) -> a.setValue(a.getValue() + a.getValue()/10)); //addiert 10% dazu
    }
}
