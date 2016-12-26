/**
 * 
 */
package Section1;

import java.util.Comparator;

/**
 * @author Kruti
 *
 */
public class StudentAverageComparator implements Comparator<Student>{
	
	public int compare(Student left, Student right){
		return left.getAverage().compareTo(right.getAverage());
	}

}