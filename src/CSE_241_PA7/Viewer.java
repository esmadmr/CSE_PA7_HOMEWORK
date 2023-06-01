package CSE_241_PA7;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private List<NonPlayable> viewList;
    private int currentIndex;

    public Viewer() {
        viewList = new ArrayList<>();
        currentIndex = -1;
    }

    public void updateViewList(NonPlayable nonPlayable) {
        viewList.add(nonPlayable);
        if (currentIndex == -1) {
            currentIndex = 0;
        }
    }

    public void showList() {
        if (viewList.isEmpty()) {
            System.out.println("View List is empty.");
        } else {
            System.out.println("View List:");
            for (NonPlayable item : viewList) {
                item.info();
            }
        }
    }

    public List<NonPlayable> getViewList() {
        return viewList;
    }

    public void removeNonPlayable(DatasetObject datasetObject) {
        viewList.remove(datasetObject);
        if (currentIndex >= viewList.size()) {
            currentIndex = viewList.size() - 1;
        }
    }

    public NonPlayable currentlyViewing() {
        if (currentIndex >= 0 && currentIndex < viewList.size()) {
            return viewList.get(currentIndex);
        }
        return null;
    }
}