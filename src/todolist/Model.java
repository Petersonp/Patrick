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
String lines[] = helper.readTasks();
taskCount = lines.length ;

for (int i = 0; i< taskCount;i++){
    
    tasks[i] = new Task();
    //loops through and creates new task out of every line
    //
    String taskLine[] = lines[i].split("#");
    tasks[i].setTitle(taskLine[0]);
    tasks[i].setDescription(taskLine[1]);
    
}

    }

    void add(String description, String title) {
        Task task = new Task();
        task.setDescription(description);
        task.setTitle(title);
        tasks[taskCount] = task;
        taskCount++;
        
        helper.writeTasks(getTasks());
    }

    void remove(int index) {
        tasks[index].setDescription("");
        tasks[index].setTitle("");
        for (int i = index; i < taskCount; i++) {
            tasks[i] = tasks[i + 1];
        }
        taskCount--;
        helper.writeTasks(getTasks());
        
    }

    void edit(int index, String description, String title) {
        tasks[index].setDescription(description);
        tasks[index].setTitle(title);
        helper.writeTasks(getTasks());
    }

    String[] getTasks() {
        String[] tmpTasks = new String[taskCount];
        for (int n = 0; n < taskCount; n++) {
            tmpTasks[n] = tasks[n].toString();

        }
        return tmpTasks;
    }

    String[] getTaskValues(int index) {
        String[] values = new String[2];
        values[0] = tasks[index].getTitle();
        values[1] = tasks[index].getDescription();
        return values;
    }
}
