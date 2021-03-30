package com.tutorial;

public class Main {

    public static void main(String[] args) {
	//unary operator
        //unary + dan -
        int numb1 = 5;
        System.out.printf("numb1: %d\n",numb1);
        System.out.printf("\nunary '+' dari numb1: %d",+numb1); //tidak berubah karena nilai dasar sudah positif
        System.out.printf("\nunary '-' dari numb1: %d\n\n",-numb1);//berubah menjadi -5

        //decrement dan increment
        int numb2 = 20;

        System.out.printf("numb2: %d\n",numb2);
        System.out.printf("numb2 dengan decrement '--' menjadi: %d\n",--numb2);

        int numb3 = 30;
        System.out.printf("numb3: %d\n",numb3);
        System.out.printf("numb2 dengan increment '++' menjadi: %d\n\n",++numb3);

        //increment postfix dan prefix
        int a = 5;
        int b = 10;

        System.out.printf("Nilai postfix dari a++: %d\n",a++);
        System.out.printf("postfix a++ :%d\n",a); /*karena menggunakan postfix (a++) maka variable akan
        dipanggil terlebih dahulu baru setelahnya dilakukan increment*/

        System.out.printf("Nilai awal b: %d\n",+b);
        System.out.printf("Nilai dengan prefix ++b: %d\n\n",++b);/*prefix memungkinkan kita mengubah nilai
        sebelum variable di panggil */

        //unary untuk boolean (!) untuk menegasi nilai variable
        boolean married = true;
        System.out.println("Marital status: "+ married);
        System.out.println("Marital status: "+ !married);
    }
}
