package com.rv.t6;

public class T6_5 {
    public static void main(String[] args) {
        SavingBox savingBox1 = new SavingBox();
        System.out.println(savingBox1.toString());

        SavingBox savingBox2 = new SavingBox(35);
        savingBox2.addBalance(34);
        System.out.println(savingBox2.toString());
    }
}

class SavingBox {
    private int nof_transaction = 0;
    private int balance = 0;

    SavingBox() {
        this.balance += 50;
        this.nof_transaction++;
    }

    SavingBox(int amount) {
        this.balance += 50 + amount;
        this.nof_transaction++;
    }

    public void addBalance(int amount) {
        this.balance += amount;
        this.nof_transaction++;
    }

    @Override
    public String toString() {
        return "SavingBox{" +
                "nof_transaction=" + nof_transaction +
                ", balance=" + balance +
                '}';
    }
}
