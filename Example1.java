import java.sql.*;
import java.util.*;
class Example
{
 public static void main(String args[])
 {
  try
  {
   Class.forName("oracle.jdbc.driver.OracleDriver");
   System.out.println("Loaded");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC96","IPC96");
     System.out.println("Connection Success");
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your employee id");
      int empno=sc.nextInt();
      Statement sct=con.createStatement();
      String sql="select*from employee where empid="+empno;
   ResultSet rs=sct.executeQuery(sql);
    boolean result=false;
     while(rs.next())
     {
     //check the rows line by line until all the records are completed
     //verify input empno with first colun of your table
 
       System.out.println("You are a valid user");
       System.out.println("Hello"+rs.getString(2));
       //result=true;
       //break;
  }
  }//while-closing
  else
  System.out.println("You are a invalid user"); 
 }//try
  catch(Exception e)
  {
   System.out.println("e");
  }
 }
}