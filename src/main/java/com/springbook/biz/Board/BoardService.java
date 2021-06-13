package com.springbook.biz.Board;

import java.util.List;

public interface BoardService {
	void insertBoard(BoardVO vo);

	void updateBoard(BoardVO vo);

	void deleteBoard(BoardVO vo);

	BoardVO getBoard(BoardVO vo);

	List<BoardVO> getBoardList(BoardVO vo);
}
