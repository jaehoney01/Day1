package org.example;

public class Item {
    private String sale;
    private int amount;

    // Item 클래스 생성자
    public Item(String sale, int amount) {
        this.sale = sale;
        this.amount = amount;
    }

    public String getSale() {
        return sale;
    }

    public int getAmount() {
        return amount;
    }
}
