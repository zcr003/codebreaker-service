package edu.cnm.deepdive.codebreaker.controller;

import java.util.NoSuchElementException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionResponseMapping {

  @ExceptionHandler(NoSuchElementException.class)
  @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Resource not found")
  public void notFound() {
  }

  @ExceptionHandler(IllegalArgumentException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid Request Content")
  public void badRequest() {
  }

  @ExceptionHandler(IllegalStateException.class)
  @ResponseStatus(value = HttpStatus.CONFLICT, reason = "The Game has Already Been Solved")
  public void gameAlreadySolved() {
  }

}
