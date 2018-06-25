package com.codecool.stack;

import java.util.Arrays;

public class Stack {

    private int actualSize;
    private String[] stackForIntegers;

    public Stack(int size) {
        stackForIntegers = new String[size];
    }

    public static void main(String[] args) {
        Stack arr = new Stack(2);
        arr.push("Egy");
        arr.push("Kettő");
        System.out.println(arr);
//        arr.push("Három");
//        System.out.println(arr);
        System.out.println(arr.peek());
        arr.pop();
        System.out.println(arr);
        arr.pop();
//        System.out.println(arr);
//        arr.pop();
        System.out.println(arr.peek());
    }

    public String pop(){
        if (actualSize < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no more element in stack");
        } else {
            return stackForIntegers[--actualSize];
        }
    }

    public void push(String item) {
        if (actualSize == stackForIntegers.length) {
            throw new ArrayIndexOutOfBoundsException("Stack is full, you cannot push more element in it!");
        } else
        stackForIntegers[actualSize] = item;
        actualSize++;
    }

    public String peek() {
        if (actualSize <= 0) {
            throw new ArrayIndexOutOfBoundsException("There is no more element in stack");
        } else {
            return stackForIntegers[actualSize - 1];
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "actualSize=" + actualSize +
                ", stackForIntegers=" + Arrays.toString(stackForIntegers) +
                '}';
    }
}
