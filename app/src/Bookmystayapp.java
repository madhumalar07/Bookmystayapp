public class Bookmystayapp {

    public static void main(String[] args) {

        abstract class Room {
            protected String roomType;
            protected int beds;
            protected double price;

            public Room(String roomType, int beds, double price) {
                this.roomType = roomType;
                this.beds = beds;
                this.price = price;
            }

            public void displayRoomDetails() {
                System.out.println("Room Type: " + roomType);
                System.out.println("Beds: " + beds);
                System.out.println("Price per night: ₹" + price);
            }
        }
        class SingleRoom extends Room {

            public SingleRoom() {
                super("Single Room", 1, 2000);
            }
        }

        class DoubleRoom extends Room {

            public DoubleRoom() {
                super("Double Room", 2, 3500);
            }
        }

        class SuiteRoom extends Room {

            public SuiteRoom() {
                super("Suite Room", 3, 6000);
            }
        }
                System.out.println("===== Book My Stay App =====");
                System.out.println("Room Availability\n");

                // Creating room objects
                Room single = new SingleRoom();
                Room doubleRoom = new DoubleRoom();
                Room suite = new SuiteRoom();

                int singleAvailable = 5;
                int doubleAvailable = 3;
                int suiteAvailable = 2;

                single.displayRoomDetails();
                System.out.println("Available Rooms: " + singleAvailable);
                System.out.println("-----------------------------");

                doubleRoom.displayRoomDetails();
                System.out.println("Available Rooms: " + doubleAvailable);
                System.out.println("-----------------------------");

                suite.displayRoomDetails();
                System.out.println("Available Rooms: " + suiteAvailable);
                System.out.println("-----------------------------");

                System.out.println("Application Terminated.");
            }
        }