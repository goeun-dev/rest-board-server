package org.board.demo.controller;

import java.util.List;

import org.board.demo.domain.BoardVO;
import org.board.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/board/*")
@RestController
@Slf4j
@CrossOrigin("*")
public class BoardController {
    
    @Setter(onMethod_ = @Autowired)
    private BoardService boardService;

    @GetMapping(value = "/{bno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BoardVO> read(@PathVariable("bno") Integer bno) {
        log.info("read one...............................");

        return new ResponseEntity<>(boardService.read(bno), HttpStatus.OK);
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BoardVO>> getBoardList() {
        log.info("get board list...............................");

        return new ResponseEntity<>(boardService.getBoardList(), HttpStatus.OK);
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> register(BoardVO board) {
        log.info("register...............................");

        return new ResponseEntity<>(boardService.register(board), HttpStatus.OK);
    }

    @PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> modify(BoardVO board) {
        log.info("modify...............................");

        return new ResponseEntity<>(boardService.modify(board), HttpStatus.OK);
    }


    @DeleteMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> remove(BoardVO board) {
        log.info("remove...............................");

        return new ResponseEntity<>(boardService.remove(board.getBno()), HttpStatus.OK);
    }
}
