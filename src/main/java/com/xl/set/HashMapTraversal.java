package com.xl.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTraversal {

  public static void main(String[] args){
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(1, "a");
    map.put(2, "b");
    map.put(3, "c");
    map.put(4, "b");
    System.out.println(map.size());

    traversal(map);

    map.forEach((x, y) -> {
              System.out.println(x + " -> " + y);
            }
    );

  }

  public static void traversal(HashMap<Integer, String> map){

    Set<Integer> ks = map.keySet();
    Iterator<Integer> its = ks.iterator();
    //1
    Set<HashMap.Entry<Integer, String>> set = map.entrySet();
    Iterator<HashMap.Entry<Integer, String>> iterator = set.iterator();
    while (iterator.hasNext()){
      HashMap.Entry<Integer, String> entry = iterator.next();
      System.out.print(entry.getKey()+  "  " + entry.getValue());
      System.out.println();
      int h = entry.getKey().hashCode();
      System.out.println(h);
      System.out.println(h ^ (h >>> 16));
    }

    //2
    for (Map.Entry<Integer, String> entry: map.entrySet()){
      int k = entry.getKey();
      String v = entry.getValue();
      System.out.println(k + "------>" + v);
    }

    //3
    Set<Integer> set2 = map.keySet();
    Iterator<Integer> it = set2.iterator();
    for (int k : set2){
      String v = map.getOrDefault(k, "");
    }

    map.clear();

  }

}
