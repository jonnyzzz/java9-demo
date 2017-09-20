package org.jetbrains.demo9.services;

public class IntelliService {

  public static void request() {
    System.out.println("IntelliService in module: " + IntelliService.class.getModule());

  }
}
