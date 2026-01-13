package day2homework;

import java.util.*;

public class Stock {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        map.put("MacBook", 5);
        map.put("iPhone", 10);
        map.put("AirPods", 25);
        Map<String,Integer> incomingStock=new HashMap<>();
        incomingStock.put("VisionPro", 5);
        incomingStock.put("iPhone", 5);
        incomingStock.put("AirPods", 5);

        Map<String,Integer> updatedStock=new HashMap<>();


        Set<String> keys=map.keySet();
        Set<String> keys2=incomingStock.keySet();
        Set<String> result=new HashSet<>(keys);
        result.addAll(keys2);

        for(String name: result){
            if(incomingStock.containsKey(name) && map.containsKey(name)){
                updatedStock.put(name,map.get(name)+incomingStock.get(name));
            }
            else if (incomingStock.containsKey(name)&& !map.containsKey(name)){
                updatedStock.put(name,incomingStock.get(name));
            }
            else if(!incomingStock.containsKey(name) && map.containsKey(name)){
                updatedStock.put(name,map.get(name));
            }
        }

    System.out.println(updatedStock);
    }
}
