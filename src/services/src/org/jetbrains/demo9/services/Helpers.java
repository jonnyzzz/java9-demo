package org.jetbrains.demo9.services;

import java.util.*;

public class Helpers {
  Map<String, String> meaningfulData
          = Collections.unmodifiableMap(new HashMap<>() {{
    put("IntelliJ", "IDEA");
    put("San Francisco", "California");
  }});

  Set<String> meaningfulSet
          = Collections.unmodifiableSet(new HashSet<>(
          Arrays.asList(
                  "a", "b", "c"
          )));
}
