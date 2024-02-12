
package FireDrill.FireDrill5;

public class ArrayList {
    private String[] elements = new String[3];
    private int numberOfElement;


    public boolean isEmpty() {
        return numberOfElement == 0;
    }



    public void add(String element) {
        elements[numberOfElement]=element;
        numberOfElement++;
    }

    public void remove(String element) {
        elements[numberOfElement]= element;
        numberOfElement --;
    }

    public int get(String element) {
        for (int count = 0; count < elements.length-1; count++) {
            if(elements[count].equals(element));
            numberOfElement++;
            return count+1;

        }
        return numberOfElement--;

    }
}

