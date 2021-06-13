package com.springbook.biz.Board;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository
public class BoardDAOJPA {
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void insertBoard(BoardVO vo) {
		em.persist(vo);
	}
	@Transactional
	public void updateBoard(BoardVO vo) {
		em.merge(vo);
	}
	@Transactional
	public void deleteBoard(BoardVO vo) {
		em.remove(em.find(BoardVO.class, vo.getSeq()));
	}

	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO) em.find(BoardVO.class, vo.getSeq());
	}

	@SuppressWarnings("unchecked")
	public List<BoardVO> getBoardList(BoardVO vo) {
		return em.createQuery("from BoardVO b order by b.seq desc").getResultList();
	}
}