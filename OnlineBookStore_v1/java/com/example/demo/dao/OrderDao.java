package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.OrderRepository;

@Service
public class OrderDao {
	
	@Autowired
	OrderRepository orderRepo;
}
