package com.ict.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

//	DB 처리하는 메서드들을 가지고 있는 클래스

public class Ex01_DAO {
	
	//	MyBatis 에서 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	//	싱글턴 패턴(동기화 처리까지)
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			//	수동 commit 을 해야된다. **openSession()
			ss = Ex01_DBService.getFactory().openSession();
		}
		//	null 이 아니면 기존 ss 반환
		return ss;
	}
	
	//	DB 처리하는 메서드들 => mapper.xml 을 호출하는 메서드
	
	//	**select : 결과(resulType) => 여러개 / 하나 구분 
	//			파라미터(parameterTpye) => 없음 / 하나 / 2개 이상	
	
	//	테이블 전체데이터 보기 : 결과 - 여러개 - List<VO> - selectList()
	//					 파라미터는 없다.
	public static List<Ex01_VO> getList(){
		//	commit 을 위해서 리스트 변수를 만들자
		List<Ex01_VO> list = null;
		//	getSession().selectList(mapper.xml 의 namespace.id 을 String 으로);
		list = getSession().selectList("customer.getSelectAll");
		return list;
	}
	
	//	테이블 특정데이터 보기 : 결과 - 하나 - VO - selectOne()
	//					 파라미터 하나 - String
	public static Ex01_VO getOne(String custid) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("customer.getSelectOne", custid);
		return vo;
	}
	
	//	테이블 데이터 개수 보기 : 결과 - 하나 - int - selectOne()
	//					  파라미터는 없다.
	public static int getCount() {
		int result = 0;
		result = getSession().selectOne("customer.getCount");
		return result;
	}
	
	//	insert, update, delete 는 결과 무조건 int
	//	insert, update, delete 는 결과 commit 해야한다
	
	//	파라미터 타입이 하나이면 VO 또는 String, int, ...
	//	**파라미터 타입이 여러개이면 무조건 VO 만들어서 넣자
	
	//	테이블 데이터 삽입 : 결과 - int
	//				  파라미터 여러개 - 인자에 VO 만들어서 넣자
	public static int getInsert(Ex01_VO vo) {
		int result = 0;
		result = getSession().insert("customer.getInsert", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	
	//	테이블 데이터 삭제 : 결과 - int
	//				  파라미터 하나 - VO 또는 String 
	public static int getDelete(Ex01_VO vo) {
		int result = 0;
		result = getSession().delete("customer.getDelete", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	
	//	테이블 데이터 수정 : 결과 - int
	//				  파라미터 여러개 - 인자에 VO 만들어서 넣자
	public static int getUpdate(Ex01_VO vo) {
		int result = 0;
		result = getSession().update("customer.getUpdate", vo);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	
	
	
	
}
