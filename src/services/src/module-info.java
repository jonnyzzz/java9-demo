module org.openjdk.demo.services {
  requires static java.sql;
  requires transitive java.logging;

  exports org.jetbrains.demo9.services;
}
