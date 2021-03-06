package com.scu.book.shop.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.scu.book.shop.entity.Test;

/**
 * test sev inf
 * 
 * @author lynch
 */
public interface TestService {

	/**
	 * 列表 
	 */
	Page<Test> list(Pageable pageable);

	/**
	 * 保存 
	 */
	void save(Test test);

}
