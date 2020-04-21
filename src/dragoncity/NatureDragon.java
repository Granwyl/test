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
public class NatureDragon extends Dragon{
    
    public NatureDragon(){
        super(11000);
        name = "Nature Dragon";
        elemen = "Daun";
        health = 90;
        defend = 20;
        attack = 20;
    }
    @Override
    public void addSkill(int level) {
        if(level == 5){
            skill.add(new Skill("Razor Leaf","Daun",25));
        }
        else if(level == 10){
            skill.add(new Skill("Leaf Blade","Daun",40));
        }
    }
}

class NatureDragon1 extends NatureDragon{
    
}
class NatureDragon2 extends NatureDragon1{
    
}
class NatureDragon3 extends NatureDragon2{
    
}
