package com.metalbird.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metalbird.dao.model.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
	Board findOneById(Long id);
}
