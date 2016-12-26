/**
 * 
 */
package Section1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Kruti
 *
 */


public class StudentCollectionTester {
	
	public static List<Student> createdStudents(){
		List<Student> students = new ArrayList<Student>();
		
		students.add(0, new Student("Alison", 19, 1, 4.0));
		students.add(1, new Student("Barbara", 18, 2, 3.5));
		students.add(2, new Student("Charlie", 17, 1, 3.8));
		students.add(3, new Student("Donalnd", 20, 3, 3.6));
		students.add(4, new Student("Edward", 21, 4, 2.8));
		
		return students;
	}
	
	public static void sortStudent(List<Student> students){

		System.out.println("BEFORE SORTING: " + students);

		Collections.sort(students);

		System.out.println("AFTER SORTING: " + students);

		}


		public static void sortStudentInReverseOfNaturalOrder(List<Student> students){

		System.out.println("BEFORE SORTING: " + students);

		Collections.sort(students);

		Collections.reverse(students);

		System.out.println("AFTER SORTING: " + students);

		}


		public static void sortStudentBasedOnGrade(List<Student> students){

		System.out.println("BEFORE SORTING: " + students);

		StudentGradeComparator gradeComparator = new StudentGradeComparator();

		Collections.sort(students, gradeComparator);

		System.out.println("AFTER SORTING: " + students);

		}


		public static void sortStudentBasedOnReverseAverage(List<Student> students){

		System.out.println("BEFORE SORTING: " + students);

		StudentAverageComparator averageComparator = new StudentAverageComparator();

		Collections.sort(students, Collections.reverseOrder(averageComparator));

		System.out.println("AFTER SORTING: " + students);

		}


		public static List<Student> shuffleStudents(List<Student> students){

		System.out.println("BEFORE SORTING: " + students);

		Collections.shuffle(students);

		System.out.println("AFTER SORTING: " + students);

		return students;

		}


		public static List<Student> reverseStudents(List<Student> students){

		System.out.println("BEFORE SORTING: " + students);

		Collections.reverse(students);

		System.out.println("AFTER SORTING: " + students);

		return students;

		}


		public static List<Student> swap1stAnd2ndStudents(List<Student> students){

		System.out.println("BEFORE SORTING: " + students);

		Collections.swap(students, 1, 2);

		System.out.println("AFTER SORTING: " + students);

		return students;

		}


		public static List<Student> copyStudents(List<Student> students){

		System.out.println("BEFORE SORTING: " + students);

		List<Student> newStudents = new ArrayList<Student>();

		Collections.copy(students, newStudents);

		System.out.println("AFTER SORTING: " + newStudents);

		return newStudents;

		}


		public static Student maxStudentInStudents(List<Student> students){

		System.out.println("BEFORE SORT: " + students);

		Collections.sort(students);

		System.out.println("AFTER SORT: " + students);


		System.out.println("CURRENT MAX STUDENT: " + Collections.max(students));


		return Collections.max(students);

		}


		public static Integer binarySearchOrderedStudents(List<Student> students){

		System.out.println("BEFORE SORT: " + students);

		Student studentToSearch = students.get(2);

		Collections.sort(students);

		System.out.println("AFTER SORT: " + students);

		System.out.println("POSITION OF BARBARA: " + "POSITION #" + Collections.binarySearch(students, studentToSearch));

		return Collections.binarySearch(students, studentToSearch);

		}

}
