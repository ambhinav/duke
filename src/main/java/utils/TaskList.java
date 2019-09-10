package utils;

import tasks.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    /**
     * Enable access to the current lists of tasks.
     *
     * @param tasks list of tasks created from stored data
     */
    public TaskList(List<Task> tasks) {
        this.tasks = tasks;
    }

    public int getSize() {
        return this.tasks.size();
    }

    /**
     * Retrieve task from the task list.
     *
     * @param taskId of the task
     * @return task required
     */
    public Task getTask(int taskId) {
        return this.tasks.get(taskId);
    }

    /**
     * Adds tasks to the list.
     *
     * @param task to add to list
     */
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    /**
     * Delete tasks from the list.
     *
     * @param taskId the task to delete
     * @return task that was deleted
     */
    public Task deleteTask(int taskId) {
        return this.tasks.remove(taskId);
    }

    /**
     * Finds the matching tasks from the current list of tasks,
     * which match the keywords given keyword.
     *
     * @param keyword to match
     * @return list of tasks that match with keyword
     */
    public List<Task> findMatchingTasks(String keyword) {
        // create dummy list
        List<Task> matchingTasks = new ArrayList<>();
        // look through existing task list
        for (Task task: tasks) {
            if (task.toString().contains(keyword)) {
                matchingTasks.add(task);
            }
        }

        return matchingTasks;
    }
}
