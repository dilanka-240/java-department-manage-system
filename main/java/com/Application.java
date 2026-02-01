import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        // Create Company
        Company company = new Company("MyCompany", new ArrayList<>());

        // Pass them into Menu constructor
        Menu menu = new Menu(company);

        // Run the menu
        menu.runMenu();
    }
}