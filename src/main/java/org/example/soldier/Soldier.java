package org.example.soldier;

public class Soldier {
    int strength;

    int health;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int attack() {
        return this.strength;
    }

    public int receiveDamage(int damage){
        return this.health -= damage;
    }
}
