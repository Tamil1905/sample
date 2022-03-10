package com.tamil.marks;

public class Marks {
	String name;
	int priliminary;
	int mains;
	int interview;
	
	public Marks(String name,int priliminary,int mains,int interview) {
		this.name = name;
		this.priliminary = priliminary;
		this.mains = mains;
		this.interview = interview;
	}

	public static void main(String[] args) throws Exception {
		Marks m1 = new Marks("selva",300,300,35);
		System.out.println(m1.name);
		System.out.println(m1.priliminary);
		System.out.println(m1.mains);
		System.out.println(m1.interview);
		MarksDAO.addMarks(m1.name,m1.priliminary,m1.mains,m1.interview);

	}

}
