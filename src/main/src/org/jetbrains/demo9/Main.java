package org.jetbrains.demo9;

import org.jetbrains.demo9.services.IntelliService;
import org.junit.Assert;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello JavaOne!");
    System.out.println();

    final RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
    System.out.println("from " + bean.getVmName() + " " + bean.getVmVersion());

    System.out.println();
    System.out.println("in module: " + Main.class.getModule());

    IntelliService.request(Set.of("a", "b", bean.getVmName())).forEach(System.out::println);

    Assert.assertEquals(42, 42L);

    System.out.println("Assert module " + Assert.class.getModule() );
  }
}
