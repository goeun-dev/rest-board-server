package org.board.demo.controller;

import org.board.demo.domain.Board;
import org.board.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/board/*")
@RestController
@Slf4j
public class BoardController {
    
    @Setter(onMethod_ = @Autowired)
    private BoardService boardService;

    @GetMapping(value = "/{bno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Board> read(@PathVariable("bno") Integer bno) {
        log.info("read one...............................");

        return new ResponseEntity<>(boardService.read(bno), HttpStatus.OK);
    }
}
