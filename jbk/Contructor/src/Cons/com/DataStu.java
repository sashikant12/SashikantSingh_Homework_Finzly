package Cons.com;

public class DataStu {
	private int studentid;
	private String stuname;
	private int stuage;
	
	DataStu(){
		studentid=100;
		stuname="meme";
		stuage= 16;
	}
	

   DataStu(int studentid, String stuname, int stuage) {
		this.studentid = studentid;
		this.stuname = stuname;
		this.stuage = stuage;
	}


	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public int getStuage() {
		return stuage;
	}

	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	

}
