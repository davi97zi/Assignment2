////////////////////////////////////////////////////////////////////
// [DAVIDE] [ZILIO] [1149807]
///////////////////////////////////////////////////////////////////

package it.unipd.tos.business.exception;

@SuppressWarnings("serial")
public class RestaurantBillException extends Throwable {
    public RestaurantBillException(double d){
      super("Prezzo riportato: "+d);
    }
}