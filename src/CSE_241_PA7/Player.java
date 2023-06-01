package CSE_241_PA7;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Playable> playlist;
    private int currentIndex;

    public Player() {
        playlist = new ArrayList<>();
        currentIndex = -1;
    }

    public void updatePlaylist(Playable playable) {
        playlist.add(playable);
        if (currentIndex == -1) {
            currentIndex = 0;
        }
    }

    public void next(String type) {
        if (currentIndex != -1) {
            boolean found = false;
            int start = currentIndex + 1;
            while (start != currentIndex) {
                if (start >= playlist.size()) {
                    start = 0;
                }
                Playable playable = playlist.get(start);
                if (type.equals("audio") && playable instanceof Audio) {
                    currentIndex = start;
                    found = true;
                    break;
                } else if (type.equals("video") && playable instanceof Video) {
                    currentIndex = start;
                    found = true;
                    break;
                }
                start++;
            }
            if (!found) {
                System.out.println("No " + type + " found in the playlist.");
            }
        }
    }

    public void previous(String type) {
        if (currentIndex != -1) {
            boolean found = false;
            int start = currentIndex - 1;
            while (start != currentIndex) {
                if (start < 0) {
                    start = playlist.size() - 1;
                }
                Playable playable = playlist.get(start);
                if (type.equals("audio") && playable instanceof Audio) {
                    currentIndex = start;
                    found = true;
                    break;
                } else if (type.equals("video") && playable instanceof Video) {
                    currentIndex = start;
                    found = true;
                    break;
                }
                start--;
            }
            if (!found) {
                System.out.println("No " + type + " found in the playlist.");
            }
        }
    }

    public List<Playable> getPlaylist() {

        return playlist;
    }

    public void showList() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (Playable playable : playlist) {
                playable.info();
            }
        }
    }

    public void removePlayable(DatasetObject datasetObject) {
        playlist.remove(datasetObject);
        if (currentIndex >= playlist.size()) {
            currentIndex = playlist.size() - 1;
        }
    }

    public Playable currentlyPlaying() {
        if (currentIndex >= 0 && currentIndex < playlist.size()) {
            return playlist.get(currentIndex);
        }
        return null;
    }
}
