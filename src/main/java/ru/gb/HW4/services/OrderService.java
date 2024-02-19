package ru.gb.HW4.services;

import org.springframework.stereotype.Service;
import ru.gb.HW4.model.OrderModel;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderService {
    private List<OrderModel> orders = new ArrayList<>();

    public void addOrder(OrderModel p){orders.add(p);}

    public List<OrderModel> findAll(){return  orders;}
}
