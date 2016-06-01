package hw3.haskell2c;


import com.sun.istack.internal.NotNull;

/**
 * Created by eugene on 2016/05/08.
 */
public class Arg {
  String name;
  Boolean isConst;

  public Arg(@NotNull String name, Boolean isConst) {
    this.name = name;
    this.isConst = isConst;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public String toString() {
    return "name: " + name + "; const: " + isConst;
  }
}

