package com.board.db;

import java.sql.*;
import java.time.*;
import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.board.SqlMapConfig;

public class BoardDao {

	SqlSessionFactory sqlsession_f = com.board.SqlMapConfig.getSqlMapInstance();
	SqlSession session;

    // 현재 시간을 문자열 형태로 반환
    private String getCurrentTime() {
        return LocalDate.now() + " " +
               LocalTime.now().toString().substring(0, 8);
    }

    // 게시글 갯수 얻기
    public int getNumRecords() {
    try(SqlSession session = sqlsession_f.openSession()){
    	return session.selectOne("com.board.db.BoardMapper.getNumRecords");
    }
    }

    // 게시글 리스트 읽기
    public ArrayList<BoardDto> selectList(int start, int listSize) {
    		try(SqlSession session = sqlsession_f.openSession()){
    			return new ArrayList<>(session.selectList("com.board.db.BoardMapper.selectList",
    					Map.of("start", start, "listSize", listSize)));
    		}
    }
    // 지정된 글 번호를 가진 레코드 읽기
    // hitsIncreased가 true이면 해당 글의 조회수를 1 증가시킴
    //                 false이면 조회수를 증가시키지 않음
    public BoardDto selectOne(int num, boolean hitsIncreased) {
    	try(SqlSession session = sqlsession_f.openSession()){
    	BoardDto dto = session.selectOne("com.board.db.BoardMapper.selectOne", num);
    			if(hitsIncreased && dto != null) {
    				session.update("com.board.db.BoardMapper.updateHits",num);
    				session.commit();
    			}
    			return dto;
    	}
    }

    // DTO에 담긴 내용으로 새로운 레코드 저장
    public void insertOne(BoardDto dto) {

    	try(SqlSession session = sqlsession_f.openSession()){
    		dto.setRegtime(LocalDate.now() + " " + LocalTime.now().toString().substring(0,8));
    		session.insert("com.board.db.BoardMapper.insertOne",dto);
    		session.commit();
    	}
    }
    

    // DTO에 담긴 내용으로 게시글 데이터 업데이트
    public void updateOne(BoardDto dto) {

        try (SqlSession session = sqlsession_f.openSession()){
        	dto.setRegtime(LocalTime.now()+ " " + LocalTime.now().toString().substring(0,8));
        	session.update("com.board.BoardMapper.updateOne", dto);
        	session.commit();
        }
           
    }

    // 지정된 글 번호의 레코드 삭제
    public void deleteOne(int num) {

        try (SqlSession sqlSession = sqlsession_f.openSession()){
        	session.delete("com.board.db.BoardMapper.deleteOne", num);
        	session.commit();
        }
    }
}