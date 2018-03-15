package com.company;

import by.belstu.it.loban.basejava.WrapperString;
public class main {
    public static void main(String[] args) {
        // write your code here
        //TODO
        WrapperString wrapperString = new WrapperString("Jack");
        //wrapperString.replace('9', '3');
        WrapperString wrapperString1 = new WrapperString("rt"){
            public  void replace(char oldchar, char newchar) {
                char old = oldchar;
                char news= newchar;
                System.out.println(news + " " + old);
            }
            public void delete(char newchar){
                System.out.println(newchar);
            }
        };
        //wrapperString1.replace('3','5');
        //wrapperString.replace('3','1');
/**@return какое - нибудь значение
 * @throws ошибка
 * @param args
 * */
    }
}
