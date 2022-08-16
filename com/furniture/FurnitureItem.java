package com.furniture;

@SuppressWarnings("unused")
public class FurnitureItem {
    int FurnitureCode;
    int FurnitureType;
    int gradeOfItem;
    String  colour;

    public int getFurnitureCode() {
        return FurnitureCode;
    }

    public int getFurnitureType() {
        return FurnitureType;
    }

    public int getGradeOfItem() {
        return gradeOfItem;
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

    public int getDiscount() {
        return discount;
    }

    int FurnitureUsage;
    String Price;
    int price;
    int discountPercentage;
    int discount=5;
    public void FurnitureItemClass(){

    }
    public float calculateDiscount() {
      discount=price*discountPercentage/100;

        return discount;
    }
}
