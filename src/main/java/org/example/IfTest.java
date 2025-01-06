package org.example;

public class IfTest {

    public static void main(String[] args)
    {
        int value = (int) (Math.random()*6)+1;
        int oddWEven = value % 2;
        
        if(oddWEven == 0){
            System.out.println("짝수");
        } else if (oddWEven == 1) {
            System.out.println("홀수");
        }
        System.out.println(value+"ㅎㅎ");
    }
}
