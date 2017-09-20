package org.jetbrains.demo9.services;

import java.util.*;

public class Helpers {
  public static final Map<String, String> meaningfulData
          = Collections.unmodifiableMap(new HashMap<>() {{
    put("IntelliJ", "IDEA");
    put("San Francisco", "California");
    put("Java", "One");
    put("Java 9", "Jigsaw");
  }});

  public final Set<String> meaningfulSet = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
          "a", "b", "c"
  )));













  public static final Map<String, String> newMeaningfulData =
          Map.ofEntries(
                  Map.entry("IntelliJ", "IDEA"),
                  Map.entry("San Francisco", "California"),
                  Map.entry("Java", "One"),
                  Map.entry("Java 9", "Jigsaw")
          );
}
