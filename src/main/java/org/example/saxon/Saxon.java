package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {

    int strength;
    int health;

    public Saxon(int health, int strength) {
        super(health, strength);
        this.strength = strength;
        this.health = health;
    }
    public int attack(){
    return this.strength;
    }

    public int receiveDamage(int damage){
        return this.health -= damage;
    }

    public String getMsg(){
        if (this.health <= 0){
            return "A Saxon has died in combat";
        }
        else{
            return "A Saxon has received" + this.strength + "points of damage";
        }
    }




}
