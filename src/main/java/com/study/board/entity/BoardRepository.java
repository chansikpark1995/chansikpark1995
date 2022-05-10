package com.study.board.entity;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<Board, Long> {

	// 네이티브 쿼리
	@Query(value = "select * from board b where b.id=:id", nativeQuery = true)
	public List<Board> selectInRepo(@Param("id") Long id);
}