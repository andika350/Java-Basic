package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // operator assignment
        /*
        Dengan arimatik operator kita dapat melakukan operasi matematika seperti penambahan, pengurangan,
        pembagian, perkalian, dan modulus.
        ex: int a = 10;
            a = a + 5;
            a= 15

        Dengan menggunakan operator assignment kita dapat mempersingkat kode kita.
         */

        //assignment tambah
        int a = 10;
        a += 10;
        System.out.println("Nilai dari a: "+a);

        //assignment kurang
        int b = 10;
        b -= 1;
        System.out.println("Nilai dari b: "+b);

        //assignment bagi
        int c = 10;
        c /= 2;
        System.out.println("Nilai dari c: "+c);

        //assignment kali
        int d = 10;
        d *= 10;
        System.out.println("Nilai dari d: "+d);

        //assignment modulus
        int e = 10;
        e %= 3;
        System.out.println("Nilai dari e: "+e+"\n\n");


        //operator komparasi, menghasilkan nilai dalam bentuk boolean
        int nilai1, nilai2;
        boolean hasilKomparasi;

        nilai1 = 10;
        nilai2 = 12;
        System.out.printf("nilai1 = %d nilai2 = %d\n",nilai1,nilai2);
        hasilKomparasi = (nilai1 == nilai2);

        System.out.println("----Persamaan----");
        System.out.printf("nilai1 == nilai2 => %s\n",hasilKomparasi);

        hasilKomparasi = (nilai1 != nilai2);
        System.out.println("----Pertidaksamaan----");
        System.out.printf("nilai1 != nilai2 => %s\n", hasilKomparasi);

        hasilKomparasi = (nilai1 > nilai2);
        System.out.println("----Lebih besar----");
        System.out.printf("nilai1 > nilai2 => %s\n", hasilKomparasi);

        hasilKomparasi = (nilai1 < nilai2);
        System.out.println("----Lebih kecil----");
        System.out.printf("nilai1 < nilai2 => %s\n", hasilKomparasi);

        nilai1 = 20;
        nilai2 = 20;
        System.out.printf("\nnilai1 = %d nilai2 = %d\n",nilai1,nilai2);
        hasilKomparasi = (nilai1 >= nilai2);
        System.out.println("----Lebih besar sama dengan----");
        System.out.printf("nilai1 >= nilai2 => %s\n", hasilKomparasi);

        hasilKomparasi = (nilai1 <= nilai2);
        System.out.println("----Lebih kecil sama dengan----");
        System.out.printf("nilai1 <= nilai2 => %s\n", hasilKomparasi);



    }
}
