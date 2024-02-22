/*

package PersonWahala;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void addProblemTest(){
        Person person = new Person();
        Problem problem = new Problem("SchoolFees",Type.EDUCATION);
        person.add(problem);
        assertEquals(1,person.getSize());

    }

    @Test
    public void addMoreProblem(){
        Person person = new Person();
        Problem problem = new Problem("Transportation",Type.BUSINESS);
        Problem problem1 = new Problem("food",Type.FINANCIAL);
        person.add(problem);
        person.add(problem1);
        assertEquals(2,person.getSize());

    }
    @Test
    public void solveProblem(){
        Person person = new Person();
        Problem problem = new Problem("Deliverance",Type.SPIRITUAL);
        Problem problem1 = new Problem("FoodStuff",Type.BUSINESS);
        person.add(problem);
        person.add(problem1);
        person.solveProblem(problem1);
        assertEquals(1,person.getSize());
    }

    @Test
    public void recountProblem(){
        Person person = new Person();
        Problem problem = new Problem("Deliverance",Type.SPIRITUAL);
        Problem problem1 = new Problem("Food",Type.FINANCIAL);
        Problem problem2 = new Problem("SchoolFees",Type.EDUCATION);
        Problem problem3 = new Problem("Transportation",Type.BUSINESS);
        person.add(problem);
        person.add(problem1);
        person.add(problem3);
        person.recountProblem();
        assertEquals(1,person.getSize());

    }



}



*/
