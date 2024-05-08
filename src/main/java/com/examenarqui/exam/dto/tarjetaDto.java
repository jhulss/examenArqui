package com.examenarqui.exam.dto;

public class tarjetaDto {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private int cvv;
 
    public tarjetaDto(String cardNumber, String cardHolderName, String expirationDate, int cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
}

public String getCardNumber() {
    return cardNumber;
}

public String getCardHolderName() {
    return cardHolderName;
}

public String getExpirationDate() {
    return expirationDate;
}

public int getCvv() {
    return cvv;
}

public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
}

public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
}

public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
}

public void setCvv(int cvv) {
    this.cvv = cvv;
}
}