package to_do_list_task_project;

import java.util.ArrayList;

public class ListClass
{
	private ArrayList<String> taskArray;
		
	public ListClass()
	{
		this.taskArray = new ArrayList<>();
	};
    
	//Method to add to the list
    public void addtask(String task)
    {
    	taskArray.add(task);
    }
    
    //Method to check if the list is empty or not
    private boolean isEmpty()
    {
    	if(taskArray.isEmpty())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    //Deleting the task from the list
    public void deletetask(String task)
    {
    	if(isEmpty() == true)
    	{
    		System.out.println("The list is empty sir!!");
    	}
    	else
    	{
    		int index = -1;
	    	for(int i = 0 ; i < taskArray.size() ; i++)
	    	{
	    		if(taskArray.get(i).equals(task))
	    		{
	    			index = i;
	    		}
	    	}
	    	taskArray.remove(index);
    	}
    }
    
    public void listTasks()
    {
    	if(isEmpty())
    	{
    		System.out.println("The list is empty sir!!");
    	}
    	else
    	{
    		System.out.println("List of tasks : ");
    		for(String i : taskArray)
        	{
        		System.out.println("     "+i);
        	}
    	}
    }
    
    //Accessor Methods for our array
    public ArrayList<String> getTaskArray() 
    {
		return (ArrayList<String>) taskArray;
	}

	public void setTaskArray(ArrayList<String> taskArray)
	{
		this.taskArray = taskArray;
	}
}
