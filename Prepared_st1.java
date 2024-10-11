import java.util.*;
import java.sql.*;
public class Prepared_st1 {

	public static void main(String [] args) throws ClassNotFoundException , SQLException{
		Scanner sc=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","ROOT123");
		
		String a="create table teacher(id int auto_increment primary key,tname varchar(50) not null,tage int,tlocation varchar(20))";
		
		Statement st=con.createStatement();
		st.executeUpdate(a);
		st.executeUpdate("insert into teacher (tname,tage,tlocation) values"+"('Gaurav Tripathi',34,'Mumbai'),"+"('Shyam Tiwari',33,'Dehradun'),"
		+"('Ansh Pandit',99,'Bhoapli')");
		ResultSet rs=st.executeQuery("Select * from teacher");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("tname");
			int age=rs.getInt("tage");
			String location=rs.getString("tlocation");
			System.out.println(id+" "+name+" "+age+" "+location);
			
		}
		
		PreparedStatement stm=con.prepareStatement("select * from teacher where id=? and tage>=?");
		System.out.println("enter the id of the teacher");
		int id=sc.nextInt();
		System.out.println("enter the age of a teacher");
		int age=sc.nextInt();
		stm.setInt(1,id);
		stm.setInt(2,age);
		stm.executeQuery();
		ResultSet rt=stm.executeQuery();
		while(rt.next()) {
			 id=rt.getInt("id");
			String name=rt.getString("tname");
			age=rt.getInt("tage");
			String location=rt.getString("tlocation");
			System.out.println("the teacher name is "+name+" "+id+" "+age+" "+location);
			
		}
		rt.close();
		stm.close();
		rs.close();
		st.close();
		con.close();
		sc.close();		
	}
	
}
