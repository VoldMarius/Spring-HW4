package ru.gb.HW4.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.HW4.model.OrderModel;
import ru.gb.HW4.services.OrderService;

import java.util.List;


@Controller
@AllArgsConstructor
public class OrderController {
    private OrderService orderService;

    @GetMapping("/orders")
    public String viewOrders(Model model) {
        List<OrderModel> orders = orderService.findAll();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @PostMapping("/orders")
    public String addOrder(OrderModel p, Model model) {
        orderService.addOrder(p);
        List<OrderModel> orders = orderService.findAll();
        model.addAttribute("orders", orders);
        return "orders";
    }
}