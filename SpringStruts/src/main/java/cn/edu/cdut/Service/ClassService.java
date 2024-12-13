package cn.edu.cdut.Service;

import cn.edu.cdut.beans.Student;

public interface ClassService {
    public void newClass(cn.edu.cdut.beans.Class thisclass);
    public Class loadClassByID(int cid);
}
