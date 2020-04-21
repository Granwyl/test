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
public class LegendDragon extends Dragon{
    
    public LegendDragon(){
        super(15000);
        name = "Legend Dragon";
        elemen = "Legend";
        health = 150;
        defend = 30;
        attack = 30;
    }
    @Override
    public void addSkill(int level) {
        if(level == 5){
            skill.add(new Skill("seranganLegend 1","Legend",25));
        }
        else if(level == 10){
            skill.add(new Skill("seranganLegend 2","Legend",40));
        }
    }
}

class LegendDragon1 extends LegendDragon{
    
}
class LegendDragon2 extends LegendDragon1{
    
}
class LegendDragon3 extends LegendDragon2{
    
}