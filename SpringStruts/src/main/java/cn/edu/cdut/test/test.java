package cn.edu.cdut.test;

import cn.edu.cdut.Service.ClassService;
import cn.edu.cdut.Service.StudentService;
import cn.edu.cdut.beans.Class;
import cn.edu.cdut.beans.Student;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void testhibernate(){

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 创建并使用Login的代理对象
        StudentService studentService = (StudentService) factory.getBean("studentService");//loginImpl是代理工厂实例
        Student tom =(Student)factory.getBean("student");
        tom.setAge(15);
        tom.setName("tom");
        tom.setScore(90);
        tom.setSex("man");
        studentService.newStudent(tom);
        ClassService classService=(ClassService)factory.getBean("classService");
        Class java=(Class)factory.getBean("class");
        java.setCname("java");
        classService.newClass(java);
        Class ssh=(Class)factory.getBean("class");
        java.setCname("SSH");
        classService.newClass(ssh);
    }
}
