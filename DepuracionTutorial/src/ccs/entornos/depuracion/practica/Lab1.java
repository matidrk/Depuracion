package ccs.entornos.depuracion.practica;
import java.util.*;

/**
 * This contains the <code>main</code> function for this lab. You will need to
 * execute this code to test your changes to BugRidden.java.
 */
public class Lab1 {
  public static void main(String[] args) {
    // Initialization for Exercise 1
    Integer arr[];
    List<Integer> list = new ArrayList<Integer>();      //parameterize

    // create a sorted list 1, 3, 5,.... 199
    for (int i = 0; i < 100; i++) {
      list.add(2*i+1);              //auto-boxing
    }
    System.out.println("Before running convertToArray(), list = " + list);
    arr = BugRidden.convertToArray(list);
    System.out.println("Afterwards, arr = " + Arrays.asList(arr) + " and list = " + list);

    // Initialization for Exercises 2 and 3
    Integer arr1[] = new Integer[100];
    Integer arr2[] = {new Integer(1)};
    
    List<Integer> list1;
    List<Integer> list2;
    int index;

    // create a sorted list 1, 3, 5,.... 199
    for (int i=0; i < 100; i++) {                ///FIX: look up new for loop
      arr1[i] = new Integer(2*i+1);
    }

    
    list1 = Arrays.asList(arr1);
    list2 = Arrays.asList(arr2);
    Integer one = new Integer(1);
    Integer two = new Integer(2);
    IntegerComparator ic = IntegerComparator.getInstance();

    // Exercise 2
    index = BugRidden.binarySearch(list1, one, ic);
    System.out.println("Found 1 at index = " + index);

    index = BugRidden.binarySearch(list1, two, ic);
    System.out.println("Found 2 at index = " + index);

    index = BugRidden.binarySearch(list2, one, ic);
    System.out.println("Found 1 at index = " + index);

    // Exercise 3
    index = BugRidden.binarySearch(arr1, one, ic);
    System.out.println("Found 1 at index = " + index);

    index = BugRidden.binarySearch(arr1, two, ic);
    System.out.println("Found 2 at index = " + index);
  }
}

