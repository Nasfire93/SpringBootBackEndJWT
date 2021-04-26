package Enums;

import java.time.LocalDate;

public class PriceProductsReduction {

    private float reducedPrice;
    private LocalDate startDate;
    private LocalDate endDate;

    public float getPrice() {
        return reducedPrice;
    }

    public void setPrice(float price) {
        this.reducedPrice = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
