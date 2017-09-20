package org.jetbrains.demo9;

import org.jetbrains.demo9.services.IntelliService;
import org.jetbrains.demo9.services.JSON;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println();
    System.out.println("Hello JavaOne!");
    System.out.println();

    final RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
    System.out.println("from " + bean.getVmName() + " " + bean.getVmVersion());

    System.out.println();
    System.out.println("Main.class module: " + Main.class.getModule());

    IntelliService.request();

    System.out.println();
    System.out.println(JSON.generateJSON());
  }
}
