package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//dto(Data Transfer Object)/model/POJO(Plain Old java Object)
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int student_id;
	private String student_name; //studentName
	private String student_email;
	private String student_branch;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudent_branch() {
		return student_branch;
	}
	public void setStudent_branch(String student_branch) {
		this.student_branch = student_branch;
	}

	public Student() {}
	
	public Student(String student_name, String student_email, String student_branch) {
		super();
		this.student_name = student_name;
		this.student_email = student_email;
		this.student_branch = student_branch;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(getStudent_id());
		str.append("-");
		str.append(getStudent_name());
		return str.toString(); //
		//return super.toString();
	}
	
}
