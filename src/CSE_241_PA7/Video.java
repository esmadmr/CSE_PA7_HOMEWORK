package CSE_241_PA7;

public class Video extends DatasetObject implements Playable {
    private String duration;

    public Video(String name, String duration, String otherInfo) {
        super(name, otherInfo);
        this.duration = duration;
    }

    @Override
    public void info() {
        System.out.println("Video Name: " + name);
        System.out.println("Duration: " + duration);
        System.out.println("Other Info: " + otherInfo);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + name);
    }
    public void showList() {
        System.out.println("This is the showList() method implementation in Video class.");
    }

}

