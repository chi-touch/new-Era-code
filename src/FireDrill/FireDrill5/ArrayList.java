
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
}

