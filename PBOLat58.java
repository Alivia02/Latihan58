/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan58.tambahkurang;

/**
 *
 * @author ACER
 */
public class PBOLat58 {
    private int x;
    private int y;

    public PBOLat58(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

// JumlahBilangan.java
class JumlahBilangan extends PBOLat58 {
    public JumlahBilangan(int x, int y) {
        super(x, y);
    }

    public int hitungJumlah() {
        return getX() + getY();
    }
}

// SelisihBilangan.java
class SelisihBilangan extends PBOLat58 {
    public SelisihBilangan(int x, int y) {
        super(x, y);
    }

    public int hitungSelisih() {
        return getX() - getY();
    }
}

// ContohPenggunaan.java
class ContohPenggunaan {
    public static void main(String[] args) {
        JumlahBilangan jumlah = new JumlahBilangan(3, 4);
        SelisihBilangan selisih = new SelisihBilangan(3, 4);

        System.out.println("Hasil perjumlah = " + jumlah.hitungJumlah());
        System.out.println("Hasil Selisih 3 - 4 = " + selisih.hitungSelisih());
    }
}