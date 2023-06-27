/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebak_angka;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author user
 */
public class Tebak_angka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int kesempatan = 0;
        int angkaRandom = random.nextInt(10) + 1;
        int angka;
        boolean ketebak = false;

        while (kesempatan != 3) {
            System.out.print("Masukkan tebakan[1-10]: ");
            angka = in.nextInt();

            if (angka == angkaRandom) {
                ketebak = true;
                break;
            } else {
                if (angka >= angkaRandom + 1) {
                    System.out.println("Angka terlalu besar");
                } else if (angka <= angkaRandom - 1) {
                    System.out.println("Angka terlalu kecil");
                } else if (angka == angkaRandom + 1 || angka == angkaRandom - 1) {
                    System.out.println("Dikit lagi");
                }
                kesempatan++;
            }
        }

        if (ketebak) {
            System.out.println("Berhasil");
        } else {
            System.out.println("Gagal");
        }

    }

}
