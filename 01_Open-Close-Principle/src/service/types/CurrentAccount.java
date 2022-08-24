package service.types;

import service.Account;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class CurrentAccount extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Current Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from your Current Account.!");
    }
}