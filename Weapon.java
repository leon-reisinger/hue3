package net.htlgrieskirchen.pos3.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Weapon {
    
    private final String name;
    private final CombatType combatType;
    private final DamageType damageType;
    private final int damage;
    private final int speed;
    private final int minStrength;
    private int value;

    public Weapon(String name, CombatType combatType, DamageType damageType, int damage, int speed, int minStrength) {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.minStrength = minStrength;
    }



    public String getName() {
        return this.name;
    }
    
    public CombatType getCombatType() {
        return this.combatType;
    }

    public DamageType getDamageType() {
        return this.damageType;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMinStrength() {
        return minStrength;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }

@Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.combatType);
        hash = 11 * hash + Objects.hashCode(this.damageType);
        hash = 11 * hash + this.damage;
        hash = 11 * hash + this.speed;
        hash = 11 * hash + this.minStrength;
        hash = 11 * hash + this.value;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.equals(obj))
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Weapon" + "name=" + name + ", combatType=" + combatType + ", damageType=" + damageType + ", damage=" + damage + ", speed=" + speed + ", minStrength=" + minStrength + ", value=" + value + '}';
    }
    
    public void readFile(String line)
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader("weapons"));
            while((line = br.readLine()) != null)
            {
                String [] parts = line.split(" ");
                Weapon w = new Weapon(parts[0], CombatType.valueOf(parts[1]), DamageType.valueOf(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]));
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Weapon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Weapon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
