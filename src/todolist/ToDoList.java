/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;
import java.util.Date;
/**
 *
 * @author Patrick
 */
public class ToDoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new Model();
        ViewController viewcontroller = new ViewController(model);
        //allows ViewController to access model
        viewcontroller.setVisible(true);
//        model.add("Test task 1",new Date());
//        model.add("Test task 2",new Date());
//        model.add("Test task 3",new Date());
//        model.add("Test task 4",new Date());
//        model.add("Test task 5",new Date());
//        model.edit(2,"Edited",new Date());
//        model.remove(3);
//        System.out.println("Done");
    }
    
}
