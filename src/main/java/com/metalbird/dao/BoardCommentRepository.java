/**
 * 
 */
package com.metalbird.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metalbird.dao.model.BoardComment;

/**
 * @author YoungMin
 *
 */
@Repository
public interface BoardCommentRepository extends JpaRepository<BoardComment, Long> {
	List<BoardComment> findAllByBoardId(long boardId);
}
