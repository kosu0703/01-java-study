package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Ex02_DAO {
	
	//	MyBatis 에서 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	//	싱글턴 패턴(동기화 처리리까지)
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = Ex02_DBService.getFactory().openSession();
		}
		return ss;
	}
	
	//	전체 데이터 보기
	//	select : 결과 - 여러개 - List<VO> - selectList()
	//			파라미터 - 없음
	public static List<Ex02_VO> getList() {
		List<Ex02_VO> list = null;
		list = getSession().selectList("Members.getSelectAll");
		return list;
	}
	
	//	특정 데이터 보기
	//	select : 결과 - 하나 - VO - selectOne()
	//			파라미터 - 하나 - String
	public static Ex02_VO getOne(String idx) {
		Ex02_VO vo = null;
		vo = getSession().selectOne("Members.getSelectOne", idx);
		return vo;
	}
	
	//	데이터 삽입 
	//	insert : 결과 - int
	//			파라미터 - 여러개 - VO
	//			 commit 따로 
	public static int getIns(Ex02_VO vo) {
		int res = 0;
		res = getSession().insert("Members.getInsert", vo);
		if (res > 0) {
			ss.commit();
		}
		return res;
	}
	
	//	데이터 삭제
	//	delete : 결과 - int
	//			파라미터 - 하나 - VO
	//			 commit 따로
	public static int getDel(Ex02_VO vo) {
		int res = 0;
		res =getSession().delete("Members.getDelete", vo);
		if (res > 0) {
			ss.commit();
		}
		return res;
	}
	
	//	데이터 변경
	//	update : 결과 - int
	//			파라미터 - 여러개 - VO
	//			commit 따로
	public static int getUp(Ex02_VO vo) {
		int res = 0;
		res = getSession().update("Members.getUpdate", vo);
		if (res > 0) {
			ss.commit();
		}
		return res;
	}
	
	
}
