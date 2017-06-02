package com.learningOOP;

/**
 * Created by BIC on 6/3/2017.
 */
public class Account {

    private String Number;
    private double balance;
    private String customerName;
    private String emailaddress;
    private String phoneNumber;

    public void deposit(double depositeAmount) {

        this.balance += depositeAmount;
        System.out.println("Deposit of ₹ " +depositeAmount + " has been made. Remaning balance is ₹ " + this.balance);


    }

    public void withDrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount <=0) {
            double requiredBalance = withdrawalAmount - this.balance;
            System.out.println("Insifficient balance remaining. You've got $ " + this.balance + ". Deposit ₹ " +requiredBalance +  " to withdraw the amount of " +withdrawalAmount);
        }
        else {
            balance -= withdrawalAmount;

            System.out.println("Withdrawal processed, amount of ₹ " +withdrawalAmount + " has been withdrawan. Remaining balance is " +this.balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}



