import java.util.Scanner;

public class Nokia {

        public static void main(String[] args) {
            String prompt = """
                    press 1 for phonebook
                    press 2 for messages
                    press 3 for chat
                    press 4 for call register
                    press 5 for Tones
                    press 6 for settings
                    press 7 for call divert
                    press 8 for games
                    press 9 for calculator
                    press 10 for reminders
                    press 11 for clock
                    press 12 for profiles
                    press 13 for sim services
                    """;
            System.out.println(prompt);
            Scanner input = new Scanner(System.in);
            int userChoice = input.nextInt();

            switch (userChoice) {

                case 1:
                    System.out.println("phonebook");
                    String game = """
                            press 1 for search
                            press 2 for service nos
                            press 3 for add name
                            press 4 for erase
                            press 5 for edit
                            press 6 for assign tone
                            press 7 for send b card
                            press 8 for Options
                            """;
                    System.out.println(game);
                    int fix = input.nextInt();
                    switch (fix) {
                        case 1 -> System.out.println("search");
                        case 2 -> System.out.println("service nos");
                        case 3 -> System.out.println("Add Name");
                        case 4 -> System.out.println("erase");
                        case 5 -> System.out.println("edit");
                        case 6 -> System.out.println("assign tone");
                        case 7 -> System.out.println("send b card");
                        case 8 -> {
                            System.out.println("Options");
                            String game2 = """
                                    press 1 for type of view
                                    press 2 for memory status
                                    """;
                            System.out.println(game2);
                            int home = input.nextInt();
                            switch (home) {
                                case 1 -> System.out.println("type of view");
                                case 2 -> System.out.println("memory status");
                            }
                        }
                    }
                case 2:
                    System.out.println("messages");
                    String house = """
                            press 1 for write message
                            press 2 for inbox
                            press 3 for outbox
                            press 4 for picture messages
                            press 5 for templates
                            press 6 for smileys
                            press 7 for message settings
                            press 8 for info service
                            press 9 for voice mailbox number
                            press 10 for service command editor
                            """;

                    System.out.println(house);
                    int game4 = input.nextInt();
                    switch (game4) {
                        case 1 -> System.out.println("write message");
                        case 2 -> System.out.println("inbox");
                        case 3 -> System.out.println("outbox");
                        case 4 -> System.out.println("picture messages");
                        case 5 -> System.out.println("templates");
                        case 6 -> System.out.println("smileys");
                        case 7 -> {
                            System.out.println("message settings");

                            String volume = """
                                    press 1 for set 1
                                    press 2 for common
                                    """;
                            System.out.println(volume);
                            int jesus = input.nextInt();
                            switch (jesus) {
                                case 1:
                                    System.out.println("set 1");
                                    String president = """
                                            press 1 for message center number
                                            press 2 for message as sent
                                            press 3 for message validity
                                            """;
                                    System.out.println(president);
                                    int mouse = input.nextInt();
                                    switch (mouse) {
                                        case 1 -> System.out.println("message center number");
                                        case 2 -> System.out.println("message as sent");
                                        case 3 -> System.out.println("message validity");
                                    }
                                case 2:
                                    System.out.println("common");
                                    String governor = """
                                            press 1 for reports
                                            press 2 for reply via same centre
                                            press 3 for character support
                                            """;
                                    System.out.println(governor);
                                    int egg = input.nextInt();
                                    switch (egg) {

                                        case 1 -> System.out.println("delivery reports");
                                        case 2 -> System.out.println("reply via same centre");
                                        case 3 -> System.out.println("character support");
                                    }
                            }
                        }
                        case 8 -> System.out.println("info service");
                        case 9 -> System.out.println("voice mailbox number");
                        case 10 -> System.out.println("service editor");
                    }
                case 3:
                    System.out.println("chat");
                    break;
                case 4:
                    System.out.println("call register");
                    String remote = """
                            press 1 for missed calls
                            press 2 for received calls
                            press 3 for dialled numbers
                            press 4 for erase recent call lists
                            press 5 for show call duration
                            press 6 for show call costs
                            press 7 for call cost settings
                            press 8 for prepaid credit
                            """;
                    System.out.println(remote);
                    int maryjane = input.nextInt();
                    switch (maryjane) {
                        case 1 -> System.out.println("missed calls");
                        case 2 -> System.out.println("received calls");
                        case 3 -> System.out.println("dialled numbers");
                        case 4 -> System.out.println("erase recent call lists");
                        case 5 -> {
                            System.out.println("call duration");

                            String hanger = """
                                    press 1 for last calls duration
                                    press 2 for all calls duration
                                    press 3 for received calls duration
                                    press 4 for dialled calls duration
                                    press 5 for clear timer
                                    """;
                            System.out.println(hanger);
                            int chief = input.nextInt();
                            switch (chief) {
                                case 1 -> System.out.println("last calls duration");
                                case 2 -> System.out.println("all calls duration");
                                case 3 -> System.out.println("received calls duration");
                                case 4 -> System.out.println("dialled calls duration");
                                case 5 -> System.out.println("clear timer");

                            }
                        }
                        case 6 -> {
                            System.out.println("call cost");
                            String pat = """
                                    press 1 for  last call cost
                                    press 2 for all calls cost
                                    press 3 for clear counter
                                    """;
                            System.out.println(pat);
                            int dad = input.nextInt();
                            switch (dad) {
                                case 1 -> System.out.println("last call cost");
                                case 2 -> System.out.println("all calls cost");
                                case 3 -> System.out.println("clear counter");

                            }

                        }
                        case 7 -> {
                            System.out.println("call cost settings");
                            String mum = """
                                    press 1 for call cost limit
                                    press 2 for show cost in
                                    """;
                            System.out.println(mum);
                            int girl = input.nextInt();
                            switch (girl) {
                                case 1 -> System.out.println("call cost limit");
                                case 2 -> System.out.println("show cost in");


                            }
                        }
                        case 8 -> System.out.println("prepaid credit");

                    }
                case 5:
                    System.out.println("tones");
                    String hormone = """
                            press 1 for ringing tone
                            press 2 for ringing volume
                            press 3 for incoming call alert
                            press 4 for composer
                            press 5 for message alert tones
                            press 6 for keypad tones
                            press 7 for warning and game tones
                            press 8 for vibrating alert
                            press 9 for screen saver
                            """;
                    System.out.println(hormone);
                    int name = input.nextInt();
                    switch (name) {
                        case 1 -> System.out.println(" ringing tone");
                        case 2 -> System.out.println("ringing volume");
                        case 3 -> System.out.println("incoming call alert");
                        case 4 -> System.out.println("composer");
                        case 5 -> System.out.println("message alert");
                        case 6 -> System.out.println("keypad tones");
                        case 7 -> System.out.println("warning and game tones");
                        case 8 -> System.out.println("vibrating alert");
                        case 9 -> System.out.println("screen saver");
                    }
                    break;
                case 6:
                    System.out.println("settings");
                    String set = """
                            press 1 for call settings
                            press 2 for phone settings
                            press 3 for security settings
                            press 4 for factory reset settings
                            """;
                    System.out.println(set);
                    int jubilee = input.nextInt();
                    switch (jubilee) {
                        case 1 -> {
                            System.out.println("call settings");
                            String boy = """
                                    press 1 for automatic redial
                                    press 2 for speed dialling
                                    press 3 for call waiting options
                                    press 4 for own number setting
                                    press 5 for phone line in use
                                    press 6 for automatic answer
                                    """;
                            System.out.println(boy);
                            int food = input.nextInt();
                            switch (food) {
                                case 1 -> System.out.println("automatic redial");
                                case 2 -> System.out.println("speed dialling");
                                case 3 -> System.out.println("call waiting options");
                                case 4 -> System.out.println("own number setting");
                                case 5 -> System.out.println("phone line in use");
                                case 6 -> System.out.println("automatic answer");

                            }

                        }
                        case 2 -> {
                            System.out.println("phone settings");
                            String car = """
                                                                            
                                    press 1 for language
                                    press 2 for cell info display
                                    press 3 for welcome note
                                    press 4 for network selection
                                    press 5 for lights
                                    press 6 for confirm sim service options
                                    """;
                            System.out.println(car);
                            int bread = input.nextInt();
                            switch (bread) {
                                case 1 -> System.out.println("language");
                                case 2 -> System.out.println("cell info display");
                                case 3 -> System.out.println("welcome note");
                                case 4 -> System.out.println("network selection");
                                case 5 -> System.out.println("lights");
                                case 6 -> System.out.println("confirm sim service options");

                            }
                        }
                        case 3 -> {
                            System.out.println("security settings");
                            String bag = """
                                    press 1 for pin code request
                                    press 2 for call barring request
                                    press 3 for fixed dialling
                                    press 4 for closed user group
                                    press 5 for phone security
                                    press 6 for change access code
                                    """;
                            System.out.println(bag);
                            int floor = input.nextInt();
                            switch (floor) {

                                case 1 -> System.out.println("pin code request");
                                case 2 -> System.out.println("call barring request");
                                case 3 -> System.out.println("fixed dialling");
                                case 4 -> System.out.println("closed user group");
                                case 5 -> System.out.println("phone security");
                                case 6 -> System.out.println("change access code");
                            }
                        }
                        case 4 -> System.out.println("factory reset settings");

                    }
                    break;
                case 7:
                    System.out.println("call divert");
                    break;
                case 8:
                    System.out.println("games");
                    break;
                case 9:
                    System.out.println("calculator");
                    break;
                case 10:
                    System.out.println("reminders");
                    break;
                case 11:
                    System.out.println("clock");
                    String eye = """
                            press 1 for alarm clock
                            press 2 for clock setting
                            press 3 for date setting
                            press 4 for stopwatch
                            press 5 for countdown timer
                            press 6 for auto update of date and time
                            """;
                    System.out.println(eye);
                    int goat = input.nextInt();
                    switch (goat) {
                        case 1 -> System.out.println("alarm clock");
                        case 2 -> System.out.println("clock setting");
                        case 3 -> System.out.println("date setting");
                        case 4 -> System.out.println("stopwatch");
                        case 5 -> System.out.println("countdown timer");
                        case 6 -> System.out.println("auto update of date and time");
                    }
                    break;
                    case 12:
                        System.out.println("profile");
                        break;
                    case 13:
                        System.out.println("sim services");

            }
        }
}