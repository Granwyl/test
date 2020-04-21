/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragoncity;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public abstract class Dragon implements battle{
    protected int EXP, maxEXP, level;
    protected String name, elemen;
    protected int health, defend, attack;
    private int harga;
    protected ArrayList<Skill> skill = new ArrayList<>();
    public Dragon(){
        
    }
    public Dragon(int harga){
        EXP = 0;
        maxEXP = 1000;
        level = 1;
        this.harga = harga;
        System.out.println("Berhasil Beli Dragon");
        skill.add(new Skill("Tackle","Normal",15));
    }
    
    public abstract void addSkill(int level);
    
    public int getEXP() {
        return EXP;
    }

    public int getMaxEXP() {
        return maxEXP;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDefend() {
        return defend;
    }

    public int getAttack() {
        return attack;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    public void setMaxEXP(int maxEXP) {
        this.maxEXP = maxEXP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void levelUp(int tambahEXP){
        do{
            if(EXP + tambahEXP < maxEXP){
                EXP += tambahEXP;
                tambahEXP = 0;
            }
            else{
                tambahEXP -= (maxEXP - EXP);
                level++;
                health += 10;
                defend += 5; 
                attack += 5;
                maxEXP += 100;
                EXP = 0;
            }
        }while(tambahEXP > 0);
    }

    public String getElemen() {
        return elemen;
    }

    public int getHarga() {
        return harga;
    }

    public ArrayList<Skill> getSkill() {
        return skill;
    }
    public Skill getSkill(int i){
        return skill.get(i);
    }
    public void addSkill(Skill temp){
        skill.add(temp);
    }


    @Override
    public int damage(Dragon a, Dragon b) {
        return 0;
    }
    
}
