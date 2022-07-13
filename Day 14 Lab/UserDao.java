package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.cdac.entity.User;

@Component
public class UserDao {

	@PersistenceContext //(unitName = "my-pu1")
	private EntityManager entityManager;
	
	@Transactional
	public void add(User user) {
		entityManager.persist(user);
	}
	
}
