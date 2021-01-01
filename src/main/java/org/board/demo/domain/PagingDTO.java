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
    private String type;
    private String keyword;

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

    public String[] getTypes() {
        if (type == null || type.trim().length() == 0) {
            return null;
        }

        return type.split("");
    }

}
