package org.jetbrains.demo9;

import org.jetbrains.demo9.ddd.Service2;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello JavaOne!");

    //now we call the service
    Service2.service();
  }
}
