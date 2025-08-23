package oops;

class SoftwareTesting
{
	void Syllabus()
	{
		System.out.println("Software testing course details");
		System.out.println("Manual testing,Core Java, Selenium, Web driver,Jira(project management),Mysql");
		System.out.println("Fees : 50000");
	}
	
}
class Manual extends SoftwareTesting
{
	void manual_testing()
	{
		super.Syllabus("If it is manual testing only \nthen it includes Manual testing concepts jira ");
	}
}
class Automation extends SoftwareTesting
{
	void automation_testing()
	{
		System.out.println("If it is manual testing only \nthen it includes Manual testing concepts jira ");
	}
}

public class Java_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manual mn=new Manual();
		mn.manual_testing();
		
		Automation auto=new Automation();
		auto.automation_testing();
		

	}

}
