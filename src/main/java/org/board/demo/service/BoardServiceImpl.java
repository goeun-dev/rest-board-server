package org.board.demo.service;

import java.util.List;

import org.board.demo.domain.BoardVO;
import org.board.demo.domain.PagingDTO;
import org.board.demo.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
public class BoardServiceImpl implements BoardService {

    @Setter(onMethod_ = @Autowired)
    BoardMapper boardMapper;

    @Override
    public BoardVO read(Integer bno) {
        return boardMapper.select(bno);
    }

    @Override
    public int register(BoardVO board) {
        return boardMapper.insert(board);
    }

    @Override
    public int modify(BoardVO board) {
        return boardMapper.update(board);
    }

    @Override
    public int remove(Integer bno) {
        return boardMapper.delete(bno);
    }

    @Override
    public List<BoardVO> getBoardList(PagingDTO dto) {
        return boardMapper.selectList(dto);
    }

    @Override
    public int getTotal(PagingDTO dto) {
        return boardMapper.getTotal(dto);
    }
    
}
