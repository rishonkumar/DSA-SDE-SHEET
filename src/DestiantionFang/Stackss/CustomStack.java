package DestiantionFang.Stackss;

import java.util.ArrayList;

public class CustomStack {

    private ArrayList<Integer>items;

    public CustomStack() {
        this.items = new ArrayList<>();
    }

    private void push(int item) {
        items.add(item);
    }

    private Integer pop() {
        if (items.isEmpty()) {
            return null;
        }
        return items.remove(items.size() - 1);
    }

    private Integer peek() {
        if (items.isEmpty()) {
            return null;
        }
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public static void main(String[] args) {

        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
