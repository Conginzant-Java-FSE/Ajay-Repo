package day2homework;

import java.util.ArrayList;
import java.util.List;

public class Feedback {
    public static void main(String[] args){
        List<Integer> ratings= List.of(9, 10, 12, 8, -1, 7, 11, 10, 6);
        List<Integer> cleanedRatings=new ArrayList<>();
        for(int num: ratings){
            if(num>1 && num<=10){
                cleanedRatings.add(num);
            }
        }
        cleanedRatings.sort((o1,o2)->o1-o2);
        System.out.println(cleanedRatings);
    }
}
