
class Fib_rec{
    static int fib(int n) {
//Base Case
         if(n ==0) {
             return 0;
}
         if(n == 1) {
           return 1;
}
          return fib(n-1) + fib(n-2);
}

public static void main(String[] args) {
    System.out.println(fib(5));
}
}