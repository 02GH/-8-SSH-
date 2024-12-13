package cn.edu.cdut.Service;

import cn.edu.cdut.beans.Student;

import java.util.List;

public interface StudentService {
    public void newStudent(Student student);
    public Student loadStudentByID(int id);

}

