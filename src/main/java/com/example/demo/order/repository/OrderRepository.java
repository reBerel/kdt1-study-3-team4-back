package com.example.demo.order.repository;

import com.example.demo.Account.entity.Account;
import com.example.demo.order.entity.Order;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByAccount(Account account, Sort sort);
}
