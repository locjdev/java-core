package models;

public class CategoryQuestion {
    int categoryID;
    String categoryName;

    public CategoryQuestion(int categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "models.CategoryQuestion{" +
                "categoryID=" + categoryID +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
