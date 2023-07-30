import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean running = true;
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<MenuItems> selectedItems = new ArrayList<>();
        String choice = "";

        while (running){
            menu.welcome();
            System.out.println();
            System.out.println("Select option");
            System.out.println("1 - Show Menu and create bill");
            System.out.println("2 - Show the bill");
            System.out.println("3 - End program");
            choice = sc.nextLine();
            System.out.println();
            switch(choice){
                case "1":
                    selectedItems = showMenu(menu);
                    break;
                case "2":
                    showBill(selectedItems);
                     running = keepRunning();
                case "3":
                    running = false;
                    System.out.println("Thank you for visiting, please come again!");
                default:
                    System.out.println("");

            }
        }



    }

    public static ArrayList<MenuItems> showMenu(Menu menu){
        /*
        In a loop until the user says otherwise show the foods menu and ask for the selection
        do the same thing for the other two menus
        The selected items will be added to an Array that would be returned at the end of the fuction
         */
        boolean running = true;

        ArrayList<MenuItems> selectedItems = new ArrayList<>();
        while (running) {
            selectedItems.add(showAndSelect(menu.foods));
            selectedItems.add(showAndSelect(menu.soups));
            selectedItems.add(showAndSelect(menu.drinks));
            running = keepRunning();

        }

    return selectedItems;

    }

    public static MenuItems showAndSelect(ArrayList<MenuItems> itemsToShow){
        /* it will show all the items in array
        and will allow the waiter to select one
        and it will return the selcted one
        */
        Scanner sc = new Scanner(System.in);
        int i = 1;
        for (MenuItems item : itemsToShow) {
            System.out.println(i + ":" + item.name + "/" + item.price + "€");
            i++;
        }

        System.out.println("Your selection: ");
        int choice = sc.nextInt();

        return itemsToShow.get(choice -1);

    }

    public static void showBill(ArrayList<MenuItems> selectedItems){
        //shows total bill
        int sum = 0;
        for (MenuItems item : selectedItems) {
            sum += item.price;
        }

        System.out.println("Your total bill is: " + sum + "€.");

    }

    public static boolean keepRunning(){
        Scanner sc = new Scanner(System.in);
        // asks the waiter if he wants to continue
        System.out.println("Do you want to continue? [Y/N]");
        String answer = sc.nextLine().toLowerCase();
        if(answer == "y") {
            return true;
        }
        return false;
    }



}


