package arshad.assignment.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentStreamExample {
	public static void main(String[] args) {
		// Create a list of students
		List<Student> students = Arrays.asList(
				new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85),
				new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6),
				new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8),
				new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4),
				new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4),
				new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5),
				new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83),
				new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82),
				new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4),
				new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8),
				new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2),
				new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3),
				new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80),
				new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70),
				new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70),
				new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70),
				new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));

		// 1. Print the name of all departments in the college
		System.out.println("Departments: "
				+ students.stream().map(Student::getEngDepartment).distinct().collect(Collectors.toList()));

		// 2. Get the names of all students who have enrolled after 2018
		List<String> studentsEnrolledAfter2018 = students.stream()
				.filter(student -> student.getYearOfEnrollment() > 2018).map(Student::getName)
				.collect(Collectors.toList());
		System.out.println("Students enrolled after 2018: " + studentsEnrolledAfter2018);

		// 3. Get the details of all male students in the Computer Science department
		List<Student> maleStudentsInCS = students.stream().filter(
				student -> "Male".equals(student.getGender()) && "Computer Science".equals(student.getEngDepartment()))
				.collect(Collectors.toList());
		System.out.println("Male students in Computer Science: " + maleStudentsInCS);

		// 4. Count the number of male and female students
		Map<String, Long> genderCounts = students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println("Gender counts: " + genderCounts);

		// 5. What is the average age of male and female students
		Map<String, Double> averageAgeByGender = students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
		System.out.println("Average age by gender: " + averageAgeByGender);

		// 6. Get the details of the highest-scoring student
		Optional<Student> highestScoringStudent = students.stream()
				.max(Comparator.comparingDouble(Student::getPerTillDate));
		highestScoringStudent.ifPresent(student -> System.out.println("Highest scoring student: " + student));

		// 7. Count the number of students in each department
		Map<String, Long> departmentCounts = students.stream()
				.collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));
		System.out.println("Department counts: " + departmentCounts);

		// 8. Calculate the average percentage achieved in each department
		Map<String, Double> averagePercentageByDepartment = students.stream().collect(
				Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate)));
		System.out.println("Average percentage by department: " + averagePercentageByDepartment);

		// 9. Get the details of the youngest male student in the Electronic department
		Optional<Student> youngestMaleInElectronic = students.stream().filter(
				student -> "Male".equals(student.getGender()) && "Electronic".equals(student.getEngDepartment()))
				.min(Comparator.comparingInt(Student::getAge));

		youngestMaleInElectronic.ifPresent(student -> System.out.println("Youngest male in Electronic: " + student));
		// 10. Count the number of male and female students in the Computer Science
		// department
		Map<String, Long> genderCountsInCS = students.stream()
				.filter(student -> "Computer Science".equals(student.getEngDepartment()))
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println("Gender counts in Computer Science: " + genderCountsInCS);
	}
}
