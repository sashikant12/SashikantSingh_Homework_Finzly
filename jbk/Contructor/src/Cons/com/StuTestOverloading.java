package Cons.com;

public class StuTestOverloading {
	public static void main(String args[]) {
		DataStu bio = new DataStu();
		System.out.println("Stu name = "+ bio.getStuname());
		System.out.println("Stu age = "+ bio.getStuage());
		System.out.println("Stu id = "+ bio.getStudentid());
		
		DataStu biodata = new DataStu(12,"meme",17);
		System.out.println("Stu name = "+ biodata.getStuname());
		System.out.println("Stu age = "+ biodata.getStuage());
		System.out.println("Stu id = "+ biodata.getStudentid());
	}
}
