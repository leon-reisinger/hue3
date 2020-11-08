/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3.streams;

import java.util.Comparator;

/**
 *
 * @author Reisinger
 */
public class MyComparator2 implements Comparator<Weapon>{

    @Override
    public int compare(Weapon o1, Weapon o2) {
        if(o1.getCombatType().equals(o2.getCombatType()))
        {
            if(o1.getDamageType().equals(o2.getDamageType()))
            {
                return o1.getName().compareTo(o2.getName());
            }
        }
        return 0;
    }
    
}
