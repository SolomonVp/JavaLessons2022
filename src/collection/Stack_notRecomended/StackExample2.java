package collection.Stack_notRecomended;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Виктор");
        stack.push("Александра");
        stack.push("Заур");
        stack.push("Ольга");
        stack.push("Марина");

        System.out.println(stack.toString());
        System.out.println(stack.peek());
        System.out.println(stack.toString());

        while (!stack.isEmpty()) {
            System.out.println(stack.toString());
            System.out.println("----------Удаляем элемент: " + stack.pop());
        }

//        System.out.println(stack.toString());
//        System.out.println("----------Удаляем элемент: " + stack.pop());
//        System.out.println(stack.toString());
//        System.out.println("----------Удаляем элемент: " + stack.pop());
//        System.out.println(stack.toString());
//        System.out.println("----------Удаляем элемент: " + stack.pop());
//        System.out.println(stack.toString());
//        System.out.println("----------Удаляем элемент: " + stack.pop());
//        System.out.println(stack.toString());
//        System.out.println("----------Удаляем элемент: " + stack.pop());
//        System.out.println(stack.toString());
//        System.out.println("----------Удаляем элемент: " + stack.pop());


    }
}
