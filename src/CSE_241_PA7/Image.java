package CSE_241_PA7;

public class Image extends DatasetObject implements NonPlayable {
    private String dimensionInfo;

    public Image(String name, String dimensionInfo, String otherInfo) {
        super(name, otherInfo);
        this.dimensionInfo = dimensionInfo;
    }

    public void play() {
        System.out.println("Playing image: " + getName());
    }

    @Override
    public void info() {
        System.out.println("Image Name: " + getName());
        System.out.println("Dimension Info: " + dimensionInfo);
        System.out.println("Other Info: " + getOtherInfo());
    }

    public void view() {
        System.out.println("Viewing image: " + getName());
    }

    public String getDimensionInfo() {
        return dimensionInfo;
    }
    public void showList() {
        System.out.println("This is the showList() method implementation in Audio class.");
    }
}

