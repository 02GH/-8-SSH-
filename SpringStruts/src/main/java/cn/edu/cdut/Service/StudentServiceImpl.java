package cn.edu.cdut.Service;



import cn.edu.cdut.beans.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void newStudent(Student student) {
		studentDao.insertStudent(student);
	}

	@Override
	public Student loadStudentByID(int id) {
		Student student = studentDao.loadStudent(id);
		return student;
	}
}
