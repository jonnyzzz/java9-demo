package org.jetbrains.demo9.services;

public class IntelliService {

  @Deprecated(forRemoval = true, since = "2011")
  public static void killMe() {
    Thread.currentThread().stop(new Throwable("Bye, Java 1.0"));
  }
}
