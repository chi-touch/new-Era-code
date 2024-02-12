package chichi;

public class StackWork {

    private int size;
    private int topIndex;

    public int[] array = new int[4];

    public int numberOfElement() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        if (size == array.length) {
            throw new StackOverflowError("Cannot not add morethan length");

        }
        array[size] = element;
        size++;

    }

    public int popElement() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Cannot remove it");
        }

        int poppedElement = array[size - 1];
        size--;
        return poppedElement;

    }

    public int peek() {
        if (!isEmpty()) {
            return array[topIndex];
        }
        int poppedElement = array[size - 1];
        return -1;
    }

    public int search(int element) {
        return element;
    }
}











