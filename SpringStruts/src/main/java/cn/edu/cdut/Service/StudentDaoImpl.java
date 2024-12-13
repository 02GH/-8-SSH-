package cn.edu.cdut.Service;

import cn.edu.cdut.beans.Student;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class StudentDaoImpl implements StudentDao{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void insertStudent(Student student) {

            sessionFactory.getCurrentSession().save(student);

    }

    @Override
    public Student loadStudent(int id) {
        Student student=sessionFactory.getCurrentSession().load(Student.class,id);
        return student;
    }
}
