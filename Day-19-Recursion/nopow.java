public class nopow{
    static int power(int a , int b) {
        int p = 0;
       if( a ==1) {
        return 1;
       } 
       if( b == 0) {
        return 1;
       }
       p =  a * power(a, b-1);
       return p;
    }
    public static void main(String[] args) {
        System.out.println(power(2 , 5));
    }
}