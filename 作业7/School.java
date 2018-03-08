package 作业7;

import java.util.TreeMap;

public class School {
	private TreeMap<Integer, Student> students;
	public School() {
		super();
		students=new TreeMap<Integer, Student>();
	}
	public void add(Student s) {
		if(s==null)return;
		if(students.put(s.getSnum(), s)==null)
			System.out.println("添加学生成功！");
		else System.out.println("该学生已经存在！");
	}
	public void del(int snum) {
		if(students.remove(snum)!=null)
			System.out.println("删除学生成功！");
		else System.out.println("该学生不存在！");
	}
	public void find(int snum) {
		if(students.get(snum)!=null)
			System.out.println(students.get(snum));
		else System.out.println("该学生不存在！");
	}
	public void editname(int snum,String name) {
		students.get(snum).setName(name);
	}
	public void editsex(int snum,char sex) {
		students.get(snum).setSex(sex);
	}
	public void editage(int snum,int age) {
		students.get(snum).setAge(age);
	}
	public void editscore(int snum,int score) {
		students.get(snum).setScore(score);
	}
}
