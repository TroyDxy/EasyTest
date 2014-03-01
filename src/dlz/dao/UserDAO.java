package dlz.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
 
import dlz.db.DBConnection;
import dlz.po.User;

public class UserDAO {
	public static String getUsernameById(String userId) {
		String result = null;
		String sql = "select userName from t_user where userId=1";  
		Connection conn =  DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
		    result = rs.getString("userName");
		    System.out.print(result);
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		DBConnection.closeConnection(conn);
	}
		return result;
}
}