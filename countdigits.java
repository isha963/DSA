class countdigits {
  public static void main(String[] args) {
    int num=12345;
    int count=0;
    while(num>0){
    
      num=num/10;
    
      count++;
    }
    System.out.println("The number of digits in the given number is: " + count);
  }
}
