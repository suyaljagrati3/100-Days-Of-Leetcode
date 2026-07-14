import java.util.*;
public class frequency{
    public static void main(String[] args) {

 int[] nums1 = {1, 2, 3 , 4, 2, 2 ,1 };
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums1){
            map.put(num, map.getOrDefault(num,0)+1); //    
    //if number is going to be added for the first time then it will add num otherwise if number is already there it will inc the count
        }

        //Printing frequency
        for(Map.Entry<Integer , Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    }

