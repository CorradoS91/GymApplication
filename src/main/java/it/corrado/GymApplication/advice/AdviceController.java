package it.corrado.GymApplication.advice;

import it.corrado.GymApplication.error.GymApiError;
import it.corrado.GymApplication.exception.IdNotFoundException;
import it.corrado.GymApplication.exception.NameNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.naming.Name;
import java.time.Instant;

@ControllerAdvice
@ResponseBody
public class AdviceController {
    @ExceptionHandler(IdNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public GymApiError handleIdNotFoundException(IdNotFoundException exception, HttpServletRequest request){
        GymApiError error = new GymApiError();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setPath(request.getRequestURL().toString());
        error.setTimestamp(Instant.now());
        error.setMessage(exception.getMessage());
        return error;
    }
    @ExceptionHandler(NameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public GymApiError handleNameNotFoundException(NameNotFoundException exception, HttpServletRequest request){
        GymApiError error = new GymApiError();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setPath(request.getRequestURL().toString());
        error.setTimestamp(Instant.now());
        error.setMessage(exception.getMessage());
        return error;
    }
    @ExceptionHandler(SurnameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public GymApiError handleNameNotFoundException(SurnameNotFoundException exception, HttpServletRequest request){
        GymApiError error = new GymApiError();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setPath(request.getRequestURL().toString());
        error.setTimestamp(Instant.now());
        error.setMessage(exception.getMessage());
        return error;
    }
}
