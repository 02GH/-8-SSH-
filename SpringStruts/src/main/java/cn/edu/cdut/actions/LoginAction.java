package cn.edu.cdut.actions;

import cn.edu.cdut.Service.StudentService;
import cn.edu.cdut.beans.Student;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

public class LoginAction implements ModelDriven<Student> {

    private Student student;
    private StudentService studentService;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student getModel() {
        return student;
    }

    public String execute(){
        System.out.println(student.toString());
        studentService.newStudent(student);
     return "success";
    }


}
