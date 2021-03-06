package Handlers;

import java.util.HashMap;

/***
 *
 * This is a handler made for any student processing
 * I've added a simple print instruction to represent how this works.
 *
 * This class is an implementation of Handler Interface and it is contracted to use the method handleit() receiving a hashmap
 * object with data to be processed.
 *
 */
public class StudentsHandler implements Handler {

    /**
     * This is a method implemented by the contract with the Handler interface. It receives request from the Application
     * controller and returns data right back to it.
     * @param data
     * @return processed object
     */
    @Override
    public Object handleIt(HashMap<String, Object> data) {
        System.out.println("This is the student handler processing a command received from the application controller. It prints a list of student for example:");
        System.out.println("Student1, Student2, Student3 ...");
        // on this example I don't have any extra information to return then I'm just returning the received object to the Application controller.
        return data;
    }

}
