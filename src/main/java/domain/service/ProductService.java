package domain.service;

import domain.db.ProductDB;
import domain.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private ProductDB db = new ProductDB();

    public List<Product> getAll() {
        return db.getAll();
    }

    public List<Product> getAllBroodjes() {
        List<Product> producten = db.getAll();
        List<Product> broodjes = new ArrayList<>();
        for (Product product : producten) {
            if (product.getCategorie().equals("Broodje")) {
                broodjes.add(product);
            }
        }
        return broodjes;
    }

    public List<Product> getAllPasta() {
        List<Product> producten = db.getAll();
        List<Product> pastas = new ArrayList<>();
        for (Product product : producten) {
            if (product.getCategorie().equals("Pasta")) {
                pastas.add(product);
            }
        }
        return pastas;
    }

    public List<Product> getAllSoepen() {
        List<Product> producten = db.getAll();
        List<Product> soepen = new ArrayList<>();
        for (Product product : producten) {
            if (product.getCategorie().equals("Soep")) {
                soepen.add(product);
            }
        }
        return soepen;
    }
}
