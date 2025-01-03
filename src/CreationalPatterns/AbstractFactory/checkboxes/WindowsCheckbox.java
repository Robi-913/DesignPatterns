package CreationalPatterns.AbstractFactory.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void print() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
