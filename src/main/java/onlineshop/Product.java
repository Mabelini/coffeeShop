package onlineshop;

public class Product {
    protected long id;
    protected String name;
    // category
    protected String image;
    protected double rating;
    protected int numberOfRatings;
    protected double actualPrice;
    protected String discountPrice;
    protected String imageURL;

    public Product() {}

    public Product(long id, String name, String category, String image, double rating, int numberOfRatings, double actualPrice, String discountPrice, String imageURL) {
        this.id = id;
        this.name = name;
//        this.category = category;
        this.image = image;
        this.rating = rating;
        this.numberOfRatings = numberOfRatings;
        this.actualPrice = actualPrice;
        this.discountPrice = discountPrice;
        this.imageURL = imageURL;
    }

    // Getter und Setter hinzufügen
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
