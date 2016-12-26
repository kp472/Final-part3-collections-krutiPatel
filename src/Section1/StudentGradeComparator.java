/**
 * 
 */
package Section1;

import java.util.Comparator;

/**
 * @author Kruti
 *
 */
public class StudentGradeComparator implements Comparator<Student> {
	
	public int compare(Student left, Student right){
		return left.getGrade().compareTo(right.getGrade());
	}

}

