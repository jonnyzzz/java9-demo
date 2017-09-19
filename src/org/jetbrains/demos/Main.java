package org.jetbrains.demos;

import java.lang.management.ManagementFactory;

public class Main {
  public static void main(String[] args) {
    System.out.println("Running with Java " + ManagementFactory.getRuntimeMXBean().getVmVersion());
    System.out.println("Hello JavaOne!");
  }
}
