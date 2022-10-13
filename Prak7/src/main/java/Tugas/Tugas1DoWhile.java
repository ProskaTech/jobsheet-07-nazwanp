/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.util.Scanner;


/**
 *
 * Created by Nazwa Nurfadhilla
 */
public class Tugas1DoWhile {
      public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i=0;

        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();

        do{
            System.out.println(i+" "+nama);
            i++;
        }
        while(i<=10);
    }
}