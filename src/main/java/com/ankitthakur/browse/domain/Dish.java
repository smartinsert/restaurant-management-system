package com.ankitthakur.browse.domain;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private final String name;
    private final double price;
    private final List<Category> categories;

    public Dish(final String name, final double price) {
        this.name = name;
        this.price = price;
        this.categories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void addCategory(final Category category) {
        categories.add(category);
    }
}
