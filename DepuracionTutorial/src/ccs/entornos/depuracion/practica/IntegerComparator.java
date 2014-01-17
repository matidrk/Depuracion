package ccs.entornos.depuracion.practica;

import java.util.Comparator;

/**
 * This class implements the Comparator interface, and compares Integers.
 * 
 * @see java.util.Comparator
 */
public class IntegerComparator implements Comparator<Integer> {
  private static final IntegerComparator INSTANCE = new IntegerComparator();

  private IntegerComparator() { }

  /**
   * Compares two Integers using their compareTo function.
   * 
   * @return (i1).compareTo(i2);
   */
  public int compare(Integer i1, Integer i2) 
  {
    return i1.compareTo(i2);
  }

  /**
   * Returns an instance of the class IntegerComparator.
   */
  public static IntegerComparator getInstance() {
    return INSTANCE;
  }
}

