package ru.kerzhenskiy.meteo;

public class DavisNotFoundException extends RuntimeException{
  DavisNotFoundException(Long id) {
    super("Could not find data " + id);
  }
}
