/*
 * Copyright 2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhokhov.jambalaya.test.sample;

import java.util.List;

public class Order {

    private final Long id;
    private final String orderNumber;
    private final List<OrderItem> items;

    public Order(Long id, String orderNumber, List<OrderItem> orderitems) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.items = orderitems;
    }

    public Long getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public List<OrderItem> getItems() {
        return items;
    }

}
