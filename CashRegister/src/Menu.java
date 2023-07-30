import java.lang.reflect.Array;
import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItems> foods;
    ArrayList<MenuItems> soups;
    ArrayList<MenuItems> drinks;

    public Menu() {
        this.foods = new ArrayList<MenuItems>();
        this.soups = new ArrayList<MenuItems>();
        this.drinks = new ArrayList<MenuItems>();
        this.initialize();
    }

    public void initialize(){
        this.foods.add(new MenuItems("Peking Duck", 7));
        this.foods.add(new MenuItems("Kung Pao Chicken", 6.5));
        this.foods.add(new MenuItems("Mapu Tofu", 5.5));
        this.foods.add(new MenuItems("Chinese Sticky Rice", 6.5));
        this.foods.add(new MenuItems("Stinky Tofu", 6));

        this.soups.add(new MenuItems("Noodle soup", 3.5));
        this.soups.add(new MenuItems("Wonton soup",3.5));

        this.drinks.add(new MenuItems("Cola Cola 0,3dl", 2));
        this.drinks.add(new MenuItems("Fanta", 2));
        this.drinks.add(new MenuItems("Tea by your choice", 1.5));
        this.drinks.add(new MenuItems("Tap water", 0.5));
    }

    public void welcome(){
        System.out.println("*****Welcome to RiceLand*****");
    }




}
