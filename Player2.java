package com.Rafi;

public class Player2 {  //extend all the properties  from player 1
    private int health;       // additional properties
    private boolean armour;/*

    public Player2(String name, String weapon, int health, boolean armour) {  //constructor
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override                                   //override method
    public void damageByGun1() {
        if(armour){
            this.health -= 20;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is on,got hit by gun 1 and health is reduce by 20."+ "new health is" + this.health);

        }if(!armour){
            this.health -= 30;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is off,got hit by gun 1 and health is reduce by 30."+ "new health is" + this.health);


        }
        if(this.health == 0){
            System.out.println( getName() +"is dead");
        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health -= 40;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is on,got hit by gun 1 and health is reduce by 40."+ "new health is" + this.health);

        }if(!armour){
            this.health -= 50;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is off,got hit by gun 1 and health is reduce by 50."+ "new health is" + this.health);


        }
        if(this.health == 0){
            System.out.println( getName() +"is dead");
        }


    }

    @Override
    public void heal() {
        super.heal();
    }*/
}
