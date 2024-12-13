package cn.edu.cdut.beans;


import java.util.HashSet;
import java.util.Set;


public class Class {
	private Integer cid;
	private String cname;
	private Set<Student> students;

	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public Class(String cname, Set<Student> students) {
		super();
		this.cname = cname;
		this.students = students;
	}

	public Class(String cname) {
		super();
		this.students = new HashSet<Student>();
		this.cname = cname;
	}
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addStudent(Student student){
		this.getStudents().add(student);

	}
	@Override
	public String toString() {
		return "Class [cid=" + cid + ", cname=" + cname  + "]";
	}
	public String toString1() {
		return "Class [cid=" + cid + ", cname=" + cname + ", students="
				+ students + "]";
	}
	
	
	
}
