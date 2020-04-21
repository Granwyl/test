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
public class SeaDragon extends Dragon{
    
    public SeaDragon(){
        super(7000);
        name = "Sea Dragon";
        elemen = "Air";
        health = 80;
        defend = 15;
        attack = 18;
    }
    @Override
    public void addSkill(int level) {
        if(level == 5){
            skill.add(new Skill("Water Gun","Air",25));
        }
        else if(level == 10){
            skill.add(new Skill("Surf","Air",40));
        }
    }
}
