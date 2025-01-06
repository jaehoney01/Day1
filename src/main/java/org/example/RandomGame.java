package org.example;

import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = (int)(Math.random()*6); // 0~5

        for(int i=0; i<6; i++){
            System.out.println("i----"+i);
            scanner.nextLine();

            if(value==1){
                System.out.println("당첨");
                break;
            }
        }
    }
}
