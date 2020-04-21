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
public class FlameDragon extends Dragon{
    
    public FlameDragon(){
        super(22500);
        name = "Flame Dragon";
        elemen = "Api";
        health = 60;
        defend = 15;
        attack = 25;
    }

    @Override
    public void addSkill(int level) {
        if(level == 5){
            skill.add(new Skill("Ember","Api",25));
        }
        else if(level == 10){
            skill.add(new Skill("Flamethrower","Api",40));
        }
    }


}
