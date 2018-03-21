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
public class Model {

    int taskCount = 0;
    Task[] tasks = new Task[100];
    FileHelper helper = new FileHelper();

    Model() {
//constructor
    }

    void add(String description, String title) {
        Task task = new Task();
        task.setDescription(description);
        task.setTitle(title);
        tasks[taskCount] = task;
        taskCount++;
    }

    void remove(int index) {
        for (int i = index; i < taskCount; i++) {
            tasks[i] = tasks[i+1];
        }
    }

    void edit(int index, String description, String title) {
        tasks[index].setDescription(description);
        tasks[index].setTitle(title);
    }
    String[] getTasks(){
        String[] tmpTasks = new String[taskCount];
        for(int n = 0;n<taskCount;n++){
            tmpTasks[n] = tasks[n].toString();
            
        }
        return tmpTasks;
    }
}
