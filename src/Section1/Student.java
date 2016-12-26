/**
 * 
 */
package Section1;

/**
 * @author Kruti
 *
 */
public class Student implements Comparable<Student> {

	/**
	 * 
	 */
	private String name;
	private Integer age, grade;
	private Double average;

	public Student (String name, Integer age, Integer grade, Double average){
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.average = average;
	}
	
	public String getName(){
		return name;
	}
	
	public Integer getAge(){
		return age;
	}
	
	public Integer getGrade(){
		return grade;
	}
	
	public Double getAverage(){
		return average;
	}
	
	public int compareTo(Student s){
		return age.compareTo(s.age);
	}
	
	@Override
	public String toString(){
		return "Name: " + name+ "Age" +age+ "Grade" +grade+ "average" +average;
	}
	
}
