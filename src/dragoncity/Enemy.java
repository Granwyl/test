/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragoncity;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Felix Ronan
 */
public class Enemy extends Dragon {
    protected Dragon temp;

    public Enemy() {
        Random r = new Random();
        int c =  r.nextInt()+1;
        if(c==1) temp = new FlameDragon();
        else if(c==2) temp = new SeaDragon();
        else if(c==3) temp = new TerraDragon();
        else if(c==4) temp = new NatureDragon();
        else if(c==5) temp = new LegendDragon();
        else if(c==6) temp = new ElectricDragon();
        
        
        temp.setLevel(5);
        temp.addSkill(5);
    }

    public Dragon getTemp() {
        return temp;
    }

    public void setTemp(Dragon temp) {
        this.temp = temp;
    }

    @Override
    public void addSkill(int level) {
        if(temp instanceof FlameDragon){
            if(level == 5){
            skill.add(new Skill("Ember","Api",25));
        }
        else if(level == 10){
            skill.add(new Skill("Flamethrower","Api",40));
        }
        }else if(temp instanceof LegendDragon){
            if(level == 5){
            skill.add(new Skill("seranganLegend 1","Legend",25));
        }
        else if(level == 10){
            skill.add(new Skill("seranganLegend 2","Legend",40));
        }
        }else if(temp instanceof SeaDragon){
            if(level == 5){
            skill.add(new Skill("Water Gun","Air",25));
        }
        else if(level == 10){
            skill.add(new Skill("Surf","Air",40));
        }
        }else if(temp instanceof TerraDragon){
            if(level == 5){
            skill.add(new Skill("Rock Throw","Tanah",25));
        }
        else if(level == 10){
            skill.add(new Skill("Earthquake","Tanah",40));
        }else if(temp instanceof ElectricDragon){
            if(level == 5){
            skill.add(new Skill("Spark","Listrik",25));
        }
        else if(level == 10){
            skill.add(new Skill("Thunderbolt","Listrik",40));
        }
        }else if(temp instanceof NatureDragon){
            if(level == 5){
            skill.add(new Skill("Razor Leaf","Daun",25));
        }
        else if(level == 10){
            skill.add(new Skill("Leaf Blade","Daun",40));
        }
        }
        }
    }

    @Override
    public int damage(Dragon a, Dragon b) {
        return 0;
    }

    
    
   
    
}
