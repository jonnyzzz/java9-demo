package org.jetbrains.demo9.services;

import java.util.Set;

public class IntelliService {
  public static void request(Set<String> keys) {
    System.out.println("IntelliService in module: " + IntelliService.class.getModule());
  }
}
