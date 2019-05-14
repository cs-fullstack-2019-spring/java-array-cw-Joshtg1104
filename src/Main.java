import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ex1();
//        ex2();
        ex3();
    }
    private static void ex1(){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> namae = new ArrayList<String>();
        System.out.println("Enter 4 names");
        String name1 = scan.next();
        String name2 = scan.next();
        String name3 = scan.next();
        String name4 = scan.next();
        namae.add(name1);
        namae.add(name2);
        namae.add(name3);
        namae.add(name4);
//            names = scan.next();
        System.out.println(namae);
    }

    private static ArrayList<Integer> ex2(){
        Integer[] numbo = {5, 3, 7, 4};
        printEx1();
        return null;
    }
    private static Integer[] printEx1(){

        return new Integer[0];
    }

    private static void ex3(){
        String[] folks = {"Bob", "John", "Kenn", "Kevin"};
        folks[2] = "";
        System.out.println(folks);

    }

}
