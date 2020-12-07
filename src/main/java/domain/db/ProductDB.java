package domain.db;

import domain.model.Product;

import java.util.ArrayList;

public class ProductDB {
    public ArrayList<Product> producten;
    public ProductDB() {
        producten = new ArrayList<>();
        Product broodjeKaas = new Product("Kaas", 2.00, "", "Broodje");
        Product broodjeMartino = new Product("Martino", 2.30, "", "Broodje");
        Product broodjeVeggylicious = new Product("Veggylicious", 2.50, "Vegetarisch", "Broodje");
        Product broodjeSpelt = new Product("Spelt", 3.00, "Vegetarisch & glutenvrij", "Broodje");

        Product lasagna = new Product("Lasagna", 4.5, "", "Pasta");
        Product spaghetti = new Product("Spaghetti Bolognese", 5.20, "", "Pasta");
        Product vegetarischePasta = new Product("Vegetarische pasta", 6.00, "Vegetarisch", "Pasta");
        Product speltPasta = new Product("Speltpasta", 6.00, "Glutenvrij", "Pasta");

        Product tomatensoep = new Product("Tomatensoep", 1.50, "Vegetarisch", "Soep");
        Product courgettesoep = new Product("Courgettesoep", 1.50, "Vegetarisch", "Soep");
        Product pompoensoep = new Product("Pompoensoep", 1.50, "Vegetarisch", "Soep");


        producten.add(broodjeKaas);
        producten.add(broodjeMartino);
        producten.add(broodjeVeggylicious);
        producten.add(broodjeSpelt);

        producten.add(lasagna);
        producten.add(spaghetti);
        producten.add(vegetarischePasta);
        producten.add(speltPasta);

        producten.add(tomatensoep);
        producten.add(courgettesoep);
        producten.add(pompoensoep);
    }

    public ArrayList<Product> getAll() {
        return producten;
    }
}
