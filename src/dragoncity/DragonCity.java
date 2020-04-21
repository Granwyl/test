/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragoncity;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DragonCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner(System.in);// buat integer
        Scanner cstr = new Scanner(System.in); // buat String
        ArrayList<Player> player = new ArrayList<>();
        
        int menu1 = -1;
        do{
            System.out.println("Welcome to Dragon City");
            System.out.println("1. Login");
            System.out.println("2. Daftar");
            System.out.println("0. Exit");
            System.out.print(">>");
            menu1 = cin.nextInt();
            if(menu1 == 1){
                System.out.println("LOGIN");
                String username, pw;
                System.out.print("Masukkan username : ");
                username = cstr.nextLine();
                System.out.print("Masukkan Password : ");
                pw = cstr.nextLine();
                for (int i = 0; i < player.size(); i++) {
                    if(username.equals(player.get(i).getNama()) && pw.equals(player.get(i).getPassword())){
                        int menu2 = -1;
                        do{
                            System.out.println("Welcome to Dragon City, " + player.get(i).getNama());
                            System.out.println("MENU");
                            System.out.println("1. Lihat Dragon");
                            System.out.println("2. Lihat Food");
                            System.out.println("3. Beli Dragon");
                            System.out.println("4. Beli Food");
                            System.out.println("5. Beri Makan Dragon");
                            System.out.println("6. Battle");
                            System.out.println("0. Exit");
                            System.out.print(">>");
                            menu2 = cin.nextInt();
                            if(menu2 == 1){
                                int pilih = -1;
                                do{
                                    System.out.println("Daftar Dragon");
                                    for (int j = 0; j < player.get(i).getDragon().size(); j++) {
                                        System.out.println("Nama Dragon : " + player.get(i).getDragon(j).getName());
                                        System.out.println("Level Dragon: " + player.get(i).getDragon(j).getLevel());
                                        System.out.println("EXP         : " + player.get(i).getDragon(j).getEXP() + "/" +player.get(i).getDragon(j).getMaxEXP());
                                        System.out.println("Attack      : " + player.get(i).getDragon(j).getAttack());
                                        System.out.println("Defend      : " + player.get(i).getDragon(j).getDefend());
                                        System.out.println("Health      : " + player.get(i).getDragon(j).getHealth());
                                        System.out.println("SKILLS : ");
                                        for (int k = 0; k < player.get(i).getDragon(j).getSkill().size(); k++) {
                                            System.out.println((k+1) + ". " + player.get(i).getDragon(j).getSkill(k).getNamaSkill() + " - Elemen : " + player.get(i).getDragon(j).getSkill(k).getElemen() + " - Damage : " + player.get(i).getDragon(j).getSkill(k).getDamage());
                                        }
                                        System.out.println("==============================");
                                    }
                                    System.out.println("0. Back");
                                    System.out.print(">>");
                                    pilih = cin.nextInt();
                                }while(pilih != 0);
                            }
                            else if(menu2 == 2){
                                int pilih = -1;
                                do{    
                                    System.out.println("Daftar Food");
                                    for (int j = 0; j < player.get(i).getFood().size(); j++) {
                                        System.out.println("Nama Food   : " + player.get(i).getFood(j).getName());
                                        System.out.println("EXP Bonus   : " + player.get(i).getFood(j).getTambahEXP());
                                        System.out.println("Jumlah      : " + player.get(i).getFood(j).getJumlah());
                                        System.out.println("==============================");
                                    }
                                    System.out.println("0. Back");
                                    System.out.print(">>");
                                    pilih = cin.nextInt();
                                }while(pilih != 0);
                            }
                            else if(menu2 == 3){
                                int pilih;
                                do{
                                    System.out.println("Dragon Shop");
                                    System.out.println("1. Terra Dragon");
                                    System.out.println("2. Sea Dragon");
                                    System.out.println("3. Nature Dragon");
                                    System.out.println("4. Legend Dragon");
                                    System.out.println("5. Flame Dragon");
                                    System.out.println("6. Electric Dragon");
                                    System.out.println("0. Back");
                                    //cek input--
                                    do{
                                        System.out.print(">> ");
                                        pilih = cin.nextInt();
                                    }while(pilih<0 || pilih>6);
                                    //
                                    if(pilih == 1 && player.get(i).getGold()-4000>=0){
                                        player.get(i).addDragon(new TerraDragon());
                                        player.get(i).setGold(player.get(i).getGold()-4000);//kurangi gold player
                                    }
                                    else if(pilih == 2 && player.get(i).getGold()-7000>=0){
                                        player.get(i).addDragon(new SeaDragon());
                                        player.get(i).setGold(player.get(i).getGold()-7000);
                                    }
                                    else if(pilih == 3 && player.get(i).getGold()-11000>=0){
                                        player.get(i).addDragon(new NatureDragon());
                                        player.get(i).setGold(player.get(i).getGold()-11000);
                                    }
                                    else if(pilih == 4 && player.get(i).getGold()-15000>=0){
                                        player.get(i).addDragon(new LegendDragon());
                                        player.get(i).setGold(player.get(i).getGold()-15000);
                                    }
                                    else if(pilih == 5 && player.get(i).getGold()-22500>=0){
                                        player.get(i).addDragon(new FlameDragon());
                                        player.get(i).setGold(player.get(i).getGold()-22500);
                                    }
                                    else if(pilih == 6 && player.get(i).getGold()-25000>=0){
                                        player.get(i).addDragon(new ElectricDragon());
                                        player.get(i).setGold(player.get(i).getGold()-25000);
                                    }
                                    else{
                                        System.out.println("Gagal membeli");
                                    }
                                }while(pilih != 0);
                            }
                            else if(menu2 == 4){
                                int pilih;
                                System.out.println("Food Shop");
                                System.out.println("1. Gardener");
                                System.out.println("2. Farmer");
                                System.out.println("3. Harvester");
                                System.out.println("4. Producer");
                                pilih = cin.nextInt();
                                if(pilih == 1){ // contoh kalau gardener
                                    boolean ada = false;
                                    int idx = -1;
                                    for (int j = 0; j < player.get(i).getFood().size(); j++) {
                                        if(player.get(i).getFood(j).getName().equals("Gardener")){
                                            ada = true;
                                            idx = j;
                                        }
                                    }
                                    if(ada){
                                        player.get(i).getFood(idx).setJumlah(player.get(i).getFood(idx).getJumlah() + 1);
                                    }
                                    else{
                                        player.get(i).addFood(new Gardener());
                                    }
                                }
                                if(pilih == 2){ 
                                    boolean ada = false;
                                    int idx = -1;
                                    for (int j = 0; j < player.get(i).getFood().size(); j++) {
                                        if(player.get(i).getFood(j).getName().equals("Farmer")){
                                            ada = true;
                                            idx = j;
                                        }
                                    }
                                    if(ada){
                                        player.get(i).getFood(idx).setJumlah(player.get(i).getFood(idx).getJumlah() + 1);
                                    }
                                    else{
                                        player.get(i).addFood(new Farmer());
                                    }
                                }
                                if(pilih == 3){ 
                                    boolean ada = false;
                                    int idx = -1;
                                    for (int j = 0; j < player.get(i).getFood().size(); j++) {
                                        if(player.get(i).getFood(j).getName().equals("Harvester")){
                                            ada = true;
                                            idx = j;
                                        }
                                    }
                                    if(ada){
                                        player.get(i).getFood(idx).setJumlah(player.get(i).getFood(idx).getJumlah() + 1);
                                    }
                                    else{
                                        player.get(i).addFood(new Harvester());
                                    }
                                }
                                if(pilih == 4){ 
                                    boolean ada = false;
                                    int idx = -1;
                                    for (int j = 0; j < player.get(i).getFood().size(); j++) {
                                        if(player.get(i).getFood(j).getName().equals("Producer")){
                                            ada = true;
                                            idx = j;
                                        }
                                    }
                                    if(ada){
                                        player.get(i).getFood(idx).setJumlah(player.get(i).getFood(idx).getJumlah() + 1);
                                    }
                                    else{
                                        player.get(i).addFood(new Producer());
                                    }
                                }
                            }
                            else if(menu2 == 5){
                                if(player.get(i).getDragon().size() > 0 && player.get(i).getFood().size() > 0){ // kalau player punya dragon dan punya food
                                    int pilihDragon = -1;
                                    for (int j = 0; j < player.get(i).getDragon().size(); j++) {
                                        System.out.print((j+1) + ". Nama Dragon : " + player.get(i).getDragon(j).getName());
                                        System.out.println(       " - Level Dragon : " + player.get(i).getDragon(j).getLevel());
                                    }
                                    do{
                                        System.out.print(">>");
                                        pilihDragon = cin.nextInt();
                                    }while(pilihDragon < 1 && pilihDragon > player.get(i).getDragon().size());
                                    pilihDragon--;
                                    
                                    int pilihFood = -1;
                                    for (int j = 0; j < player.get(i).getFood().size(); j++) {
                                        System.out.print((j+1) + ". Nama Food : " + player.get(i).getFood(j).getName());
                                        System.out.print(" - Tambah EXP : " + player.get(i).getFood(j).getTambahEXP());
                                        System.out.println(" - Jumlah : " + player.get(i).getFood(j).getJumlah());
                                    }
                                    do{
                                        System.out.print(">>");
                                        pilihFood = cin.nextInt();
                                    }while(pilihFood < 1 && pilihFood > player.get(i).getFood().size());
                                    pilihFood--;
                                    player.get(i).getDragon(pilihDragon).levelUp(player.get(i).getFood(pilihFood).getTambahEXP());
                                    player.get(i).getFood(pilihFood).setJumlah(player.get(i).getFood(pilihFood).getJumlah() - 1);
                                }
                                else{
                                    System.out.println("Dragon atau makanan tidak ada");
                                }
                                
                                for (int j = player.get(i).getFood().size() - 1; j >= 0; j--) {// kalau food stok nya habis, dihilangkan
                                    if(player.get(i).getFood(j).getJumlah() <= 0){
                                        player.get(i).getFood().remove(j);
                                    }
                                }
                                for (int j = 0; j < player.get(i).getDragon().size(); j++) {
                                    if(player.get(i).getDragon(j).getLevel() == 5){
                                        player.get(i).getDragon(j).addSkill(5);
                                    }
                                    else if(player.get(i).getDragon(j).getLevel() == 10){
                                        player.get(i).getDragon(j).addSkill(10);
                                    }
                                }
                            }else if(menu2==6){
                                int pilih = -1; boolean hehe = true;
//                                ArrayList<Integer> pick = new ArrayList<>();
                                do{
                                    System.out.println("Daftar Dragon");
                                    for (int j = 0; j < player.get(i).getDragon().size(); j++) {
                                        int ctr = j+1;
                                        System.out.print(ctr+". ");
                                        System.out.println("Nama Dragon : " + player.get(i).getDragon(j).getName());
                                        System.out.println(" Level Dragon: " + player.get(i).getDragon(j).getLevel());
                                        System.out.println(" EXP         : " + player.get(i).getDragon(j).getEXP() + "/" +player.get(i).getDragon(j).getMaxEXP());
                                        System.out.println(" Attack      : " + player.get(i).getDragon(j).getAttack());
                                        System.out.println(" Defend      : " + player.get(i).getDragon(j).getDefend());
                                        System.out.println(" Health      : " + player.get(i).getDragon(j).getHealth());
                                        System.out.println(" SKILLS : ");
                                        for (int k = 0; k < player.get(i).getDragon(j).getSkill().size(); k++) {
                                            System.out.println((k+1) + ". " + player.get(i).getDragon(j).getSkill(k).getNamaSkill() + " - Elemen : " + player.get(i).getDragon(j).getSkill(k).getElemen() + " - Damage : " + player.get(i).getDragon(j).getSkill(k).getDamage());
                                        }
                                        System.out.println("==============================");
                                    }
                                    System.out.println("0. Back");
                                    System.out.print(">> ");
                                    pilih = cin.nextInt();
                                    if(pilih==0) hehe = false;
                                    else {
                                        boolean finish = false,win=false;
                                        
                                        Enemy e = new Enemy();
                                        int q;
                                        do{
                                        System.out.println("==============================");
                                        System.out.println("Nama Dragon : Eragon");
                                        System.out.println(" Level Dragon: " + e.getLevel());
                                        System.out.println(" Health      : " + e.getHealth());
                                        System.out.println("----------------------------------");
                                        System.out.println("Player's Turn");
                                        System.out.println("Nama Dragon : " + player.get(i).getDragon(pilih-1).getName());
                                        System.out.println(" Level Dragon: " + player.get(i).getDragon(pilih-1).getLevel());
                                        System.out.println(" Health      : " + player.get(i).getDragon(pilih-1).getHealth());
                                        System.out.println("==============================");
                                            System.out.println("1. Attack");
                                            System.out.println("2. Skill");
                                            System.out.println("3. Defend");
                                            System.out.print(">> ");
                                            q = cin.nextInt();
                                            
                                            if(q==1){
                                                e.setHealth(e.getHealth()-player.get(i).getDragon(pilih-1).getAttack());
                                                System.out.println(player.get(i).getDragon(pilih-1).getName()+" menghasilkan damage sebesar "
                                                        +player.get(i).getDragon(pilih-1).getAttack()+" poin");
                                            }else if(q==2){
                                                System.out.println(" SKILLS : ");
                                                for (int k = 0; k < player.get(i).getDragon(pilih-1).getSkill().size(); k++) {
                                                    System.out.println((k+1) + ". " + player.get(i).getDragon(pilih-1).getSkill(k).getNamaSkill() + " - Elemen : " + player.get(i).getDragon(pilih-1).getSkill(k).getElemen() + " - Damage : " + player.get(i).getDragon(pilih-1).getSkill(k).getDamage());
                                                }System.out.println(">> ");int s = cin.nextInt();
                                                e.setHealth(e.getHealth()-player.get(i).getDragon(pilih-1).getSkill(s-1).getDamage());
                                                System.out.println(player.get(i).getDragon(pilih-1).getName()+" menghasilkan damage sebesar "
                                                        +player.get(i).getDragon(pilih-1).getSkill(s-1).getDamage()+" poin");
                                                
                                            }else if(q==3){
                                                
                                            }
                                            int en = random(3);
                                            if(en==1){
                                                player.get(i).getDragon(pilih-1).setHealth(player.get(i).getDragon(pilih-1).getHealth()-e.getAttack());
                                                System.out.println("Eragon menghasilkan damage sebesar "+ e.getAttack()+" poin");
                                            }else if(en==2){
                                                player.get(i).getDragon(pilih-1).setHealth(player.get(i).getDragon(pilih-1).getHealth()-e.getSkill(0).getDamage());
                                                System.out.println("Eragon menghasilkan damage sebesar "+ e.getSkill(0).getDamage()+" poin");
                                            }else if(en==3){
                                                
                                            }
                                            
                                            if(player.get(i).getDragon(pilih-1).getHealth()<=0) finish = true;
                                            else if(e.getHealth()<=0) {
                                                finish = true;
                                                win=true;
                                            }
                                        }while(!finish);
                                        if(win==true){
                                            int k = random(200) + 300;
                                            player.get(i).setGold(player.get(i).getGold()+k);
                                            System.out.println("Selamat anda berhasil mengalahkan Eragon dan mendapat gold sebanayak "+k);
                                        }
                                    }
                                    
                                }while(hehe);
                            }
                            
                        }while(menu2 != 0);
                    }
                }
            }
            else if(menu1 == 2){
                System.out.println("REGISTRATION");
                String username, pw;
                System.out.print("Masukkan username : ");
                username = cstr.nextLine();
                System.out.print("Masukkan Password : ");
                pw = cstr.nextLine();
                System.out.println("Player added !");
                player.add(new Player(username,pw));
            }
        }while(menu1 != 0);
    }
    
    static int random(int x){
        Random r = new Random();
        return r.nextInt(x)+1;
    }
}

