package ui;

import bean.User;

import java.util.ResourceBundle;
import java.util.Scanner;

public abstract class BaseClass {
    protected  static Scanner input=new Scanner(System.in);
    protected  static User currUser;//当前用户对象
    private static ResourceBundle r=ResourceBundle.getBundle("r");

    public  static String getString(String key){
            return r.getString(key);
    }
    public static void println(String s){
        System.out.println(s);
    }
    public static void print(String s){
        System.out.println(s);
    }
}
