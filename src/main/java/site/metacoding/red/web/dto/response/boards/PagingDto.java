package site.metacoding.red.web.dto.response.boards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagingDto {
	
	private Integer currentBlock; //변수
	private Integer blockCount; // 한페이지에 게시물 넘버 개수(5) -- 1-5, 6-10 
	private Integer startPageNum;  //변수1 -> 6 -> 11
	private Integer lastPageNum;  //변수 5 -> 10 -> 15	
	
	
	
	private Integer totalCount;
	private Integer totalPage;
	private Integer currentPage;
	private boolean isLast;
	private boolean isFirst;
}
// getter가 만들어지면 isLast() 이름으로 만들어짐
//el에서는 last,first 로 찾음