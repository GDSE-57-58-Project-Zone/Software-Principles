package service;

import java.util.List;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface Payment {
    //void initiatePayments();
    Object status();
    List<Object> getPayments();

    /* Introduce new features for the payments */
    //void initiateLoanSettlement();
    //void initiateRePayment();
}