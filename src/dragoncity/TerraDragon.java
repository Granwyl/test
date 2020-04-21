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
public class TerraDragon extends Dragon{
    //lek mw gampang, class e kecil terra, sedang terra, besar terra dpisah2, jadi lek evolusi new2 lagi, ben gui e gampang
    //lek mw kecil, sedang besar e itu tetep extends Terra soale kan ya terra
    // ato sedang extends kecil, besar extends sedang, nti isa panggel2 punyae super
    // nti lek skill, lek manggil skill ini manggil function ini, tpi jek gatau struktur susunan e yaapa
    public TerraDragon(){
        super(4000);
        name = "Terra Dragon";
        elemen = "Tanah";
        health = 100;
        defend = 20;
        attack = 15;
        
    }
    @Override
    public void addSkill(int level) {
        if(level == 5){
            skill.add(new Skill("Rock Throw","Tanah",25));
        }
        else if(level == 10){
            skill.add(new Skill("Earthquake","Tanah",40));
        }
    }
}
