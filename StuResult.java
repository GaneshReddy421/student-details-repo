package studentdetails;

public class StuResult  //SubClass 
{
	public float per;
	public String result;
	public void calculate(int p,int totM)
	{
		per=(float)totM/6;
		if(p==1)
		{
			result="Fail";
		}
		else if(per>=70 && per<=100)
		{
			result="Destinction";
		}
		else if(per>=60 && per<70)
		{
			result="FirstClass";
		}
		else if(per>=50 && per<60)
		{
			result="SecondClass";
		}
		else if(per>=35 && per<50)
		{
			result="ThirdClass";
		}
	}
	public void getResult()
	{
         System.out.println("per:"+per+"\nResult:"+result);
	}
}


