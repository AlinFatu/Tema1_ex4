package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n;
        System.out.print("Numarul de elemente al vectorului este de:");
        Scanner S=new Scanner(System.in);
        n=S.nextInt();
        int [] array=new int[n];
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print("Elementul de pe pozitia"+" "+i+" "+"va fi:");
            Scanner A=new Scanner(System.in);
            array[i]=A.nextInt();
            System.out.println();
        }
        int nr_par=0;
        int nr_impar=0;

        for(int i=0;i<n;i++){
            if(array[i]%2==0){
                nr_par++;
            }
            else {
                nr_impar++;
            }
        }
System.out.println("In vector avem"+" "+nr_impar+" "+"numar/numeree impar/e");
        System.out.println("In vector avem"+" "+nr_par+" "+"numar/numere par/e");
    }
}
