package studentdetails;
import java.util.*;
@SuppressWarnings("serial")
public class Student extends Exception
{
	public Student(){}
	public Student(String msg){
		super(msg);
	}
	public static void main(String[] args) 
	{
    try(Scanner s = new Scanner(System.in);){
		try{
           System.out.println("Enter the stuName:");
           String stuName = s.nextLine();
           System.out.println("Enter the branch:");
           String br = s.nextLine().toUpperCase();
           BranchCheck bc = new BranchCheck();
           bc.verify(br);
           System.out.println("Enter the rollNo:");
           String rollNo = s.nextLine();
           if(rollNo.length()!=10){
               Student ob = new Student("InValid RollNo...");
               throw ob;
			}
            RollNoCheck rnc = new RollNoCheck();
            rnc.verify(br,rollNo.substring(6,8));
            int p=0,i=1,totM=0;
            System.out.println("====Enter Six Sub Marks====");
            while(i<=6){
	            try{
                   System.out.println("Enter the marks of sub:"+i);
                  int sub = Integer.parseInt(s.nextLine());
                   i++;
                  if(sub<0 || sub>100){
                     Student ob = new Student("Invalid Sub marks...");
                     throw ob;
	              }
	              if(sub>=0 && sub<=34){
		              p=1;
	               }
	              totM=totM+sub;
	            }//end of try
	            catch(Student ob){
                      System.out.println(ob.getMessage());		
		              i--;
	             }
             }//end of loop
             System.out.println("====Student Result=====");
             System.out.println("StuName:"+stuName);
             System.out.println("StuBranch:"+br);
             System.out.println("RollNo:"+rollNo);
             System.out.println("TotMarks:"+totM);
             StuResult sr = new StuResult();
             sr.calculate(p,totM);
             sr.getResult();
		}//end of try
		catch(Student | BranchCheck | RollNoCheck ob){
            System.out.println(ob.getMessage());			
		}
      }//OuterTry
	}
}