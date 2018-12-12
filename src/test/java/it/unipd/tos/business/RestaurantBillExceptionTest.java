package it.unipd.tos;

import it.unipd.tos.business.exception.RestaurantBillException;
import static org.junit.Assert.assertEquals;
public class RestaurantBillExceptionTest{

    @org.junit.Test
    public void testGetMessage(){
        RestaurantBillException exception = new RestaurantBillException("Test");
        assertEquals(exception.getMessage(), "Test");
    }
}
