import java.util.Scanner;

class Person
{
	public String name;
	public String gender;

	public Person(String name, String gender)
	{
		this.name = name;
		this.gender = gender;
	}
}

class Student extends Person
{
	public String branch;

	public Student(String name, String gender, String branch)
	{
		super(name,gender);
		this.branch = branch;
	}
}

class Services
{
	public int i;
	public Student s[];
	public Scanner scan;
	public String option;

	public Services()
	{
		s = new Student [10];
		i = 0;
		scan = new Scanner(System.in);
	}

	public void inputRecords()
	{
		do
		{
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Gender: ");
			String gender = scan.nextLine();
			System.out.print("Branch: ");
			String branch = scan.nextLine();

			s[i] = new Student(name,gender,branch);
			i++;

			System.out.println("Do you want to enter again? (Y/N): ");
			option = scan.nextLine();
		}while(option.equalsIgnoreCase("Y"));
	}

	public void displayAll()
	{
		for(int j=0; j<i; j++)
		{
			System.out.println(s[j].name);
			System.out.println(s[j].gender);
			System.out.println(s[j].branch);
		}
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		Services ser = new Services();
		ser.inputRecords();
		ser.displayAll();
	}
}