package org.example.vikins;
import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public String name;
    public int health;
    public int strength;


    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public int attack() {
        return this.strength;
    }

    public int receiveDamage(int damage) {
        return this.health -= damage;
    }

    public int removeDamage(int health) {
        return this.health = health;
    }

    public int receivedDamage (int damage) {
       return this.health -= damage;
    }

    String msg;
    public String getMsg() {
        if(this.health <= 0){
            return this.msg = this.name + "has died in combat";
        }
        else{
            return this.msg = this.name + " has received" + this.strength + "points of damage";
        }
    }

    public String battleCry(){
        return this.msg = "Odin Owns You All!";
    }
}

