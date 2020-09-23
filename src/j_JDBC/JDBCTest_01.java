package j_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest_01 {
	public static void main(String[] args) {
		
		//try안에서 실수하면 사용못하기때문에 밖에다 선언 (2.DB커넥션)
		Connection conn = null;
		Statement stmt = null; //3 트라이캐치가 있을땐 변수를 항상 밖에
		ResultSet rs = null; //4 에서 저장하기위해

		
		try { 
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); //문자열로 관리할때는 이름이 없을수도 있기 때문에 오타가 날수도있다 항상 트라이캐치해줘야한다.
			System.out.println("드라이버 로딩 성공");
			
			//2.
			String url = "jdbc:oracle:thin:@192.168.0.85:1521:xe";
			String userId = "sem";
			String password = "java";
			
			conn = DriverManager.getConnection(url, userId, password);
			System.out.println("DB접속 성공");
			
			//3. 질의
			stmt = conn.createStatement(); // 쿼리 통로 개방
			String sql = "SELECT MEM_ID, MEM_PASS, MEM_NAME, MEM_JOB "
					   + "FROM   MEMBER ";
//					   + "WHERE  MEM_ID = 'a001' ";
			
			rs = stmt.executeQuery(sql); //select 할때만 사용하는 메서드 다른것은따로있다.
			
			//4
			int index = 0;
			while(rs.next()){  //다음게 있느냐 있으면 true준다 없으면 false 다음로우가 있느냐
				
				List<MemberVO> memList = new ArrayList<>();
				
				MemberVO mv = new MemberVO();
				mv.setMem_id(rs.getString("mem_id"));
				mv.setMem_pass(rs.getString("mem_pass"));
				mv.setMem_name(rs.getString("mem_name"));
				mv.setMem_job(rs.getString("mem_job"));
				
				memList.add(mv);		
				
				System.out.println(memList.get(index));
				
//				System.out.println(rs.getString("mem_id")); //처음줄가져와서 mem_id컬럼형이 가지고있는 벨류갑 a001
//				System.out.println(rs.getString("mem_pass")); 
//				System.out.println(rs.getString("mem_name")); 
//				System.out.println(rs.getString("mem_job")); 
				
			}
			
			
			
		} catch (ClassNotFoundException e) { //1
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {           //2
			System.out.println("DB접속 실패");   
			e.printStackTrace();
		} finally {  //5 자원반납 종료
			
			try{
				if(rs != null){
					rs.close();
				}
				
				if(stmt != null){
					stmt.close();
				}
				
				if(conn != null){
					conn.close();
				}
				
			} catch (SQLException e){
				e.printStackTrace();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
