/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import bankcustomers.CustomerFacade;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerFacade obj = new CustomerFacade();
        obj.getBankAccount(obj.cust1, 12345);
        obj.doDeposit(50000.00, obj.cust1, 12345);
        obj.getBankAccount(obj.cust1, 12345);
        obj.getBankCustomer("Aye");
    }
    
}
