@SuppressWarnings("ALL")
public class FurnitureItemImpl {
    int FurnitureCode;
    int FurnitureType;
    int gradeOfItem;
    String colour;
    int FurnitureUsage;
    String Price;
    int discount=5;

    public void setFurnitureCode(int furnitureCode) {
        FurnitureCode = furnitureCode;
    }

    public void setFurnitureType(int furnitureType) {
        FurnitureType = furnitureType;
    }

    public void setGradeOfItem(int gradeOfItem) {
        this.gradeOfItem = gradeOfItem;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFurnitureUsage(int furnitureUsage) {
        FurnitureUsage = furnitureUsage;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    int price;
    int discountPercentage;



    public float calculateDiscount() {
        discount = price * discountPercentage / 100;

        return discount;
    }
}
