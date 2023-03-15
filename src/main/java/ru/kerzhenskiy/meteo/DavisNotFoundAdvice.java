package ru.kerzhenskiy.meteo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class DavisNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(DavisNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String davisNotFoundHandler(DavisNotFoundException ex) {
    return ex.getMessage();
  }
}