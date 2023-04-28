package collection.stack;

import java.util.*;

public class Stackdemo {
    public static void main(String[] args) {
        Stack <Integer>stackList=new Stack<>();
        stackList.push(10);
        stackList.push(40);
        stackList.push(20);
        stackList.push(30);
        System.out.println("on the top of elment "+stackList.peek());
        System.out.println("search element " +stackList.search(50));
        System.out.println("search element " +stackList.search(40));//stack works on LIFO manner
        System.out.println("search element " +stackList.search(30));
        System.out.println("push element " +stackList.push(60));
        System.out.println(" how many  element present in the stack " +stackList);

        System.out.println("search element " +stackList.search(40));///here is o/p is 4 bz of we push element that why change his position
        System.out.println("remove element from the stack " +stackList.pop());//frist if you have push element then element will be pop/remove frist  if already exist element pop one by one
        System.out.println("remove element from the stack " +stackList.pop());
        System.out.println("remove element from the stack " +stackList.pop());
        System.out.println("remove element from the stack " +stackList.pop());
        System.out.println("top element of the stack " +stackList.peek());
        System.out.println(" is  stack empty " +stackList.empty());





    }
}
