/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcustomers;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;



/**
 *
 * @author siraphat
 */
public class CustomerFacade {
    public ArrayList<AccountIf> cust1Accounts = new ArrayList();
    public ArrayList<AccountIf> cust2Accounts = new ArrayList();
    public ArrayList<AccountIf> accounts = new ArrayList();
    public AccountIf acc;
    public AccountIf acc2;
    public CustomerIf cust1;
    public CustomerIf cust2;
    public CustomerIf cus;
    private ArrayList<CustomerIf> customers = new ArrayList();
    private static CustomerFacade myFacadeObj = null;
    public static CustomerFacade getMyFacadeObject() {
        if (myFacadeObj == null) {
            myFacadeObj = new CustomerFacade();
        }
        return myFacadeObj;
    }
    
    public  CustomerFacade() {

        acc = new BankAccount(12345);
        acc.deposit(5000);
        cust1Accounts.add(acc);
        acc = new BankAccount(12346);
        acc.deposit(1000);
        cust1Accounts.add(acc);
        cust1 = new BankCustomer("John", cust1Accounts);
       

        acc2 = new BankAccount(12347);
        acc2.deposit(5000);
        cust2Accounts.add(acc2);
        acc2 = new BankAccount(12348);
        acc2.deposit(1000);
        cust2Accounts.add(acc2);
        cust2 = new BankCustomer("Aye", cust2Accounts);
        
    }
    
    public void doDeposit(double amt, CustomerIf cust, int accNo) {
        cust.getAccount(accNo).deposit(amt);
    }

    public void getBankAccount(CustomerIf cust, int accNo) {
       AccountIf account = cust.getAccount(accNo);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
    }
    
    public void getBankCustomer(String custName){
       ArrayList<AccountIf> accounts = cust1.getllAccounts();
       for(AccountIf account : accounts) {
           System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
       }
    }
    
    
}
