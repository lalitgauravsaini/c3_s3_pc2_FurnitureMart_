package com.furniture;


@SuppressWarnings("ALL")
public class FurnitureItem {
    public static int setfurnitureCode;
    public static int setfurnitureType;
    public static int getfurnitureCode;
    public static String getfurnitureType;
    public static String getgradeOfFurniture;
    public static String getfurnitureUsage;
    public static String getprice;
    private int furnitureCode;
    private int furnituretype;
    private int gradeOfFurniture;
    private String colour;

    public static String getfurnitureCode() {
    return null;
    }
    public static String getfurnitureType() {
        return null;
    }

    public static String getgradeOfFurniture() {
        return null;
    }

    public static String getfurnitureUsage() {
        return null;
    }

    public static String getprice() {
        return null;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public int getFurnituretype() {
        return furnituretype;
    }

    public int getGradeOfItem() {
        return gradeOfFurniture;
    }

    public String getColour() {
        return colour;
    }

    public int getFurnitureUsage() {
        return FurnitureUsage;
    }

    public String getPrice() {
        return Price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public float getDiscount() {
        return discount;
    }

    private int FurnitureUsage;
    private String Price;
    private int price;
    private int discountPercentage;
    private float discount=5;
    public void FurnitureItemClass(){

    }
    public float calculateDiscount() {
      float discountPrice= (price*0.95F);
        String furnitureUsage = null;
        if(furnitureUsage=="outdoor"){
            System.out.println("furnitureUsage = " + furnitureUsage);
        } else if(furnitureUsage=="grade1") {
            System.out.println("furnitureUsage = " + furnitureUsage);
        }else{
            return discountPrice;
      }
        return discount;
    }
}
