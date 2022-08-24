package service.types;

import service.Account;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class FixedAccount extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Fixed Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from your Fixed Account.!");
    }
    /* Ok. Eventually, here we have a trouble. */
    /* Fixed accounts cannot have a withdrawn option */
    /* So keep  in mind that */
}