package org.board.demo.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageMaker {
	
	private int start;
	private int end;
	private boolean prev, next;
	private int total;
	
    private PagingDTO paging;
    
	public PageMaker(int total, PagingDTO paging) {
		super();
		this.total = total;
		this.paging = paging;
		
		int tempEnd = (int)(Math.ceil(paging.getPageNum()/10.0))*10; 
		this.start = tempEnd - 9;
		this.prev = this.start != 1;
		
		int realEnd = (total/paging.getAmount()) + 1; // 
		
		this.end  = tempEnd > realEnd ? realEnd : tempEnd;
		
		this.next = this.end * paging.getAmount() < total;
    }
}