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
public class ElectricDragon extends Dragon{
    
    public ElectricDragon(){
        super(25000);
        name = "Electric Dragon";
        elemen = "Listrik";
        health = 80;
        defend = 18;
        attack = 20;
    }
    @Override
    public void addSkill(int level) {
        if(level == 5){
            skill.add(new Skill("Spark","Listrik",25));
        }
        else if(level == 10){
            skill.add(new Skill("Thunderbolt","Listrik",40));
        }
    }
}

class ElectricDragon1 extends ElectricDragon{
    
}
class ElectricDragon2 extends ElectricDragon1{
    
}
class ElectricDragon3 extends ElectricDragon2{
    
}
