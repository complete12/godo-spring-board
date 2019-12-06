package com.godo.spring.boardproject.repository;

import com.godo.spring.boardproject.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJpaRepo extends JpaRepository<Board, Integer> {

}