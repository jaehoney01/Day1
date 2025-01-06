package org.example;

import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int user = 1;
     int com = 0;
     user = user < com ? user+3 : user;

     int result = user - com;
     switch (result){
         case 0:
             System.out.println("비김");
             break;
         case 1:
             System.out.println("이김");
             break;
         case 2:
             System.out.println("짐");
             break;

     }

//     if (user < com){
//         user = user + 3;
//     }
    }
}
