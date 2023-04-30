package com.teststudent;
import java.util.Scanner;
import com.staticstudent.Student;
public class TestStudents {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1: create student 2: display student 3: show names of the student 4:exit");
		Student[] std=new Student[5];
		int index=0,choice=0;
		
		
		do {
			System.out.println("Enter a choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(index<std.length)
				{
					System.out.println("name  city");
					Student s1=new Student(sc.next(),sc.next());
					std[index]=s1;
					index++;
				}
				else
				{
					System.out.println("array size is full!!");
				}
				break;
				
			case 2:
				System.out.println("show student details:");
				if(std!=null)
				{
				for(int i=0;i<index;i++)
				{
					std[i].display();
					
				}
				}
				break;
				
			case 3:
				System.out.println("show only names of the students: ");
				for(int i=0;i<index;i++)
				{
					System.out.println(std[i].getName());
				}
			}
			
		}while (choice!=4);
		
		
	
	}
	
	}


