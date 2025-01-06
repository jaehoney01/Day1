package org.example;

import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            System.out.println("가위0,바위1,보자기2 입력하세요");
            String str = scanner.nextLine(); //키보드에서 입력한 문자열
            System.out.println(str);
            int user = Integer.parseInt(str);

            int com = (int) (Math.random() * 2);

            user = user < com ? user + 3 : user;

            int result = user - com;

            System.out.println("USER: " + user);
            System.out.println("COM: " + com);
            switch (result) {
                case 0:
                    System.out.println("비김");
                    break;
                case 1:
                    System.out.println("이김");
                    count++;
                    break;
                case 2:
                    System.out.println("짐");
                    count =0;
                    break;

            }
            System.out.println("현재 승리 수:"+count);
            if (count ==3){
                break;
            }
        }






    }
}
