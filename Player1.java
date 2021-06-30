package com.Rafi;

public class Player1 {
    private String name;
    private String weapon;   //properties
    private int health;

    public Player1(String name, String weapon, int health) { //constructor to initialize object
        this.name = name;
        this.weapon = weapon;
        if(health < 0 || health > 100){
            this.health = 100;
        } else this.health = health; //encapsulaation=limit user from accessing

    }
    /*public void damageByGun1(){   //when gun is fired
        this.health -=30;
        if(this.health <=0){
            this.health = 0;
        }
        System.out.println("got hit by gun 1 and health is reduce by 30." + "Fyi,New health is "+ this.health);
        if(this.health == 0){
            System.out.println(getName() + "is dead");
        }
    }
    public void damageByGun2(){}{
        this.health -=50;
        if(this.health <=0){
            this.health = 0;
        }
        System.out.println("got hit by gun 1 and Health is reduce by 50." + "Fyi,New health is" + this.health);
        if(this.health == 0){
            System.out.println(getName() + "is dead");
        }
    } */

    public void heal(){
        if(this.health <= 0) System.out.println("player is dead");
        else{
            this.health = 100;
            System.out.println("health is " + this.health);
        }
    }

    public String getName(){ //getter and setter
        return name;
    }

    public void setName(String name) {this.name=name;}

    public String getWeapon(){
        return weapon;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth (int health){
        this.health = health;
    }
}
