package org.board.demo.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Board {

    private Integer bno;
    private String title;
    private String writer;
    private Date regDate;
    
}
