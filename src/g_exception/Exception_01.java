package g_exception;

public class Exception_01 {
	public static void main(String[] args) {
		/*
		1. 프로그램 오류
		  - 프로그램이 실행중 어떤 원인에 의해서 오작동을 하거나 비정상적으로 종료되는 경우
		  - 컴파일 에러 : 컴파일시에 발생하는 에러
		  - 런타임 에러 : 실행시에 발생하는 에러
		  - 예외는 프로그램 코드에 의해서 수습될 수 있는 경미한 오류  // 코드로 고칠수있는것
		  	에러 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 // 못고침
		
		
		2. RuntimeException클래스와 그외 클래스
		  - 모든 예외의 최고조상은 Exception이다.
		  - RuntimeException클래스들은 주로 프로그래머의 실수에 의해 발생하는 예외
		    : IndexOutOfBoundsException, NullPointException... 
		  - Exception클래스들은 주로 외부의 영향으로 발생할 수 있는 것들.
		    : FileNotFoundException, ClassNotFoundException..
		    
		3. 예외처리( try-catch )
		  - 프로그램 실행시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것.
		  - 구조
		    try{
		    	// 예외가 발생할 가능성이 있는 코드 
		    } catch (Exception e1){
		    	// e1예외 발생시 처리할 문장.
		    } catch (Exception e2){
		    	// e2예외 발생시 처리할 문장.
		    } catch (Exception e3){
		    	// e3예외 발생시 처리할 문장.
		    }
			
			// e2 e3가 나오면 e2하고 다시돌고 e3를 처리한다.
		
		
		4. 예외발생 시키기 //요구한 예외가 다를때
		  - 연산자 new를 이용해서 발생시키려는 예외클래스의 객체를 만든다.
		    Exception e = new Exception();
		  - 키워드throw를 이용해서 예외를 발생시킨다.
		    throw e; // 예외가 발생한다.
		    
		    throw new Exception(); // 한번만 사용할때
		
		
		5. 예외 던지기
		  - 메서드의 예외 선언하기.
		    : 메서드의 선언부에 'throws'를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어주기만 하면 된다.
		    
		            처리는 그 메서드를 호출하는 부분에서 해주면된다.
		
		6. finally //최종적으로 도착하는곳
		  - try-catch블럭의 예외발생에 상관없이 실행되어야 할 코드를 포함한다.
		  - 구조
		  	try{
		  		예외가 발생할 가능성이 있는 코드
		  	} catch(Exception e){
		  		예외가 발생하였을때 처리를 위한 코드
		  	} finally {
		  		예외발생에 상관없이 실행되어야할 코드
		  	}
		  	
		  - 순서
		    : try -> finally
		    : try -> catch -> finally
		
		
		
		
		
		
		
		
		
		
		
		
		*/
	}
}
