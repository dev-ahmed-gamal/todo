package com.app.todo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.app.todo.model.Todo;

@Repository
public interface TodoRepository extends PagingAndSortingRepository<Todo, Long> {

}
