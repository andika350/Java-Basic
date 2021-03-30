package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// Ini komen 1 line
        /*
        Ini komen multiple line
         */

        //assign variable
        int x = 10;

        System.out.println("Variable x = "+ x+"\n");

        //reassign variable value
        System.out.println("Reassign value of x to 20");
        x = 20;
        System.out.println("Variable x = "+ x);

        //declaring empty variable
        int y;

        //aritmatika

        int variable1 = 20;
        int variable2 = 10;
        int hasil;

        // +
        hasil = variable1 + variable2;
        System.out.println(variable1+" + "+variable2 +" = "+ hasil);
        // -
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d\n",variable1,variable2,hasil);
        // *
        hasil = variable1 * variable2;
        System.out.println(variable1+ " * " + variable2+" = "+hasil);
        // /
        hasil = variable1 / variable2;
        System.out.println(variable1+ " / " + variable2+" = "+hasil);
        float float1 = 5;
        float float2 = 3;
        float hasilFloat = float1/float2;
        System.out.println(float1+ " / " + float2+" = "+hasilFloat);
        // %
        hasil = variable1 % variable2;
        System.out.println(variable1+ " % " + variable2+" = "+hasil);



        //konversi numeric
        System.out.println("integer max value: "+Integer.MAX_VALUE);
        System.out.println("integer min value: "+Integer.MIN_VALUE);

        int h = 10; //int 32bit
        System.out.println("\n\nNilai int: "+h);

        //konversi ke tipe data yang lebih besar
        long nilaiLong = h;//long 64bit
        System.out.println("Nilai long: "+nilaiLong);
        System.out.println("Nilai long: "+(long)h); //oneline casting

        //konversi ke tipe data yang lebih kecil
        byte nilaiByte = (byte)h; /*dengan casting operator, harus hati-hati karena nilai yang akan dikonversi
        tidak bisa melebihi rentang MAX-MIN Value dari tipe data yang lebih kecil, karena akan merubah valuenya.*/
        System.out.println("Nilai byte: "+nilaiByte);

        //byte -> short -> int -> long

        //casting divide, salah satu dari tipe data dari operan harus sama dengan tipe data hasil.
        int a = 10;
        float b = 3;
        float c = a/b;

        System.out.printf("%d / %f = %f\n",a,b,c); //%d=decimal %f=float

        int d = 6;
        int e = 4;
        float f = (float)d /e; //mengcasting variable d menjadi tipe data float dengan casing(float)

        System.out.printf("%d / %d = %f",d,e,f);

    }
}
