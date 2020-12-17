package org.board.demo.service;

import org.board.demo.domain.Board;
import org.board.demo.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
public class BoardServiceImpl implements BoardService {

    @Setter(onMethod_ = @Autowired)
    BoardMapper boardMapper;

    @Override
    public Board read(Integer bno) {
        return boardMapper.selectOne(bno);
    }
    
}
