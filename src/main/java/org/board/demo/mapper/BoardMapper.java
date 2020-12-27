package org.board.demo.mapper;

import java.util.List;

import org.board.demo.domain.BoardVO;
import org.board.demo.domain.PagingDTO;

public interface BoardMapper {
    public BoardVO select(Integer bno);
    public List<BoardVO> selectList(PagingDTO dto);
    public int getTotal();
    public int update(BoardVO board);
    public int delete(Integer bno);
    public int insert(BoardVO board);
}
