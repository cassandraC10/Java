package ChapterThree;

public class Car {
    private String modelType;
    private String year;
    private double price;

    public Car (String model, String yr, double amount){
        modelType = model;
        year = yr;
        price = amount;

        if (amount < 0.0)
            price = 0.0;
    }
    public void setModelType (String model) {
        modelType = model;
    }

    public String getModelType(){
        return modelType;
    }

    public void setYearType (String yr){
        year = yr;
    }
    public String getYearType(){
        return year;
    }
    public void setPrice (double amount){
        price = amount;
    }
    public double getPrice(){
        return price;
    }
}
