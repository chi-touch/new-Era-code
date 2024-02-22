package PersonWahala;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final List<Problem> problems = new ArrayList<>();


    public void add(Problem problem) {
        problems.add(problem);
    }

    public int getSize() {
        return problems.size();
    }

    public void solveProblem(Problem problem1) {
        problems.remove(problem1);
    }
}
