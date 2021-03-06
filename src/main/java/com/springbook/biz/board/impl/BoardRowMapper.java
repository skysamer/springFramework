package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.springbook.biz.board.BoardVO;

public class BoardRowMapper implements RowMapper<BoardVO>{
	
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException{
		BoardVO board=new BoardVO();
		board.setSeq(rs.getInt("SEQ"));
		board.setTitle(rs.getString("TITLE"));
		board.setWritter(rs.getString("WRITTER"));
		board.setContent(rs.getString("CONTENT"));
		board.setRegDate(rs.getDate("REGDATE"));
		board.setCnt(rs.getInt("CNT"));
		return board;
	}

}
