package com.study.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.board.dto.BoardRequestDto;
import com.study.board.dto.BoardResponseDto;
import com.study.board.entity.Board;
import com.study.board.entity.BoardRepository;
import com.study.board.model.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;
    private final BoardRepository boardRepository;
    
    /**
     * 게시글 생성
     */
    @PostMapping("/boards")
    public Long save(@RequestBody final BoardRequestDto params) {
        return boardService.save(params);
    }

    /**
     * 게시글 리스트 조회
     */
    @GetMapping("/boards")
    public List<BoardResponseDto> findAll() {
        return boardService.findAll();
    }
    
    //repo에 있는 네이티브 쿼리 동작
    @GetMapping("/selectInRepo")
    public List<Board> selectInRepo(@RequestParam("id") final Long id) {
    	System.out.println("id 받았나"+id);
        return boardRepository.selectInRepo(id);
    }
    

    //id로 셀렉트 후 해당 멤버를 수정함.
    @PatchMapping("/findAndUpdate/{id}")
    public Board findAndUpdate(@PathVariable final Long id, @RequestBody final BoardRequestDto params) {
    	System.out.println("params.getContent() = " + params.getContent());
    	System.out.println("params.getTitle() = " + params.getTitle());
    	System.out.println("params.getWriter() = " + params.getWriter());
        return boardService.findAndUpdate(id,params);
    }
    
    /**
     * 게시글 수정
     */
    @PatchMapping("/boards/{id}")
    public Long update(@PathVariable final Long id, @RequestBody final BoardRequestDto params) {
        return boardService.update(id, params);
    }

}