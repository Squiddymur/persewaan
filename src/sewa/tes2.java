package sewa;

import java.util.Scanner;

public class tes2 extends tes1{
    public void sewa_mobil(){
        super.sewa_mobil();
        Scanner input = new Scanner(System.in);
        int jenis;
        int hari;
        int harga;
        System.out.println("Silahkan pilih jenis mobil yang akan disewa : ");
        jenis = input.nextInt();
    
        if(jenis == 1){
            System.out.println("Berapa hari akan anda pinjam :");
            hari = input.nextInt();
            harga = 50000*hari;
            System.out.println("Total harganya : Rp "+harga);     
        }
        else if(jenis == 2){
            System.out.println("Berapa hari akan anda pinjam :");
            hari = input.nextInt();
            harga = 75000*hari;
            System.out.println("Total harganya : Rp "+harga);
        }
        else if(jenis == 3){
            System.out.println("Berapa hari akan anda pinjam :");
            hari = input.nextInt();
            harga = 200000*hari;
            System.out.println("Total harganya : Rp "+harga);
        }
        else if(jenis == 4){
            System.out.println("Berapa hari akan anda pinjam :");
            hari = input.nextInt();
            harga = 300000*hari;
            System.out.println("Total harganya : Rp "+harga);
        }
    }

    
}
