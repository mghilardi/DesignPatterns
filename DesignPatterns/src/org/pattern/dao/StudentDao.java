package org.pattern.dao;
import java.util.List;

import org.pattern.dao.model.Student;


public interface StudentDao {
	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);
}