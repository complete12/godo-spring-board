package com.godo.spring.boardproject.controller.board;

import com.godo.spring.boardproject.entity.Board;
import com.godo.spring.boardproject.repository.BoardJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardJpaRepo boardJpaRepo;

    @GetMapping("")
    public String findAllUser(Model model) {
        model.addAttribute("allBoards", boardJpaRepo.findAll());
        return "board/index";
    }

    @PostMapping(value = "")
    public String save(Model model) {
        model.addAttribute("allBoards", boardJpaRepo.save(Board.builder()
                .boardName("테스트 게시판" + Math.random()).build()));
        return "board/index";

    }
}