package cn.edu.cdut.Service;

import cn.edu.cdut.beans.Student;

import java.security.PublicKey;
import java.util.List;

public interface StudentDao {
    public void insertStudent(Student student);

    public Student loadStudent(int id);
}
