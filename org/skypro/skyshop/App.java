package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static  void  main(String[] args) {

        Product bananas = new Product("бананы", 200);
        Product oranges = new Product("апельсины", 150);
        Product water = new Product("вода", 120);
        Product cookies = new Product("печенье", 150);
        Product fish = new Product("рыба", 500);
        Product beer = new Product("пиво", 300);

        ProductBasket basket = new ProductBasket();

basket.add(bananas);
basket.add(water);
basket.add(oranges);
basket.add(cookies);
basket.add(fish);

        basket.add(beer);
        basket.print();

        System.out.println("стоимость корзины: " + basket.getTotalCost());
        System.out.println("поиск товара\"" + bananas.getTitle()+"\" в корзине:" + basket.findByTitle);
        System.out.println("поиск товара \"" + beer.getTitle()+"\" в корзине:" + basket.findByTitle);
        basket.clear();
        basket.print();
        System.out.println("стоимость пустой корзины" + basket.getTotalCost());
        System.out.println("поиск товара\"" + bananas.getTitle()+ "\" в корзине: " + basket.findByTitle);
    }
}
