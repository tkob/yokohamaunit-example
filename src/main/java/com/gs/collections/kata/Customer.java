/*
 * Copyright 2015 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.kata;

import java.util.ArrayList;
import java.util.List;

import com.gs.collections.api.block.function.Function;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.block.function.AddFunction;
import com.gs.collections.impl.utility.ListIterate;

/**
 * Customers have a name, city and a list of {@link Order}s
 */
public class Customer
{
    public static final Function<Customer, String> TO_NAME = customer -> {
        assert false : "Replace with the implementation of the Function.";
        return null;
    };

    public static final Function<Customer, String> TO_CITY = null;

    public static final Function<Customer, Double> TO_TOTAL_ORDER_VALUE = Customer::getTotalOrderValue;

    private final String name;
    private final String city;

    private final List<Order> orders = new ArrayList<>();

    public Customer(String name, String city)
    {
        this.name = name;
        this.city = city;
    }

    public String getCity()
    {
        return this.city;
    }

    public String getName()
    {
        return this.name;
    }

    public List<Order> getOrders()
    {
        return this.orders;
    }

    public void addOrder(Order anOrder)
    {
        this.orders.add(anOrder);
    }

    public double getTotalOrderValue()
    {
        MutableList<Double> orderValues = ListIterate.collect(this.orders, Order::getValue);
        return orderValues.injectInto(0.0, AddFunction.DOUBLE_TO_DOUBLE);
    }
}
