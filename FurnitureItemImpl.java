import com.furniture.FurnitureItem;


@SuppressWarnings("ALL")
public class FurnitureItemImpl {
    public void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        FurnitureItem.getfurnitureCode = 101;
        System.out.println("furnitureCode : " +FurnitureItem.getfurnitureCode());

        FurnitureItem.getfurnitureType="table";
        System.out.println("furnitureType = " + FurnitureItem.getfurnitureType());

        FurnitureItem.getgradeOfFurniture="grade1";
        System.out.println("furnitureType = " + FurnitureItem.getgradeOfFurniture());

        FurnitureItem.getfurnitureUsage="outdoor";
        System.out.println("furnitureType = " + FurnitureItem.getfurnitureUsage());

        FurnitureItem.getprice="$10";
        System.out.println("furnitureType = " + FurnitureItem.getprice());

    }
    private int FurnitureCode;
    private int FurnitureType;
    private int gradeOfItem;
    private String colour;
    private int FurnitureUsage;
    private  String Price;
    private int discount=5;
    private String furnitureUsage;

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

    private int price;
    private int discountPercentage;



    public float calculateDiscount() {
       float  discountPrice =  price * 0.95F;

        if(furnitureUsage=="outdoor"&& furnitureUsage=="grade1"){
            return discountPrice;
        }

        return discount;
    }

}
