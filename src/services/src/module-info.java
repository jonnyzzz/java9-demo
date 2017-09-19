import org.jetbrains.demo9.ddd.Logger;
import org.jetbrains.demo9.y.LoggerImpl;

module org.jetbrains.demo9x.services {
  exports org.jetbrains.demo9.ddd;

  provides Logger with LoggerImpl;
}
