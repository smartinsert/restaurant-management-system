package com.ankitthakur.browse.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private final List<Dish> menu;
    private final List<Category> categories;

    public Restaurant(final String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.categories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void addCategory(final Category category) {
        categories.add(category);
    }

    public void addDish(final Dish dish) {
        menu.add(dish);
    }
}
