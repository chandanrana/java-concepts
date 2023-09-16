package programming;

import java.util.ArrayList;

public class CustomArrayList  {
    public static void main(String[] args) {
        ArrayList<Object> customArrayList = new ArrayList<>(){
           @Override
           public boolean add(Object obj) {
               return this.contains(obj);
           }
        } ;
        customArrayList.add(1);
        customArrayList.add(1);
        customArrayList.add(2);
        System.out.println(customArrayList);
    }
}