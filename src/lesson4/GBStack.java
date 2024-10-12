package lesson4;


/**
 * Реализовать стэк с помощью массива.
 * Нужно реализовать методы:
 * size(), isEmpty(), push(), peek(), pop().
 */

public class GBStack {
    private int size = 0;
    private int capacity = 2;
    private int top = -1;
    private int[] stack = new int[capacity];

    private void addCapacity(){
        capacity = capacity * 2;
        int[] tempStack = new int[capacity];
        System.arraycopy(stack, 0, tempStack, 0, size);
        //откуда берем, с какой позиции, куда вставить, на какую позицию, сколько вставить.
        stack = tempStack; // на этом этапе GarbageCollector сам удалит старый массив.
    }

    private boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void push(int value){
        if (isFull()){
            addCapacity();
        }
        stack[++top] = value;
        size++;
    }

    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
            }
        return stack[top];
    }

    public int pop(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        size--;
        capacity--;
        return stack[top--];
    }

    @Override
    public String toString(){
        if (isEmpty()) return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(stack[i]).append(", ");
        }
        builder.delete(builder.length()-2, builder.length());
        return String.format("[%s]", builder);
    }
}
