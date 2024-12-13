package cn.edu.cdut.Service;

import cn.edu.cdut.beans.Student;

public interface ClassDao {
    public void insertClass(cn.edu.cdut.beans.Class thisclass);

    public Class loadClass(int cid);
}
