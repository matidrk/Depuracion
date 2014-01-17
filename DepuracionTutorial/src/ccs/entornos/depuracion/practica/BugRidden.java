package ccs.entornos.depuracion.practica;

import java.util.*;

/**
 * This is the file you will edit for this lab. It contains four functions,
 * each of which is buggy.
 */
public class BugRidden {
  /**
   * Does a binary search for <code>key</code> in a sorted List<Integer> <code>list
   * </code> using the IntegerComparator <code>comp</code>
   * 
   * This code contains three bugs. To find them, you may want to use
   * breakpoints and monitor the local variables.
   * 
   * @requires list != null && key != null && comp != null &&
   *           list is sorted in ascending order by comp
   * @return  an integer i such that list.get(i).equals(key), 
   *           or -1 if no such index i exists.
   */
  public static int binarySearch(List<Integer> list, Integer key, IntegerComparator comp)
  {
    int low, mid, high, result;
    low = 0;
    high = list.size() - 1;
    while (low < high) {
      mid = (low + high)/2;
      result = comp.compare(key, list.get(mid));
      if (result == 0) { // key.equals(list.get(mid))
	return mid;
      } else if (result < 0) { // key < list.get(mid)
	high = mid;
      } else { // key > list.get(mid)
	low = mid;
      }
    }
    return -1;
  }

  /**
   * Does a binary search for <code>key</code> in a sorted array <code>arr
   * </code> using the IntegerComparator <code>comp</code>, limiting its search to
   * the sub-array whose indices are &lt;= low or &gt;= high.
   * 
   * This code contains three bugs. To find them, you may want to use
   * breakpoints and monitor the local variables. This version of binarySearch
   * is recursive, so you might want to try examining the stack traces.
   * 
   * @requires arr != null && key != null && comp != null &&
   *           arr is sorted in ascending order by comp
   * @return  an integer i such that key.equals(arr[i]),
   *           or -1 if no such index i exists.
   */
  public static int binarySearch(Integer[] arr, Integer key, IntegerComparator comp, int low, int high)
  {
    int mid, result;
    if (low > high) {
      return -1;
    }
    mid = (low + high)/2;
    result = comp.compare(arr[mid], key);
    if (result == 0) { // key.equals(arr[mid])
      return mid;
    } else if (result < 0) { // key < arr[mid]
      return BugRidden.binarySearch(arr, key, comp, low, mid);
    } else { // key > arr[mid]
      return BugRidden.binarySearch(arr, key, comp, mid, high);
    }
  }	

  /**
   * Does a binary search for <code>key</code> in a sorted array <code>arr
   * </code> using the Comparator <code>comp</code>
   * 
   * @requires arr != null && key != null && comp != null &&
   *           arr is sorted in ascending order by comp
   * @return  an integer i such that key.equals(arr[i]),
   *           or -1 if no such index i exists.
   */
  public static int binarySearch(Integer[] arr, Integer key, IntegerComparator comp)
  {
    return BugRidden.binarySearch(arr, key, comp, 0, arr.length-1);
  }

  /**
   * Removes each of the elements in the argument list, and puts them into 
   * a new array.
   * 
   * This function contains two bugs that are easily found when looking at the
   * values of the local variables during its execution.
   * 
   * @effects: Empties l, and creates a new array arr that is a copy of l.
   * @return: arr
   */
  public static Integer[] convertToArray(List<Integer> l)
  {
    Integer[] arr = new Integer[l.size()];
    for (int i=0; i < l.size(); i++) {  
      arr[i] = l.remove(i);  
    }
    return arr;
  }
}
