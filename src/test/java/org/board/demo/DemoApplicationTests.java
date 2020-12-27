package org.board.demo;

import java.util.stream.IntStream;

import org.board.demo.domain.BoardVO;
import org.board.demo.domain.PagingDTO;
import org.board.demo.mapper.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;

	@Test
	void contextLoads() {
	}

	@Test
	public void tests() {
		PagingDTO dto = new PagingDTO();
		log.info(boardMapper.selectList(dto) + "");
	}

	@Test
	public void insertDummy() {
		BoardVO vo = new BoardVO();
		IntStream.range(0, 101).forEach(i -> {
			vo.setTitle("title......." + i);
			vo.setContent("content......." + i);
			vo.setWriter("user"+ i);
			//boardMapper.insert(vo);
		});
	}

}
