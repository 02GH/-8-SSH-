package cn.edu.cdut.Service;

public class ClassServiceImpl implements ClassService{
    private ClassDao classDao;

    public void setClassDao(ClassDao classDao) {
        this.classDao = classDao;
    }

    @Override
    public void newClass(cn.edu.cdut.beans.Class thisclass) {
        classDao.insertClass(thisclass);
    }

    @Override
    public Class loadClassByID(int cid) {
        Class thisclass=classDao.loadClass(cid);
        return thisclass;
    }
}
