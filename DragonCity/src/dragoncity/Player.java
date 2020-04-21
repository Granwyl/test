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
public class Player {
    private String nama,password;
    private int EXP, maxEXP, level;
    private ArrayList<Dragon> dragon = new ArrayList<>();
    private ArrayList<Food> food = new ArrayList<>();
    private int gold;

    public Player(String nama, String password) {
        this.nama = nama;
        this.password = password;
        this.gold = 50000;
        level = 1;
        EXP = 0;
        maxEXP = 100;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public int getEXP() {
        return EXP;
    }

    public int getMaxEXP() {
        return maxEXP;
    }

    public ArrayList<Dragon> getDragon() {
        return dragon;
    }
    public Dragon getDragon(int i) {
        return dragon.get(i);
    }
    
    public void addDragon(Dragon temp){
        dragon.add(temp);
    }
    public ArrayList<Food> getFood() {
        return food;
    }
    public Food getFood(int i) {
        return food.get(i);
    }
    public void addFood(Food temp){
        food.add(temp);
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    public void setMaxEXP(int maxEXP) {
        this.maxEXP = maxEXP;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    
    
}
