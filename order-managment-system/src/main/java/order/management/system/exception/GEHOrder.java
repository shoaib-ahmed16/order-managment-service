package order.management.system.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice
public class GEHOrder {

    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(OrderNotFoundException order){
        return new ResponseEntity<>(order.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(OrderUnknownServerException order){
        return new ResponseEntity<>(order.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(SQLException order){
        return new ResponseEntity<>(order.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<String> exceptionHandler(Exception order){
        return new ResponseEntity<>(order.getMessage(), HttpStatus.NOT_FOUND);
    }
}
