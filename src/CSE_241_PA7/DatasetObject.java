package CSE_241_PA7;

public abstract class DatasetObject {
    protected String name;
    protected String otherInfo;

    public DatasetObject(String name, String otherInfo) {
        this.name = name;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public abstract void info();
}
