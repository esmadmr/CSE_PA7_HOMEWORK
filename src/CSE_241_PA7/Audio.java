package CSE_241_PA7;

public class Audio extends DatasetObject implements Playable {
    private String duration;

    public Audio(String name, String duration, String otherInfo) {
        super(name, otherInfo);
        this.duration = duration;
    }

    @Override
    public void info() {
        System.out.println("Audio Name: " + name);
        System.out.println("duration: " + duration);
        System.out.println("Other Info: " + otherInfo);
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + name);
    }

    public void showList() {
        System.out.println("This is the showList() method implementation in Audio class.");
    }
}


