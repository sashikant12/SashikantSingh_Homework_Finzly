package Question4.me;

public class Room {
    private int roomNumber;
    private int capacity;
    private int pricePerNight;

    public Room(int roomNumber, int capacity, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
    }

    public void checkAvailability(int room){
        if(room<=this.capacity){
            System.out.println("Rooms the available");
            this.capacity-=room;
            System.out.println(this.capacity);
        }
        else {
            System.out.println("not available");
        }

    }


    @Override
    public String toString() {
        return "Room number " + this.roomNumber + " capacity " + this.capacity + " ,price per Night " + this.pricePerNight;
    }
    public void reservation(boolean reservation){
        if(reservation){
            System.out.println("Your reservation is done");
        }
        else {
            System.out.println("its not done");
        }
    }
    public void reservation(boolean reservatin ,String checkIn,String checkOut){
        if(reservatin && checkIn!=null & checkOut!=null){
            System.out.println("Your reservation is done with Check in date" + checkIn +" and check out date is "+ checkOut);
        }
        else if(reservatin && (checkIn==null || checkOut==null)){
            System.out.println("Your reservation is done with no check in and out  dates");
        }
        else{
            System.out.println("No reservation");
        }
    }

    public static void main(String[] args) {
        Room r = new Room(12,100,1000);
        r.checkAvailability(30);
//        r.checkAvailability(70);
        r.reservation(false);
        r.reservation(false,null,null);
    }
}
