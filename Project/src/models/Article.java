package models;

public class Article {

    private String _article;
    private String _articleCategory;
    private double _price;

    public String getArticle() {
        return _article;
    }

    public void setArticle(String article) {
        this._article = article;
    }

    public String getArticleCategory() {
        return _articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this._articleCategory = articleCategory;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        if(price > 0) { // we need to check if it's not a minus value or 0 (makes no sense)
            this._price = price;
        }
    }
    public Article(){this("", "", 0.0);}
    public Article(String article, String articleCategory, double price){
        this.setArticle(article);
        this.setArticleCategory(articleCategory);
        this.setPrice(price); // we need to use setter because if we use this._xy we would directly insert values, even
                              // though it makes no sense to insert those values (-x and 0)
    }

    @Override
    public String toString() {
        return "Article{" +
                "article='" + this.getArticle() + '\'' +
                ", articleCategory='" + this.getArticleCategory() + '\'' +
                ", price=" + this.getPrice() +
                '}';
    }
}