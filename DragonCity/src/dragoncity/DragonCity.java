/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragoncity;

import java.util.ArrayList;
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
                                    //lek player gak punya food gardener baru di add new, lek sudah ada tros beli lagi, bukan add new, tapi disearch tros tambah jumlah e gardener
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
    
}
