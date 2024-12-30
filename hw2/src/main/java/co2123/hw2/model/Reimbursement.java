package co2123.hw2.model;

import jakarta.persistence.*;

@Entity
public class Reimbursement {


    @Id
    @GeneratedValue
    private int identifier;
    private int amount;

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "identifier=" + identifier +
                ", amount=" + amount +
                '}';
    }
}
