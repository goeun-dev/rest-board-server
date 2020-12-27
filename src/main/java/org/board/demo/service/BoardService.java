package org.board.demo.service;

import java.util.List;

import org.board.demo.domain.BoardVO;
import org.board.demo.domain.PagingDTO;

public interface BoardService {
    public int register(BoardVO board);      // Create
    public BoardVO read(Integer bno);     // Read
    public int modify(BoardVO board);     // Update
    public int remove(Integer bno);     // Delete
    public List<BoardVO> getBoardList(PagingDTO dto);  // List
    public int getTotal();
}
