package qlsv;

import java.sql.*;

public class SV {
	private String masv;
    private String hodem;
    private String tensv;
    private String telsv;
    private String emailsv;
    public void setMasv (String varMasv){
        this.masv=varMasv;
    }
    public void setHodem (String varHodem){
        this.hodem=varHodem;
    }
    public void setTensv (String varTensv){
        this.tensv=varTensv;
    }
    public void setTelsv(String varTelsv){
        this.telsv=varTelsv;
    }
    public void setEmailsv(String varEmailsv){
        this.emailsv=varEmailsv;
    }

    public String getMasv (){
        return this.masv;
    }
    public String getHodem (){
        return this.hodem;
    }
    public String getTensv (){
        return this.tensv;
    }
    public String getTelsv(){
        return this.telsv;
    }
    public String getEmailsv(){
        return this.emailsv;
    }
    public int themSV() throws SQLException{
        int result=0;
        if(this.masv==null || this.masv.length()<=0) return 0;
        if(this.tensv==null || this.tensv.length()<=0 || this.hodem==null || this.hodem.length()<=0) return 1;
        String sql ="";
        Connection conn=null;
        Statement statement=null;
        ResultSet rs=null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dburl="jdbc:mysql://localhost:3306/qlsv?useSSL=false"; // MySQL
            String username="root"; 	
            String userpass="12345678";
            conn = DriverManager.getConnection(dburl, username, userpass);

            statement = conn.createStatement();
            //MASV da co trong bang tblSV chua
            sql="SELECT * FROM sv WHERE MASV='"+this.masv+"'" ;
            rs = statement.executeQuery(sql);
            if(rs!=null){//Thuc hien INSERT INTO
                sql="INSERT INTO qlsv.sv (MASV, TENSV, HODEM,TELSV,EMAILSV)VALUES ('"+this.masv+"','"+this.tensv+"','"+this.hodem+"'";
                if(this.emailsv!=null && this.emailsv.length()>0) sql=sql+",'"+this.emailsv+"'";
                if(this.telsv!=null && this.telsv.length()>0) sql=sql+",'"+this.telsv+"'";
                sql=sql+")" ;
                if(statement.executeUpdate(sql)>0) result=10;
            }else result = 3;

            rs.close();
            statement.close();
            conn.close();

        }catch(Exception e){
            rs.close();
            statement.close();
            conn.close();
            System.out.println(e.toString());
        }
        return result;
    }//themSV
}
