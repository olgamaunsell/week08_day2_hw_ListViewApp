package example.codeclan.com.stuffforsale;

/**
 * Created by admin on 23/01/2018.
 */

public class ItemForSale {

    private int ranking;
    private String name;
    private Double price;
    private String location;

    public ItemForSale(Integer ranking, String name, Double price, String location) {
        this.ranking = ranking;
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public Integer getRanking() {
        return this.ranking;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getLocation() {
        return this.location;
    }


    @Override

    public String toString(){
        return this.getName();
    }
}

