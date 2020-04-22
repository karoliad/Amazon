package com.company;

public class ChildrensBook extends Book {
    private String recommendedAgeInfo;

    public ChildrensBook( String title, String author, int price,String recommendedAgeInfo, Long productId) {
        super(title, author, price, productId); // Arver fra book som arver fra Product
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }
    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Recommended Age Info: " + this.recommendedAgeInfo);
    }


}



