package studentdetails;
@SuppressWarnings("serial")
public class BranchCheck extends Exception{
		public BranchCheck(){}
		public BranchCheck(String msg){
			super(msg);
		}
		public void verify(String br)throws BranchCheck
		{
			try{
			   switch(br) {
				   case "CSE":
				   break;
				   case "ECE":
				   break;
				   case "EEE":
				   break;
				   default://Exception
	               BranchCheck bc = new BranchCheck("Branch donot exist...");
                   throw bc;
			       }//end of switch
			  }catch(BranchCheck bc){
				throw bc;//re-throwing
			}
		}
	}



