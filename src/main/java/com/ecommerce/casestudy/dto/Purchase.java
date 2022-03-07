package com.ecommerce.casestudy.dto;


import com.ecommerce.casestudy.entity.Address;
import com.ecommerce.casestudy.entity.Customer;
import com.ecommerce.casestudy.entity.Order;
import com.ecommerce.casestudy.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
