import java.util.*;



class findalldivisors {
  public static void divisors(int n) {
    List<Integer> al = new ArrayList<>();
    int i = 1;
    while (i <= Math.sqrt(n)) {
      if (n % i == 0) {
        al.add(i);
        if (n / i != i) {
          al.add(n / i);
        }
      }
      i++;
    }
    Collections.sort(al);
    int[] a = new int[al.size()];
    for (int j = 0; j < a.length; j++) {
      a[j] = al.get(j);
    }
    for (int j = 0; j < a.length; j++) {
     System.out.println(a[j]);
    }
  }
    
  public static void main(String[] args) {
    int n = 7;
    divisors(n);
  }
}