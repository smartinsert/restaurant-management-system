package com.ankitthakur.browse.services;

import com.ankitthakur.browse.domain.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private final List<Restaurant> restaurants;

    public RestaurantService() {
        this.restaurants = new ArrayList<>();
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void addRestaurant(final Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public List<Restaurant> searchRestaurantsByName(final String query) {
        final var result = new ArrayList<Restaurant>();
        for (final var restaurant : restaurants) {
            if (restaurant.getName().toLowerCase().contains(query.toLowerCase())) {
                result.add(restaurant);
            }
        }
        return result;
    }

    public List<Restaurant> searchRestaurantsByCategory(final String query) {
        final var result = new ArrayList<Restaurant>();
        for (final var restaurant : restaurants) {
            for (final var category : restaurant.getCategories()) {
                if (category.getName().equalsIgnoreCase(query)) {
                    result.add(restaurant);
                }
            }
        }
        return result;
    }

    public List<Restaurant> searchRestaurantsByDish(final String query) {
        final var result = new ArrayList<Restaurant>();
        for (final var restaurant : restaurants) {
            for (final var dish : restaurant.getMenu()) {
                if (dish.getName().toLowerCase().contains(query.toLowerCase())) {
                    result.add(restaurant);
                }
            }
        }
        return result;
    }
}
