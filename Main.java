package demo2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int[] arr= new int[10];
        ArrayList ls = new ArrayList();
        ls.add(1);
        ls.add("hello");

        System.out.println(ls.get(0));
        System.out.println(ls.get(1));

        System.out.println(ls.size());
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);

        ArrayList<String > strList = new ArrayList<>();
        strList.add("Hom nay la cuoi tuan");

        ArrayList<Bike> bList =  new ArrayList<>();
        Bike b1=  new Bike();
        bList.add(b1);
        bList.add(new Bike());
    }
}
