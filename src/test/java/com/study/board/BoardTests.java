package com.study.board;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.board.entity.Board;
import com.study.board.entity.BoardRepository;

@SpringBootTest
public class BoardTests {

    @Autowired
    BoardRepository boardRepository;

//    @Test
//	public void Test() {
//    	System.out.println(boardRepository.selectInRepo(Long id).toString());
//	}
//    
    
//    @Test
//    void save() {
//
//        // 1. 게시글 파라미터 생성
//        Board params = Board.builder()
//                .title("게시글 5")
//                .content("게시글 내용")
//                .writer("아이두")
//                .hits(0)
//                .deleteYn('N')
//                .build();
//
//        // 2. 게시글 저장
//        boardRepository.save(params);
//
//        // 3. 4번 게시글 정보 조회
//        Board entity = boardRepository.findById((long) 5).get();
//        assertThat(entity.getTitle()).isEqualTo("5번 게시글 제목");
//        assertThat(entity.getContent()).isEqualTo("5번 게시글 내용");
//        assertThat(entity.getWriter()).isEqualTo("아이두");
//    }
//
//    @Test
//    void findAll() {
//
//        // 1. 전체 게시글 수 조회
//        long boardsCount = boardRepository.count();
//
//        // 2. 전체 게시글 리스트 조회
//        List<Board> boards = boardRepository.findAll();
//    }
//
//    @Test
//    void delete() {
//
//        // 1. 게시글 조회
//        Board entity = boardRepository.findById((long) 4).get();
//
//        // 2. 게시글 삭제
//        boardRepository.delete(entity);
//    }

}