import java.util.ArrayList;
import java.util.List;
public class Manager {

    private ArrayList<String> managers;


    public Manager() {
     //   this.name = name;
       // this.managers = new Manager[];
        this.managers = new ArrayList<String>();

    }

    public void addManager(String managerName) {
        if (managerName == null) {
            throw new IllegalArgumentException("Manager name can not be null");
        }
       // managers.add(new Manager(managerName));
        managers.add(managerName);

    }

    public void removeManager(int index) {
        try {
            managers.remove(index);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Invalid manager index.");
        }
    }

    public void printManagers() {
       // for (Manager manager : managers) {
        for (String manager : managers) {
            System.out.println(manager);

         //   System.out.println(manager.name);
        }
    }
}