package org.jetbrains.demo9.services;

public class IntelliService {

  @Deprecated(forRemoval = true, since = "2011")
  public static void request() {
    System.out.println("IntelliService.class module: " + IntelliService.class.getModule());

  }
}
