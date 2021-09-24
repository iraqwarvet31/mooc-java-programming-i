/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justadev
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard (double openingBalance) {
        this.balance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        double difference = this.balance - 2.60;
        if (difference > -1) {
            this.balance = difference;
        }
    }
    
    public void eatHeartily() {
        double difference = this.balance - 4.60;
        if (difference > -1) {
            this.balance = difference;
        }
    }
    
    public void addMoney(double amount) {
        double addition = this.balance + amount;
        if (addition >= 150) {
            this.balance = 150.0;
        } else if (addition >= 0 && addition < 150) {
            this.balance += amount;
        } 
    }
}
