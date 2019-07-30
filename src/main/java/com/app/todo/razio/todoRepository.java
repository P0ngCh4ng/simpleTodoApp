package com.app.todo.razio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.todo.razio.todoEntity;

@Repository
public interface todoRepository extends JpaRepository<todoEntity, Long> {
	 @Query("select t from todoEntity t where t.todoName like %:keyword% order by t.id asc")
	  List<todoEntity> findTodos(@Param("keyword") String keyword);

}
