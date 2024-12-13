package cn.edu.cdut.Service;

import cn.edu.cdut.beans.Student;
import org.hibernate.SessionFactory;

public class ClassDaoImpl implements ClassDao{
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void insertClass(cn.edu.cdut.beans.Class thisclass) {
        sessionFactory.getCurrentSession().save(thisclass);
    }

    @Override
    public Class loadClass(int cid) {
        Class thisclass=sessionFactory.getCurrentSession().load(Class.class,cid);
        return thisclass;
    }
}
