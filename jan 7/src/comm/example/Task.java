package comm.example;

public class Task 

{
     private String taskId;
     private String taskDate;
     private String taskTime;
     private String taskisCompleted ;
      
     public Task()
     {
    	 super();
     }
     
     public Task ( String taskId ,String taskDate ,String taskTime ,String taskisCompleted)
     {
    	 super();
 		this.taskId = taskId;
 		this.taskDate = taskDate;
 		this.taskTime = taskTime;
 		this.taskisCompleted =taskisCompleted;
    	 
     }
     
}
