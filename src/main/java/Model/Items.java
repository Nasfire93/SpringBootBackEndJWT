package Model;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public class Items {

        private BigInteger itemsId;
        private String description;
        private Float price;
        private String state;
        private List<Supliers> suppliers;
        private List<PriceProductsReduction> priceReductions;
        private LocalDate creationDate;
        private String creator;

        public BigInteger getItemsId() {
                return itemsId;
        }

        public void setItemsId(BigInteger itemsId) {
                this.itemsId = itemsId;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Float getPrice() {
                return price;
        }

        public void setPrice(Float price) {
                this.price = price;
        }

        public String getState() {
                return state;
        }

        public void setState(String state) {
                this.state = state;
        }

        public List<Supliers> getSuppliers() {
                return suppliers;
        }

        public void setSuppliers(List<Supliers> suppliers) {
                this.suppliers = suppliers;
        }

        public List<PriceProductsReduction> getPriceReductions() {
                return priceReductions;
        }

        public void setPriceReductions(List<PriceProductsReduction> priceReductions) {
                this.priceReductions = priceReductions;
        }

        public LocalDate getCreationDate() {
                return creationDate;
        }

        public void setCreationDate(LocalDate creationDate) {
                this.creationDate = creationDate;
        }

        public String getCreator() {
                return creator;
        }

        public void setCreator(String creator) {
                this.creator = creator;
        }
}


