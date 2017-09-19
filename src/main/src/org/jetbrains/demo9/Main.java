package org.jetbrains.demo9;

import org.jetbrains.demo9.ddd.CreateMe;
import org.jetbrains.demo9.ddd.Logger;
import org.jetbrains.demo9.ddd.Service2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.ServiceLoader;

public class Main {
  public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    System.out.println("Hello JavaOne!");

    //now we call the service
    Service2.service();

    CreateMe.class.getDeclaredConstructor().newInstance();

    System.out.println(CreateMe.class.getModule());

    for (Method method : CreateMe.class.getMethods()){
      System.out.println("Methdod " + method);
    }

    ServiceLoader.load(Logger.class).findFirst().get().log(Map.of("a", "b"));
  }
}
