package com.forExam;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Project> NongNanprojects = new ArrayList<>();//arraybox
		List<Project> NongMonprojects = new ArrayList<>();
		Employee nongNan = new Employee("Nan",22,"Software Dev","H3K7J9M5L1");
		Employee nongMon = new Employee("Mon",41,"Software Dev","A7B2C9D1E4");
        
		//NongNan
		nongNan.showDetails();
        NongNanprojects.add(new Project("Project 1", "xdxdxd"));
        NongNanprojects.add(new Project("Project 2", "lololo"));
        Project.getProject(NongNanprojects);
        //NongNan
        
        //NongMon
        nongMon.showDetails();
        NongMonprojects.add(new Project("Project 99", "yes"));
        NongMonprojects.add(new Project("Project 254", "haha"));
        Project.getProject(NongMonprojects);
        //NongMon
	}

}
//<<interface>>
interface Person{
	public static void getName(String Name) {
		System.out.println("Name :"+Name);
	}
	public static void setName() {
		System.out.println("PLS ENTER UR NAME");
	}
	public static void getAge(int Age) {
		System.out.println("Age :"+Age);
	}
	public static void setAge() {
		System.out.println("PLS ENTER UR AGE");
	}
}
interface Job{
	static void getPosition(String Position) {
		System.out.println("Name :"+Position);
	}
	static void setPosition() {
		System.out.println("PLS ENTER UR POSITION");
	}
	static void getEmpID(int EmpID) {
		System.out.println("Age :"+EmpID);
	}
	static void setAge() {
		System.out.println("PLS ENTER UR EMPLOYEEID");
	}
}
//<<interface>>

//class employ
class Employee implements Person,Job{
	private String Name;
	private int Age;
	private String Position;
	private String EmpID;
	private ArrayList<Project> Projects;
	
	public Employee(String Name,int Age,String Position,String EmpID) {
		this.Name=Name;
		this.Age=Age;
		this.Position=Position;
		this.EmpID=EmpID;
		this.Projects=new ArrayList<>();
	}

    public void setName() {
        System.out.println("Please enter your name");
    }
	public void getName(String Name) {
        this.Name = Name;
    }


    public void setAge() {
        System.out.println("Please enter your age");
    }
    public void getAge(int Age) {
        this.Age = Age;
    }
    

    public void setPosition() {
        System.out.println("Please enter your position");
    }
    public void getPosition(String Position) {
        this.Position = Position;
    }

    public void setEmpID() {
        System.out.println("Please enter your employee ID");
    }
    public void getEmpID(String EmpID) {
        this.EmpID = EmpID;
    }
    
    public void showDetails() {
        System.out.println("*********************************************************************");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Position: " + Position);
        System.out.println("Employee ID: " + EmpID);
        
        for (Project project : Projects) {
            System.out.println("Project Name: " + project.getProjectName());
            System.out.println("Description: " + project.getDescription());
            System.out.println();
        }
    }


}

class Project{
	private String projectName;
	private String Description;
	
	public Project(String projectName,String Description) {
		this.projectName=projectName;
		this.Description=Description;
	}
	
	public static void getProject(List<Project> projects){
		for(Project project : projects) {
			System.out.println("Project Name : "+project.projectName);
			System.out.println();
			System.out.println("Description : "+project.Description);
			System.out.println();
			System.out.println("");
		}
	}
    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return Description;
    }
}


















