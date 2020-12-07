package domain.model;

public class Product {
    private String naam;
    private double prijs;
    private String extraInfo;
    private String categorie;

    public Product (String naam, double prijs, String extraInfo, String categorie) {
        setNaam(naam);
        setPrijs(prijs);
        setExtraInfo(extraInfo);
        setCategorie(categorie);
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public String isVegetarisch() {
        return extraInfo;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
    }
}

