package com.superKeyword.bankAccounts;

public class StudentAccount extends Account
{
    // Complete this class with Override methods.   
    
    public StudentAccount(String studentName, double openingBal){
        super(studentName, openingBal);
    }
    
    // Students get a $1 bonus on depositing
    @Override
    public void deposit(double amt){
        super.deposit(amt + 1);
    }
    
    
    // Students pay a $2 fee for withdrawing
    @Override
    public void withdrawal(double amt){
        super.withdrawal(amt + 2);
    }
    
    
    // toString() Should read: Student account with a balance of $__.__
    @Override
    public String toString(){
        return "Student account with a balance of $"+ super.getBalance();
    }
}
