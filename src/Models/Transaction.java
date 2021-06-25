package Models;

public class Transaction {
    private HouseType houseType;
    private Type type;
    private String date,time;
    private  int finalPrice;
    private int sellerCode,buyerCode,sellerFatherCode,buyerFatherCode;

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

    public int getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(int sellerCode) {
        this.sellerCode = sellerCode;
    }

    public int getBuyerCode() {
        return buyerCode;
    }

    public void setBuyerCode(int buyerCode) {
        this.buyerCode = buyerCode;
    }

    public int getSellerFatherCode() {
        return sellerFatherCode;
    }

    public void setSellerFatherCode(int sellerFatherCode) {
        this.sellerFatherCode = sellerFatherCode;
    }

    public int getBuyerFatherCode() {
        return buyerFatherCode;
    }

    public void setBuyerFatherCode(int buyerFatherCode) {
        this.buyerFatherCode = buyerFatherCode;
    }
}
