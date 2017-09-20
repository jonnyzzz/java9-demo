package org.jetbrains.demo9.services;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntelliService {

  private static final Map<String, String> meaningfulData
          = Collections.unmodifiableMap(new HashMap<>() {{
    put("IntelliJ", "IDEA");
    put("San Francisco", "California");
    put("Java", "One");
    put("Java 9", "Jigsaw");
  }});

  private final Set<String> meaningfulSet = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
          "a", "b", "c"
  )));


  public static List<String> request(Set<String> keys) {
    System.out.println("IntelliService in module: " + IntelliService.class.getModule());

    return keys.stream().map(meaningfulData::get).flatMap(val -> {
      if (val == null) {
        return Stream.empty();
      } else {
        return Stream.ofNullable(val);
      }
    }).collect(Collectors.toList());
  }
}
