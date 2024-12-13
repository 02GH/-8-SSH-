package cn.edu.cdut.actions;

import cn.edu.cdut.Service.StudentService;
import cn.edu.cdut.beans.Student;
import cn.edu.cdut.utils.hbmutils;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.net.httpserver.HttpContext;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

public class SelectAction {
    int id;

    public void setId(int id) {
        this.id =id;
    }
    private Student student;
    private StudentService studentService;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Transactional(readOnly = true)
    public String execute(){
            HttpServletRequest request = ServletActionContext.getRequest();
            System.out.println(id);
            Session session = hbmutils.getSession();
            try {
                session.beginTransaction();
                String hqlString="select m.Class_id,c.t_cname from middle m,class c where m.Class_id=c.t_cid AND Student_id="+id;
                List<Object[]> list = session.createSQLQuery(hqlString).list();
                int count=0;
                for(Object[] s:list){
                    request.getSession().setAttribute("cid"+count,s[0]);
                    request.getSession().setAttribute("cname"+count,s[1]);
                    count++;
                }
                request.getSession().setAttribute("count",count);
                session.getTransaction().commit();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                session.getTransaction().rollback();
            }
            return "success";
        }


}
