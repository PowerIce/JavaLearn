package com.java.collection;

import java.util.Map;
import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("老刘", new Wife("小丽"));
        map.put("老李", new Wife("小铭"));
        Wife w = (Wife) map.get("老李");
        map.containsKey("l老刘");
        System.out.println(w);
    }
}

class Wife{
    String name;
  public Wife( String name){
      this.name = name;
  }
}
