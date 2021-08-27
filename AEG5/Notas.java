package com.uri;
import java.io.IOException;
import java.util.Scanner;
public class Notas {

    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner (System.in);
        int nota;
        
        nota = in.nextInt();

        if (nota==0) {
            System.out.println("E");
        } else if(nota<=35 && nota>=1){
            System.out.println("D");
        } else if(nota<=60 && nota>=36){
            System.out.println("C");
        } else if(nota<=85 && nota>=61){
            System.out.println("B");
        } else if(nota<=100 && nota>=86){
            System.out.println("A");
        }   
    }
}