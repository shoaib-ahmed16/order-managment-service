package order.management.system.exception;

public class OrderUnknownServerException extends RuntimeException{
    public  OrderUnknownServerException(){

    }
    public  OrderUnknownServerException(String message){
        super(message);
    }
}
