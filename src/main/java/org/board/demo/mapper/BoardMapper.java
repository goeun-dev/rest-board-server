package org.board.demo.mapper;

import java.util.List;

import org.board.demo.domain.BoardVO;

public interface BoardMapper {
    public BoardVO select(Integer bno);
    public List<BoardVO> selectList();
    public int update(BoardVO board);
    public int delete(Integer bno);
    public int insert(BoardVO board);
}
