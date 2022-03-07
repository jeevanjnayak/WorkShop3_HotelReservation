public class HotelMain {
    public static void main(String[] args){

        System.out.println("Welcome to hotel reservation");

        HotelReservation hotel1 = new HotelReservation("LakeWood");
        hotel1.setRegularWeekDay(110);
        hotel1.setRegularWeekEnd(90);


        HotelReservation hotel2 = new HotelReservation("BridgeWood");
        hotel2.setRegularWeekDay(160);
        hotel2.setRegularWeekEnd(60);


        HotelReservation hotel3 = new HotelReservation("RidgeWood");
        hotel3.setRegularWeekDay(220);
        hotel3.setRegularWeekEnd(150);

    }
}
