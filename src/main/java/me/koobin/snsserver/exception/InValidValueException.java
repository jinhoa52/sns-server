package me.koobin.snsserver.exception;

public class InValidValueException extends RuntimeException {

  public InValidValueException() {
    super();
  }
  public InValidValueException(String message) {
    super(message);
  }
}