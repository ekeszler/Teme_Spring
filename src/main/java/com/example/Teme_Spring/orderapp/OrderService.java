package com.example.Teme_Spring.orderapp;

import jakarta.transaction.Transactional;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order findById(Long id) throws Exception {
        return orderRepository.findById(id).orElseThrow(()->new Exception("order not found"));
    }

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public List<Order> findOrdersByLocalDateBetween(LocalDate start, LocalDate end){
        return orderRepository.findAllByOrderDateBetweenOrderByProductType(start, end);
    }

    public Order addOrder(Order order){
        return orderRepository.save(order);
    }
    @Transactional
    public Order updateOrder(Order order, Long id) throws Exception {
        Order orderToBeUpdated = orderRepository.findById(id).orElseThrow(()->new Exception("order not found"));
        orderToBeUpdated.setOrderStatus(order.getOrderStatus());
        orderToBeUpdated.setOrderDate(order.getOrderDate());
        orderToBeUpdated.setProductType(order.getProductType());
        return orderRepository.save(orderToBeUpdated);
    }

//    public Order deleteOrder(Long id){
//        return orderRepository.deleteById(id);
//    }
}
