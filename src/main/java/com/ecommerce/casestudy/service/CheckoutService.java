package com.ecommerce.casestudy.service;

import com.ecommerce.casestudy.dto.Purchase;
import com.ecommerce.casestudy.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
