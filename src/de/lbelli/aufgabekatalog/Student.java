package de.lbelli.aufgabekatalog;

public class Student implements Comparable<Student> { 
    private int id;
    private String name;
    private int age;
    	
    		public Student(int id, String name, int age) {
    			this.id = id;
    			this.name = name; 
    			this.age = age;
    		}
    		
    		public String getName() {
    			return name;
    		}
     @Override
     public int compareTo(Student other) {
    	 int idDiff = id - other.id;
    	 if(idDiff != 0)
    		 return idDiff;
    	 
    	 return age - other.age;         
    }  
   
}
 