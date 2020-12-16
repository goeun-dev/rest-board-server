package org.board.demo.controller;

import org.board.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ResponseEntity<String> read() {
        log.info("read");

        return new ResponseEntity<>("test data", HttpStatus.OK);
    }
}
