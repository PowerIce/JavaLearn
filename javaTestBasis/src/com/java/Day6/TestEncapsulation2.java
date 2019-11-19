package com.java.Day6;
import com.java.Day7.Human;//默认加上default  只有在同一个包可以使用，其他包不能使用  加上public则可以在其他包访问
public class TestEncapsulation2 {
    public static void main(String[] args) {
        Human h = new Human();
//        h.height = 178;
    }
}
class Girl extends Human{
    void sayGood(){
        System.out.println(height);
    }
}
