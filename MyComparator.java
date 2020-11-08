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
public class MyComparator implements Comparator<Weapon>{

    @Override
    public int compare(Weapon o1, Weapon o2) {
        return o1.getDamage() - o2.getDamage();
    }
    
}
