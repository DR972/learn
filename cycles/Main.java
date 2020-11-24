package by.epam.learn.main;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        Choice chobj = new Choice();
        int o = 0;
        for (;;) {
            do {
                chobj.showMenu(o++);
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while( !chobj.isvalid(choice) );
            if(choice == 'q') {
                System.out.println("\nНу как? Жду рекомендаций.");
                break;
            }
            System.out.println("\n");
            chobj.choiceOn(choice);
        }
    }
}
