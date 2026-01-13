package day2homework;

import java.util.*;

public class UniqueApplicants {
    public static void main(String args[]){
        List<String> applicants=List.of("John", "Aisha", "Ravi", "John", "Mina", "Ravi", "Aisha", "Tom");
        Set<String> uniqueApplicants=new TreeSet<>(applicants);
        for(String name: uniqueApplicants){
            System.out.println(name);
        }

    }
}
