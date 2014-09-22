package caualberta.cs.myreminders;

public class TaskListController {
	
	private static List_Tasks taskList = null;
	static public List_Tasks getTaskList(){
		if ((taskList) == null){
			taskList = new List_Tasks();
		}
		return taskList;
	}
	public void addTask(Task task){
		getTaskList().addTask(task);
	}

}
