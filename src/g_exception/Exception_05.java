package g_exception;

import java.sql.SQLException;

public class Exception_05 {
	public static void main(String[] args) {  //controller
		Service.serviceMethod();
		
		
	}
}


class Service{
	static void serviceMethod() {
		try {
			Dao.daoMethod();
		} catch (SQLException e) {
			e.printStackTrace();
//		} catch (IndexOutOfBoundsException() e1) { // 하나더 던져졌을때
//			e.printStackTrace();
//		} catch (SQLException | IndexOutOfBoundsException() e1) { // 멀티 캐치
//			e.printStackTrace();
		}
		
	}
}

class Dao{
	static void daoMethod() throws SQLException{ // 보내버린다. ,로 여러가지 예외를 다적어줘도 된다. 예외를 두개적으면 
		throw new SQLException(); // SQL예외가 발생하는것을
//		throw new IndexOutOfBoundsException();
	}
}