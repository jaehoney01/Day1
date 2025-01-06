package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator4U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sum = new ArrayList<>();

        int result = 0;
        while(true){
            System.out.println("입력");
            String str = scanner.nextLine();
            if (str.equals("back")) {
                if (!sum.isEmpty()) {
                   sum.remove(sum.size() - 1);
                } else {
                    System.out.println("지우기불가");
                }
                continue;
            }
            if (str.equals("END")) {

                break;
            }
            int value = Integer.parseInt(str);
            sum.add(value);

        }
        for (int value : sum) {
            result += value;
        }
        System.out.println("합계"+result);




    }
}
