package JDBCProjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertingRecords {
    private static final String URL = "jdbc:mysql://localhost:3306/hibdb";
    private static final String UNAME = "root";
    private static final String PWORD = "tiger";

    private static Connection con;

    public static void main(String[] args)throws Exception {
        con = DriverManager.getConnection(URL,UNAME,PWORD);
        System.out.println("Connection Opened...");
        insertData();
        con.close();
        System.out.println("Connection closed...");
    }

    private static void insertData()throws Exception{
        String sqlQuerry = "insert into stu2 values(?,?,?)";
        //create Prepared Statement
        PreparedStatement ps = con.prepareStatement(sqlQuerry);
        //create Scanner
        Scanner sc = new Scanner(System.in);
        //insert 3 records
        for (int i=1;i<=3;i++){
            System.out.println("Enter sid : ");
            int sid = Integer.parseInt(sc.nextLine());
            System.out.println("Enter sName : ");
            String sName = sc.nextLine();
            System.out.println("Enter city : ");
            String city = sc.nextLine();

            //set the values
            ps.setInt(1,sid);
            ps.setString(2,sName);
            ps.setString(3,city);

            int count = ps.executeUpdate();

            System.out.println(count + " : row inserted..");

        }
        ps.close();
        sc.close();
    }
}
