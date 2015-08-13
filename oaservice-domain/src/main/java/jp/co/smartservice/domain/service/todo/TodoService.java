package jp.co.smartservice.domain.service.todo;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.smartservice.domain.model.T900Todo;
import jp.co.smartservice.domain.model.T900TodoExample;

public interface TodoService {

	T900Todo findOne(String todoId);

	Collection<T900Todo> findAll();

	T900Todo create(T900Todo todo);

	T900Todo finish(String todoId);

	void delete(String todoId);

	Page<T900Todo> findPage(T900TodoExample example, Pageable pageable);
}
