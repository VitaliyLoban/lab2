package by.belstu.it.loban.basejava;

import java.io.*;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import  java.math.*;
import java.util.Random;
import java.util.Scanner;

import  static java.lang.Math.*;

public class JavaTest {
    final int integerconst = 10;
    public final  int pfint = 100;
    public  static final int psfint = 1000;
    public static void main(String[] args) throws IOException {
        char ch = 's';
        int in = 56;
        short sh = 23;
        long lg = 123;
        byte bt =  112;
        double dob  = 12.44;
        boolean bool = true;
        boolean bool2 = false;
        String str = "belstu";
        System.out.println(str + in);
        System.out.println(str + ch);
        System.out.println(str + dob);
        System.out.println( bt + in);
        long log = in + 2147483647;
        System.out.println(log);

        //static int sint;
        boolean b;
        b = bool2 && bool;
        b = bool^bool2;
        //b = bool + bool2;
        long ttt = 2147483647;
        long  lgtype;
        long t = 0x7fff_ffff_fffL;
        long t1 = 0x7fff_ffff_fffL;
        char k1='a';
        char k2='\u0061';
        char k3=97;
        System.out.println(k1);
        System.out.println((char)(k1+k2+k3));
        System.out.println(3.45%2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(log(-435));
        double dobl = Float.intBitsToFloat(0x7F800000);
        double dobl1 = Float.intBitsToFloat(0xFF800000);
        System.out.println(dobl + "   "+ dobl1);

        System.out.println(PI);
        System.out.println(E);

        double p = Math.round(Math.PI);
        double e = Math.round(Math.E);
        double min = Math.min(p,e);
        System.out.println(min);
        double arand = 0;
        double brand = 1;
        double random_number = arand + (Math.random() * brand);
        System.out.println("Random " + random_number);

        Integer iiii = new Integer(100);
        Integer iii = new Integer(2);
        Boolean bclass = new Boolean(bool);
        Character character = new Character('c');
        Short shor = new Short(sh);
        Long lon = new Long(lg);
        Double doubl = new Double(dob);
        Double dddd = doubl + log;
        Integer fsd = iiii << iii;
        System.out.println("dsd: "+fsd);

        System.out.println(Long.MIN_VALUE + "  " + Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + "  " + Double.MAX_VALUE);
        Integer ifg = 9; //автоупаковка
        int fgh = 0;
        fgh = new Integer(9); //распаковка
        Byte byt1 = 12;
        byte bbb = 0;
        bbb = new Byte(byt1);

        int parse = Integer.parseInt("9");
        String hex = Integer.toHexString(15);
        System.out.println("aaaa :"+hex);

        System.out.println(Integer.compare(100, 101));
        String result = Integer.toString(15, 16);
        System.out.println(result);

        int tyu = 15;
        System.out.println("Namber of one bits " + Integer.bitCount(127));
        System.out.println("Binary = " + Integer.toBinaryString(tyu));
        System.out.println(Double.isNaN(Math.sqrt(-16)));

        //TODO f)

        /**преобразование числа с помощью конструктора
         * */
        try{
            Integer int1 = new Integer("565");
            System.out.println(int1);
        }
        catch (NumberFormatException ex){
            System.err.println("Неверный формат строки");
        }
        /**С использованием метода valueOf класса Integer*/
        try {
            String s34 = "2345";
            Integer int34 = Integer.valueOf(s34);
            System.out.println("С использованием метода valueOf " + int34);
        }
        catch (NumberFormatException ex){
            System.err.println(ex.getMessage() + "Неверный формат строки");
        }

        /**Parse*/
        int integer1 = 0;
        String string1 = "100";
        try{
            integer1 = Integer.parseInt(string1);
            System.out.println(integer1);
        }
        catch (NumberFormatException ex){
            System.err.println("Неверный формат строки");
        }

        String string2017 = "2017";
        byte[] i2017 = string2017.getBytes();
        System.out.println("Перевод строки в массив байтов " + i2017);

        //массив байтов переводим обратно в строку
        try {
            String stroka = new String(i2017, "utf-8");
            System.out.println("обратно " + stroka);
        }
        catch (UnsupportedEncodingException exep){
            exep.printStackTrace();
        }

        String strochka = "true";
        Boolean b1 = Boolean.valueOf(strochka);
        Boolean b2 = Boolean.parseBoolean(strochka);
        System.out.println(b1 && b2);

        //сравнение строк
        String h1 = "12345";
        String h2 = "12345";
        String h3 = "23456";

        System.out.println("Сравнение через == " + (h1 == h2));
        System.out.println("equals " + h1.equals(h3));
        System.out.println("CompareTo " + h2.compareTo(h3));
        h1=null;
        System.out.println("Когда строка null "+(h1==h2));
        //System.out.println(h1.equals(h2));
        //System.out.println(h1.compareTo(h3));

        String Strsplit =  new String("Разделяем эту строку на слова");
        for(String retval : Strsplit.split(" ")){
            System.out.println(retval);
        }
        String adawd = "london is the capital of GB";
        StringBuilder  qq= new StringBuilder();


        Scanner red = new Scanner(System.in);
        String str1= red.next();
        System.out.println(str1);
        String k211 =str1.substring(str1.indexOf("{"), str1.length());
        System.out.println(k211);





        String name = "Hello World!!! ";
        System.out.println("name.contains " + name.contains("Hello"));
        System.out.println("Хэш-код для строки name " + name.hashCode());
        System.out.println("indexoof " + name.indexOf('o'));
        System.out.println("Length " + name.length());
        System.out.println("Replace " + name.replace('e', 'o'));


        char[][] c1 = null;
        char[] c2[]=new char[][]{{'f','f','f'},{'q','q','q'}};
        char c3 [][]=new char[][]{{'f','f','f'},{'a','q','q'}};
        c1 = new char[3][];

        boolean comRez=c2.equals(c3);
        c2=c3;
        System.out.println(comRez);

        c1[0] = new char[1];
        c1[1] = new char[2];
        c1[2] = new char[3];

        c1[0][0] = 'y';
        c1[1][0] = 'd';
        c1[1][1] = 'j';
        c1[2][0] = 'n';
        c1[2][1] = 'g';
        c1[2][2] = 'r';

        System.out.println("Length для Str1: " +c1[0].length);
        System.out.println("Length для Str2: " +c1[1].length);
        System.out.println("Length для Str3: " +c1[2].length);
        System.out.println("Length c1 " + c1.length);

        for(char mass[] : c1){
            System.out.println(mass);
        }



        for(char mass[] : c2){
            System.out.println(mass);
        }

        for(char mass[] : c3){
            System.out.println(mass);
        }


    }

}
