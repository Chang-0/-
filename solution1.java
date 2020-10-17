
import javax.swing.*;
import java.awt.*;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;


public class solution1 {
    public static void main(String[] args) {
//        StringBuilder a = new StringBuilder("123");
//        StringBuilder b = new StringBuilder("456");
//        a.append(b);
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
       String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

     String[] arr = {"a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a"};
    System.out.println(new solution1().findSubstring(s,arr));//
//        Integer a = 21;
//        Integer b = 21;
//        HashMap<Integer,Integer> aa = new HashMap<>();
//        HashMap<Integer,Integer> bb = new HashMap<>();
//        aa.put(1,2);
//        bb.put(1,2);
//
//        System.out.println(aa.get(1)==bb.get(1));

    }
    public List<List<Integer>> threeSum(int[] nums, int tartget) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-3;i++){
            if (i>0&&nums[i]==nums[i-1]) continue;

            for (int j=i+1;j<nums.length-2;j++){

                if (j>i+1&&nums[j]==nums[j-1]) continue;
                int start = j+1;
                int end = nums.length-1;

                for (;start<end;){
                    if (start>j+1&&nums[start]==nums[start-1]) {
                        start++;
                        continue;
                    }
                    if (end<nums.length-2&&nums[end]==nums[end+1]){
                        end--;
                        continue;
                    }
                    int now = nums[i] + nums[j] +nums[start] + nums[end];
                    if (now<tartget){
                        start++;
                    }else if(now==tartget){
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[start]);
                        res.add(nums[end]);
                        ans.add(res);

                    }else{
                        end--;
                    }
                }
            }
        }
        return ans;
    }

    public boolean isPalindrome(int x) {
        if (x<0) return  false;
        if (x!=0&&x%10==0) return false;
        if (x==0) return  true;
        int c = 1;
        int div = 1;
        while(x/div>=10) {
            div*=10;
            c++;
        }


        for (int i=0;i<c/2;i++){
            int left = x/div;
            int right = x%10;

            if (left!=right){
                return false;
            }
            x = x - left * div;
            x /= 10;
            div /= 100;

        }
        return true;
    }

    public boolean isMatch(String s, String p) {
        int x = s.length();
        int y = p.length();
        boolean[][] dp = new boolean[x+1][y+1];
        dp[0][0] = true;
        if(p.equals("")) return false;
        if (p.charAt(0)=='*') return isMatch(s,p.substring(1));
        for (int i=2;i<y+1;i=i+2){

            if (p.charAt(i-1)=='*'){
                dp[0][i]=true;

            }else break;
        }
        for (int i=1;i<x+1;i++){
            for (int j =1;j<y+1;j++){
                char a = s.charAt(i-1);
                char b = p.charAt(j-1);
                if (s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.'){
                    dp[i][j] = dp[i-1][j-1];
                    continue;
                }
                if (p.charAt(j-1)=='*'){
                    if ((s.charAt(i-1)==p.charAt(j-2)||p.charAt(j-2)=='.')&&(dp[i][j-1]||dp[i-1][j])){
                        dp[i][j] = true;
                    }else if (j>=0&&dp[i][j-2]){
                        dp[i][j] = true;
                    }
//                    if (j-2>=0&&p.charAt(j-2)=='.'&&dp[i][j]){
//                        dp[i][j] = true;
//                    }
                }

            }
        }

        return dp[x][y];
    }

    public int maxArea(int[] height) {
        int max = 0;
        int t = height.length-1;
        int start = 0;
        int end = t;
        while(start<end){
            int area = t * ((height[start]>height[end])?height[start]:height[end]);
            max = (area>max)?area:max;
            if (height[start]>height[end]) start++;
            else end--;
        }

        return max;
    }

    public String intToRoman(int num) {
        HashMap<Integer, String> convert = new HashMap<>();
        convert.put(1,"I");
        convert.put(5,"V");
        convert.put(10,"X");
        convert.put(50,"L");
        convert.put(100,"C");
        convert.put(500,"D");
        convert.put(1000,"M");
        String ans = "";
        Set key = convert.keySet();
        Object[] arr = key.toArray();
        Arrays.sort(arr);
        for (int i=arr.length-1;i>=0;i--){
            int now = Integer.parseInt(String.valueOf(arr[i]));
            int amount = 0;
            amount = num / now;
            if (amount==4){
                ans = ans + convert.get(arr[i]) + convert.get(arr[i+1]);
                if (ans.contains("DCD")) ans = ans.substring(0,ans.length()-3) + "CM";
                if (ans.contains("LXL")) ans = ans.substring(0,ans.length()-3) + "XC";
                if (ans.contains("VIV")) ans = ans.substring(0,ans.length()-3) + "IX";
            }else{
                for (int j=0;j<amount;j++){
                    ans = ans + convert.get(arr[i]);
                }

            }
            num = num - amount * Integer.parseInt(String.valueOf(arr[i]));
        }
        return ans;
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> convert = new HashMap<>();
        convert.put('I',1);
        convert.put('V',5);
        convert.put('X',10);
        convert.put('L',50);
        convert.put('C',100);
        convert.put('D',500);
        convert.put('M',1000);
        char[] arr = s.toCharArray();
        int ans = 0;
        int n = arr.length;
        for (int i=0;i<arr.length;i++){
            ans = ans + convert.get(arr[i]);
            if(arr[i]=='I'&&i+1<n&&arr[i+1]=='V') {ans = ans + 3;i++;continue;}
            if(arr[i]=='X'&&i+1<n&&arr[i+1]=='L') {ans = ans + 30;i++;continue;}
            if(arr[i]=='C'&&i+1<n&&arr[i+1]=='D') {ans = ans + 300;i++;continue;}
            if(arr[i]=='I'&&i+1<n&&arr[i+1]=='X') {ans = ans + 8;i++;continue;}
            if(arr[i]=='X'&&i+1<n&&arr[i+1]=='C') {ans = ans + 90;i++;continue;}
            if(arr[i]=='C'&&i+1<n&&arr[i+1]=='M') {ans = ans + 800;i++;continue;}

        }
        return  ans;

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";
        if (strs.length==1) return strs[0];
        for (String i:strs){
            if (i.equals("")) return "";
        }
        int index =0;
        int n = strs.length;
        for (int i=0;i<strs[0].length();i++){
            char now = strs[0].charAt(i);
            for (int j=1;j<n;j++){
                if (i<strs[j].length()) {
                    if (now != strs[j].charAt(i)) return strs[j].substring(0, i);
                }else {
                    return strs[j].substring(0, i);
                }
            }
        }
        return "";
    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length<3) return new ArrayList<List<Integer>>();
        int start = 0;
        int end = nums.length-1;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            start = i + 1;
            end = nums.length-1;
            if (i-1>=0&&nums[i]==nums[i-1]) i++;
            while (start<end){
                int n1 = nums[i];
                int n2 = nums[start];
                int n3 = nums[end];
                int res = nums[i] + nums[start] + nums[end];

                if (res==0){
                    ArrayList<Integer> r0 = new ArrayList<Integer>();
                    r0.add(nums[i]);
                    r0.add(nums[start]);
                    r0.add(nums[end]);
                    if (ans.isEmpty()){
                    ans.add(r0);}else if (!ans.get(ans.size()-1).equals(r0)) ans.add(r0);
                    start++;
                    end--;
                }else if (res>0){
                    end--;
                }else if (res<0) start++;
            }
        }
        return ans;
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0;
        int end = nums.length;
        int result=nums[0]+nums[1]+nums[2];

        for (int i=0;i<nums.length;i++){
            start = i+1;
            end = nums.length-1;
            while (start<end){
                int ans = nums[i] + nums[start] + nums[end];
                result = (Math.abs(result-target)<Math.abs(ans-target))?result:ans;
                if (ans<target){
                    start++;
                }else if (ans==target){
                    return ans;
                }else {
                    end--;
                }
            }
        }
        return result;
    }


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mm = new HashMap<>();
        int[] ans = new int[2];
        for (int i=0;i<nums.length;i++){
            if (mm.get(nums[i])!=null){
                return new int[]{i, mm.get(nums[i])};
            }
            mm.put(target-nums[i], i);
        }

        return ans;
    }


    public List<String> letterCombinations(String digits) {
//        char[] two = {'a','b','c'};
//        char[] three = {'d','e','f'};
//        char[] four = {'g','h','i'};
//        char[] five = {'j','k','l'};
//        char[] six = {'m','n','o'};
//        char[] seven = {'p','q','r','s'};
//        char[] eight = {'t','u','v'};
//        char[] nine = {'w','x','y','z'};
        List<String> ans=  new ArrayList<>();
        Map<Integer, String> keyboad = new HashMap<>(){{
            this.put(2,"abc");
            this.put(3,"def");
            this.put(4,"ghi");
            this.put(5,"jkl");
            this.put(6,"mno");
            this.put(7,"pqrs");
            this.put(8,"tuv");
            this.put(9,"wxyz");
        }};
        if (digits.equals("")) return new ArrayList<String>();
        ans = dothings(keyboad, digits, 0, "");
        return ans;
    }

    public List<String> dothings(Map<Integer, String> keyboad, String digits, int index,String now){
        int now_num = Integer.valueOf(digits.substring(index,index+1));
        index++;
        String now_string = keyboad.get(now_num);
        List<String > ans = new ArrayList<>();
        for (int i=0;i<now_string.length();i++){
            if (index==digits.length()){
                ans.add(now+now_string.substring(i,i+1));
            }else {
                String x = now + now_string.substring(i,i+1);
                ans.addAll(dothings(keyboad, digits, index, x));
            }

        }
        return ans;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        int count = 0;
        ListNode new_head = head;
        ListNode ans = head;
        ListNode pre = new ListNode(0,head);
        while (head.next!=null){
            if (count<n-1){
                head = head.next;
                count++;
                continue;
            }
            head = head.next;
            pre = pre.next;
            ans = ans.next;

        }
        if (ans==new_head){
            return ans.next;
        }
        pre.next = ans.next;

        return new_head;
    }

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> sym = new Stack<>();
        if (arr.length%2!=0) return  false;
        for (int i=0;i< arr.length;i++){
            if (arr[i]=='['||arr[i]=='{'||arr[i]=='('){
                sym.push(arr[i]);
                continue;
            }
            if (arr[i]==']'){
               if (sym.isEmpty()||sym.peek()!='[') return false;
               else {
                   sym.pop();
                   continue;
               }
            }
            if (arr[i]=='}'){
                if (sym.isEmpty()||sym.peek()!='{') return false;
                else {
                    sym.pop();
                    continue;
                }
            } if (arr[i]==')'){
                if (sym.isEmpty()||sym.peek()!='(') return false;
                else {
                    sym.pop();
                    continue;
                }
            }
        }
        if (sym.isEmpty()){
            return true;
        }
        return  false;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return merge_recur(l1, l2) ;
    }

    public ListNode merge_recur(ListNode l1 ,ListNode l2){
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode l1next = l1.next;
        ListNode l2next = l2.next;
        if (l1.val>=l2.val){
            l2.next = merge_recur(l1,l2next);
            return l2;
        }
        if (l1.val<l2.val){
            l1.next = merge_recur(l2,l1next);
            return l1;
        }
        return l1;
    }


    public  List<String> generateParenthesis(int n) {


        List<StringBuilder>[] all = new List[n+1];
        List<StringBuilder> l0=  new ArrayList<>();
        l0.add(new StringBuilder(""));
        List<StringBuilder> l1 = new ArrayList<>();
        l1.add(new StringBuilder("()"));
        all[0] = l0;
        all[1] = l1;
        for (int i=2;i<=n;i++){
            List<StringBuilder> extend = new ArrayList<>();
            for (int j=0;j<i;j++){
                List<StringBuilder> f1 = all[j];
                int k = i -1 -j;
                List<StringBuilder> f2 = all[k];
                System.out.println(f2.toString());
                generate_combination(extend,f1,f2);
            }
            all[i] = extend;
        }
        List<String> res = new ArrayList<>();

        int i=0;
        ListIterator it = all[n].listIterator();
        while (it.hasNext()){
            res.add(""+it.next());
        }
        return res;
    }

    public void generate_combination(List<StringBuilder> extend, List<StringBuilder> l1, List<StringBuilder> l2){
        List<StringBuilder> ans = new ArrayList<>();
     //   ListIterator it1 = l1.listIterator();
        for(int i=0;i<l1.size();i++){
       //     ListIterator it2 = l2.listIterator();
            StringBuilder fir =  (StringBuilder) l1.get(i);

            for (int j=0;j<l2.size();j++) {
                //          StringBuilder sb2 = (StringBuilder) it2.next();
                StringBuilder change = new StringBuilder(""+fir);
                change.insert(0, "(");
                change.append(")").append(""+l2.get(j));
                extend.add(change);
            }

        }
        return ;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKilists_recur(lists);
    }

    public ListNode mergeKilists_recur(ListNode[] lists){
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i=0;i<lists.length;i++){
            if (lists[i]!=null){
                if (lists[i].val<min){
                    index = i;
                    min = lists[i].val;
                }
            }
        }
        if (index==-1){
            return null;
        }else {
            ListNode ans = lists[index];
            lists[index] = lists[index].next;
            ans.next = mergeKilists_recur(lists);
            return  ans;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(-1,head);
        ListNode n = head.next;
        ListNode ans;
        if (head==null) return null;
        if (head.next!=null) ans = head.next;
        else return head;
        while (head!=null&&head.next!=null){
            n = head.next;
            head.next = n.next;
            pre.next = n;
            n.next = head;
            pre = head;
            head = head.next;

        }
        return ans;
    }

    public int removeElement(int[] nums, int val) {
        if (nums.length==0) return 0;
        int index = 0;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]>nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        index++;
        return index;
    }

    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int[] next = get_next_num(needle);
        int i =0;
        int j = 0;
        while (i<haystack.length()){

            if (j==-1||haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                if (j==needle.length()) return i-j;
            }else{
                j = next[j];
            }
        }
        return -1;
    }

    public int[] get_next_num(String needle){
        int[] next = new int[needle.length()];
        next[0] = -1;
        next[1] = 0;
        for (int i=2;i<next.length;i++){
            int index = i - 1;
            int match = next[index];

            while (needle.charAt(match)!=needle.charAt(index)){
                if (next[match]==-1) {
                    match = next[match];
                    break;
                }
                match = next[match];

            }
            next[i] = match + 1;
        }
        return  next;
    }

    public int divide(int dividend, int divisor) {
        if (dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        if (dividend==Integer.MIN_VALUE&&divisor==1) return  Integer.MIN_VALUE;
        boolean b1 = (dividend>=0)?true:false;
        boolean b2 = (divisor>0)?true:false;
        dividend = (dividend<0)?dividend:-dividend;
        divisor = (divisor<0)?divisor:-divisor;
        int ans = 1;
        int lastans=1;
        while (ans*divisor<0&&ans*divisor>dividend){
            lastans = ans;
            ans *= 2;
        }
        if (ans==1) return 0;
        ans = lastans + divide(dividend-lastans*divisor, divisor);
        if (b1^b2) ans = -ans;
        return ans;
    }

    public List<Integer> findSubstring(String s, String[] words) {

        int word_length = words[0].length();
        int word_nums = words.length;
        HashMap<String,Integer> word = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<word_nums;i++){
            if (word.get(words[i])==null){
                word.put(words[i],1);
            }else {
                word.replace(words[i],word.get(words[i])+1);
            }
        }

        for (int i=0;i<s.length()-word_length*word_nums+1;i++){
            if (word.get(s.substring(i,i+word_length))==null){
                continue;
            }else {
                HashMap<String,Integer> now = new HashMap<>();
                boolean good = true;
                for (int j=0;j<word_nums;j++){
                    String now_s = s.substring(i+j*word_length,i+(j+1)*word_length);
                    if (now.get(now_s)==null) now.put(now_s,1);
                    else now.replace(now_s, now.get(now_s)+1);
                }
                for (int j=0;j<word_nums;j++){
                    System.out.printf("%s   %d   %d\n",words[j],now.get(words[j]),word.get(words[j]));
                    System.out.println(word.get(words[j]));
                    System.out.println(now.get(words[j]));
                    if (!word.get(words[j]).equals(now.get(words[j]))) {
                        good = false;
                        break;
                    }
                }

                if (good){
                    ans.add(i);
                }

            }
        }
        return ans;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}