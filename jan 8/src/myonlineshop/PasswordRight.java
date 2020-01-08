package myonlineshop;



public class PasswordRight {
      private String password;
      private String user_Name;
      private PasswordRight passwordRight =null;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public PasswordRight(String password, String user_Name) {
		super();
		this.password = password;
		this.user_Name = user_Name;
	}
      
      
      
      public PasswordRight createPasswordRight(String user_Name , String password ) throws PassswordRightNotCreatedException
      {
    	  passwordRight = new PasswordRight(user_Name , password);
    	  


    	     }
    	  else
    	    {
    		  throw new PasswordRightNotCreatedException(" invalid user");
    		}
    		return passwordRight;
    	  
      }
	@Override
	public String toString() {
		return "PasswordRight [password=" + password + ", user_Name=" + user_Name + "]";
	}
      
      
      
      
      
      
}
