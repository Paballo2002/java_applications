/**
 * 
 */
package to_do_list_task_project;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sn = new Scanner(System.in);
		ListClass lclass = new ListClass();
		int i = 0;
		while(i != -1)
		{
			System.out.println("Please enter one of the following options : \n"
  		          +"------------------------------------------ \n"
  		          +"1. Add a task : \n"
  		          +"2. Delete a task : \n"
  		          +"3. List tasks : \n"
  		          +"4. Quit : ");

				int input = sn.nextInt();
				
				if(input < 0 || input > 4)
				{
					System.err.println("The input choise out of bounds");
				}
				else
				{
					switch(input)
					{
					    case 1:
					    	System.out.println("Please enter the task to be added");
					    	sn.nextLine();
					    	String tasktoAdd = sn.nextLine();
					    	lclass.addtask(tasktoAdd);
					    	break;
					    case 2:
					    	System.out.println("Please enter the task to be removed");
					    	sn.nextLine();
					    	String tasktoremove = sn.nextLine();
					    	
					    	String choice = null;
					    	
					    	for(String element : lclass.getTaskArray())
					    	{
					    		if(tasktoremove.equals(element))
					    		{
					    			choice = element;
					    		}
					    	}
					    	if(choice != null)
				    		{
				    			lclass.deletetask(choice);
				    			System.out.println("Succesfully deleted!");
				    		}
				    		else
				    		{
				    			System.err.println("Incorrect choice : ");
				    			System.err.println("Choose one of the following to remove : ");
				    			lclass.listTasks();
				    		}
					    	break;
					    case 3:
					    	lclass.listTasks();
					    	break;
					    case 4:
					    	System.out.println("Good Bye!");
					    	i = -1;
					    	break;
					    default:
					    		System.out.println("Incorrect Input sir!!!!");
					    		break;
					}
				} 
			}
		    sn.close();
		}
	}
