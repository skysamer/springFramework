package com.springbook.biz.board.impl;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 insertBoard() 기능 처리");
		sqlSession.insert("BoardDAO.insertBoard", vo);
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 updateBoard() 기능 처리");
		sqlSession.update("BoardDAO.updateBoard", vo);
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리");
		sqlSession.delete("BoardDAO.deleteBoard", vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoard() 기능 처리");
		return (BoardVO)sqlSession.selectOne("BoardDAO.getBoard", vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return sqlSession.selectList("BoardDAO.getBoardList", vo);
	}

}
