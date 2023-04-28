package collection.stack;

import java.util.Stack;

public class stringDemo {
    public static void main(String[] args) {
        Stack <String>stack=new Stack<>();
        stack.add("Bhagyashri");
        stack.add("Akshay");
        stack.add("pooja");
        System.out.println("total name "+stack);
        System.out.println("search string "+stack.search("swapnali"));//here is -1 o/p b of we does not add the string swapnali
        System.out.println("search element "+stack.search("Akshay"));//o/p is 2bz we does not added swapnali string

        System.out.println("top of the string "+stack.add("swapnali"));
        System.out.println("top of the string "+stack);
        System.out.println("search string "+stack.search("swapnali"));
        System.out.println("search element "+stack.search("Akshay"));//here o/p is 3 we add swapnali string

        System.out.println("remove element "+stack.pop());//1st remove  we are  added string then 1 by 1  from the list
        System.out.println("remove element "+stack.pop());
        System.out.println("remove element "+stack.pop());








    }
}
