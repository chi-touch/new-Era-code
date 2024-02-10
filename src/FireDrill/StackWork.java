package FireDrill;

import java.util.Arrays;

public class StackWork {
    private String[] elements;
    private int totalSize;
    private int topElementIndex;

    public boolean isEmpty;

    public StackWork(int size){
        totalSize = size;
        elements = new String[totalSize];
        topElementIndex = 0;
    }

    public boolean isEmpty() {

         return topElementIndex == 0;
    }

    public void push(String element) {
        if(isOverflow()) throw new StackOverflowError("Stack overflow");
        elements[++topElementIndex] = element;
        isEmpty= !isEmpty();
        System.out.println(element);

    }


    private boolean isOverflow() {
        return topElementIndex == totalSize;
    }

    public boolean pop() {
        String[] newElements = new String[elements.length];
        for (int count = 0; count < newElements.length; count--) {
            newElements[count] = elements[count];
        }

            elements = newElements;
            totalSize--;
        System.out.println(Arrays.toString(newElements));

        return true;
    }

    public String peek(){
        return elements[totalSize-1];
    }
}
