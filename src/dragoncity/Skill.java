/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragoncity;

/**
 *
 * @author ASUS
 */
public class Skill {
    private String namaSkill, elemen;
    private int damage;

    public Skill(String namaSkill, String elemen, int damage) {
        this.namaSkill = namaSkill;
        this.elemen = elemen;
        this.damage = damage;
    }

    
    public String getNamaSkill() {
        return namaSkill;
    }

    public String getElemen() {
        return elemen;
    }

    public int getDamage() {
        return damage;
    }

    public void setNamaSkill(String namaSkill) {
        this.namaSkill = namaSkill;
    }

    public void setElemen(String elemen) {
        this.elemen = elemen;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
}
