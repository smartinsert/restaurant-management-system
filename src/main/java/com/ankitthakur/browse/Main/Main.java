package com.ankitthakur.browse.Main;


import com.ankitthakur.browse.domain.Category;
import com.ankitthakur.browse.domain.Dish;
import com.ankitthakur.browse.domain.Restaurant;
import com.ankitthakur.browse.services.RestaurantService;

public class Main {

    private static RestaurantService restaurantService;

    public static void main(String[] args) {

        final Category indian = new Category("Indian");
        final Category chinese = new Category("Chinese");
        final Category spicy = new Category("Spicy");

        // Create dishes
        final var biryani = new Dish("Biryani", 200.0);
        biryani.addCategory(spicy);
        biryani.addCategory(indian);

        final var noodles = new Dish("Noodles", 100.0);
        noodles.addCategory(chinese);

        // Create Restaurants
        final var restaurant1 = new Restaurant("Spicy Treats");
        restaurant1.addCategory(indian);
        restaurant1.addDish(biryani);

        final var restaurant2 = new Restaurant("Chinese Delights");
        restaurant2.addCategory(chinese);
        restaurant2.addDish(noodles);

        final var restaurantService = new RestaurantService();
        restaurantService.addRestaurant(restaurant1);
        restaurantService.addRestaurant(restaurant2);

        // Search restaurants by Name
        System.out.println("Search restaurants by Name");
        for (final var restaurant : restaurantService.searchRestaurantsByName("Spicy")) {
            System.out.println(restaurant.getName());
        }

        // Search restaurants by Category
        System.out.println("\nSearch restaurants by Category: Chinese");
        for (final var restaurant : restaurantService.searchRestaurantsByCategory("Chinese")) {
            System.out.println(restaurant.getName());
        }

        // Search restaurants by Dish
        System.out.println("\nSearch restaurants by Dish: Noodles");
        for (final var restaurant : restaurantService.searchRestaurantsByDish("Noodles")) {
            System.out.println(restaurant.getName());
        }
    }
}