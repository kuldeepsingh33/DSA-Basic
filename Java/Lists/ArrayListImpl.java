package Java.Lists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListImpl {
    public static void main(String[] args) {
        String[] geeks = {"ABC", "DEF", "GHI", "JKL"};

        //convert array to list
        List<String> al = new ArrayList<String>(Arrays.asList(geeks));

        insertIntoList(al, "MNO");
        deleteFromList(al, "DEF");
    }

    private static void deleteFromList(List<String> al, String str) {
        al.remove(str);
        System.out.println(al);
    }

    private static void insertIntoList(List<String> al, String str) {
        al.add(str);
        System.out.println(al);
    }




}
