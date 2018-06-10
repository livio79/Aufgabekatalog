package de.lbelli.io;

import java.io.*;

public class ObjectSerialization  {
   public static void main(String[] args){
	   System.out.println("GO");
	   String aaa = System.getProperty("user.home");
	   System.out.println(aaa);
	   String file = "object.txt";
	   String [] names = {"John", "Jack", "Mike", "Tim", "Tom"};
	   Person [] persons = new Person [names.length];
	   
	   
	   try(ObjectOutputStream objectOUT = new ObjectOutputStream
			   							(new BufferedOutputStream
			   									(new FileOutputStream(file)))){
		   
		   //Initialize and write persons
		   for(int i = 0; i < names.length; i++) {
			  persons[i] = new Person(names[i], (int)(Math.random()*100));
			  objectOUT.writeObject(persons[i]);
		   }
		   
		   objectOUT.flush();
		   
	   } catch (IOException e ) {
		   e.getStackTrace();
	   }

	   try(ObjectInputStream objectIN = new ObjectInputStream
					(new BufferedInputStream
									( new FileInputStream(file)))){
		
		 
		for(int i = 0; i < names.length; i++) {
			Person p = (Person) objectIN.readObject();
			System.out.printf("Name: %5s  age: %5d%n",p.getName(), p.getAge());
		}
		 
		
		} catch (IOException e ) {
		e.getStackTrace();
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}
	     
   }
}






class Person implements Serializable {
 
	private static final long serialVersionUID = -6912659957194524900L;
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	 
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}



 

