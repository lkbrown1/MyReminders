package caualberta.cs.myreminders;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class List_Tasks extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_task);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list__tasks, menu);
		return true;
	}
	
	public void addTaskAction(View v){
		Toast.makeText(this, "addnewTask", Toast.LENGTH_SHORT).show();
		TaskListController st = new TaskListController();
		EditText textView = (EditText) findViewById(R.id.addTasks);
		st.addTask(new Task(textView.getText().toString()));
		
	}

	public Object addTask(Task task) {
		// TODO Auto-generated method stub
		return this.addTask(task);
		
	}

	
 
	
	/*@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
}
