public class HotelReservation {

    String hotelName;
    private int regularWeekDay;
    private int regularWeekEnd;
    private int loyalWeekDay;
    private int loyalWeekEnd;

    HotelReservation(String name) {
        this.hotelName = name;
    }
    public String getHotelName() {
        return hotelName;
    }

    public int getRegularWeekDay() {
        return regularWeekDay;
    }

    public void setRegularWeekDay(int regularWeekDay) {
        this.regularWeekDay = regularWeekDay;
    }

    public int getRegularWeekEnd() {
        return regularWeekEnd;
    }

    public void setRegularWeekEnd(int regularWeekEnd) {
        this.regularWeekEnd = regularWeekEnd;
    }

    public int getLoyalWeekDay() {
        return loyalWeekDay;
    }

    public void setLoyalWeekDay(int loyalWeekDay) {
        this.loyalWeekDay = loyalWeekDay;
    }

    public int getLoyalWeekEnd() {
        return loyalWeekEnd;
    }

    public void setLoyalWeekEnd(int loyalWeekEnd) {
        this.loyalWeekEnd = loyalWeekEnd;
    }

}
