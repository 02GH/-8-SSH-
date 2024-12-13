package cn.edu.cdut.beans;

import java.util.Set;

public class Student {
	private Integer id;
	private String name;
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	private int age;
	private double score;
	private Set<Class> classes;

	public Set<Class> getClasses() {
		return classes;
	}

	public void setClasses(Set<Class> classes) {
		this.classes = classes;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return name+","+sex+","+age+","+score;
	}
	

}
