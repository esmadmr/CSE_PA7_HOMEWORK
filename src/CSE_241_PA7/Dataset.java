package CSE_241_PA7;

import java.util.ArrayList;
import java.util.List;

public class Dataset {

    private List<DatasetObject> datasetObjects;
    private List<Player> players;
    private List<Viewer> viewers;

    public Dataset() {
        datasetObjects = new ArrayList<>();
        players = new ArrayList<>();
        viewers = new ArrayList<>();
    }

    public void register(Player player) {
        players.add(player);
    }

    public List<DatasetObject> getDatasetObjects() {
        return datasetObjects;
    }

    public void register(Viewer viewer) {
        viewers.add(viewer);
    }

    public void add(DatasetObject datasetObject) {
        datasetObjects.add(datasetObject);
        updateObservers(datasetObject);
    }

    public void remove(DatasetObject datasetObject) {
        datasetObjects.remove(datasetObject);
        updateObservers(datasetObject);
    }

    private void updateObservers(DatasetObject datasetObject) {
        for (Player player : players) {
            if (player.getPlaylist().contains(datasetObject)) {
                player.removePlayable(datasetObject);
            }
        }

        for (Viewer viewer : viewers) {
            if (viewer.getViewList().contains(datasetObject)) {
                viewer.removeNonPlayable(datasetObject);
            }
        }
    }

}

