////////////////////////////////////////////////////////////////////
// [DAVIDE] [ZILIO] [1149807]
///////////////////////////////////////////////////////////////////

package it.unipd.tos.business.exception;

public class RestaurantBillException extends Exception {
    
    public RestaurantBillException(String m){
        super(m);
    }
    
    public String getMessage(){
        return super.getMessage(); 
    }
}
