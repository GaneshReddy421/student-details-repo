
package studentdetails;
@SuppressWarnings("serial")
public class RollNoCheck extends Exception{
	public RollNoCheck(){}
	public RollNoCheck(String msg){
		super(msg);
	}
	public String branch;
	public void verify(String br,String code)
	throws RollNoCheck
	{
		try{
		  switch(code)
		  {
			case "05":branch="CSE";
			break;
			case "04":branch="ECE";
			break;
			case "02":branch="EEE";
			break;
		  }//end of switch
		  if(branch==null)
		  {
             RollNoCheck rnc = 
              new RollNoCheck("rollNo not belongs to branch...");
			  throw rnc;
   	      }else{
			  if(!branch.equals(br)){
                RollNoCheck rnc = 
                      new RollNoCheck("rollNo not belongs to branch...");
				throw rnc;
			  }
		  }
		}catch(RollNoCheck rnc){
			throw rnc;//re-throwing
		}
	}
}
