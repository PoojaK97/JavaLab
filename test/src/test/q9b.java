package test;

import java.sql.*;
import java.util.Scanner;

public class q9b {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
	Connection con;
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/";
	String dbname="bank";
	String username="root";
	String password="";
	int bankid=0;
	String user=null;
	float bal=0;
	try{
		Class.forName(driver);
		con=DriverManager.getConnection(url+dbname,username,password);
		con.setAutoCommit(false);
		
		while(true)
		{
			System.out.println("1.new banker 2.deposit 3.withdraw 4.rollback/commit 5.display ");
			int ch=input.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("ENTER THE DETAILS :");
				bankid=input.nextInt();
				user=input.next();
				bal=input.nextFloat();
				
				String q1="insert into bank values(?,?,?)";
				PreparedStatement pst=con.prepareStatement(q1);
				pst.setString(2, user);
				pst.setFloat(3, bal);
				pst.setInt(1, bankid);
				pst.execute();
				System.out.println("INSERTED SUCCESFULLY ");
				break;
				
			case 2:
				System.out.println("ENTER THE money to be deposited :");
				
				float d=(float)input.nextInt();
				bal=bal+d;
				
				String q2="update bank set bal=? where bankid=?";
				
				PreparedStatement st=con.prepareStatement(q2);
				st.setFloat(1, bal);
				st.setInt(2, bankid);
				
				boolean n=st.execute();
				
				System.out.println("DEPOSITED SUCCESSFULLY "+ n);
				break;
				
			case 3:
				System.out.println("ENTER THE money to be withdrawn :");
				float w=input.nextFloat();
				System.out.println(bal);
				bal=bal-w;
				if(bal>0)
				{
				String q3="update bank set bal="+bal+"where bankid="+bankid+"";
				Statement st1=con.createStatement();
				int n1=st1.executeUpdate(q3);
				System.out.println("WITHDRAWN SUCCESSFULLY ");
				}
				else
				{
					System.out.println("WITHDRAWN UNSUCCESSFUL balance too low ");
				}
				break;
				
				case 4:
					System.out.println("1.rollback() 2.commit()");
					int ch1=input.nextInt();
					if(ch1==1)
					{
						con.rollback();
					}
					else if(ch1==2)
					{
						con.commit();
					}
					break;
					
				case 5:
					System.out.println("The details are:");
					Statement st3=con.createStatement();
					ResultSet rs=st3.executeQuery("select * from bank ");
					while(rs.next())
					{
						System.out.println("Bank ID :" + rs.getString(1));
						System.out.println("Bank USER NAME  :" + rs.getString(2));
						System.out.println("Current Balance :" + rs.getString(3));
					}
					break;
				
				
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	

	}

	private static String string(float bal) {
		// TODO Auto-generated method stub
		return null;
	}

	}