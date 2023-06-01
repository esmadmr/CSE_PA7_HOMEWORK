package CSE_241_PA7;

public class Text extends DatasetObject implements NonPlayable {
    public Text(String name, String otherInfo) {
        super(name, otherInfo);
    }

    @Override
    public void info() {
        System.out.println("Text Name: " + name);
        System.out.println("Other Info: " + otherInfo);
    }

    @Override
    public void view() {
        System.out.println("Viewing text: " + name);
    }


}

