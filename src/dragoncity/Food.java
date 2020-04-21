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
public abstract class Food {
    protected String name;
    protected int tambahEXP, jumlah, harga;
    
    public Food(){
        jumlah = 1;
    }

    public String getName() {
        return name;
    }

    public int getTambahEXP() {
        return tambahEXP;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTambahEXP(int tambahEXP) {
        this.tambahEXP = tambahEXP;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
