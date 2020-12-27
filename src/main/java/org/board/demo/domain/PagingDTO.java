package org.board.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PagingDTO {

    private int pageNum;
    private int amount;

    public PagingDTO() {
        this(1, 6);
    }

    public PagingDTO(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }

    public int getSkip() {
        return (this.pageNum - 1) * this.amount;
    }

}
