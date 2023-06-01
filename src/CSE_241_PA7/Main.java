package CSE_241_PA7;

public class Main {
    public static void main(String[] args) {
        Dataset ds = new Dataset();
        //different observers
        Player p1 = new Player();
        Player p2 = new Player();
        Viewer v1 = new Viewer();
        Viewer v2 = new Viewer();

        ds.register(p1);
        ds.register(p2);
        ds.register(v1);
        ds.register(v2);
        ds.add(new Image("imagename1", "dimension info1", "other info1"));
        ds.add(new Image("imagename2", "dimension info2", "other info2"));
        ds.add(new Image("imagename3", "dimension info3", "other info3"));
        ds.add(new Image("imagename4", "dimension info4", "other info4"));
        ds.add(new Image("imagename5", "dimension info5", "other info5"));
        ds.add(new Audio("audioname1", "duration1", "other info1"));
        ds.add(new Audio("audioname2", "duration2", "other info2"));
        ds.add(new Audio("audioname3", "duration3", "other info3"));
        ds.add(new Video("videoname1", "duration1", "other info1"));
        ds.add(new Video("videoname2", "duration2", "other info2"));
        ds.add(new Video("videoname3", "duration3", "other info3"));
        ds.add(new Text("textname1", "other info1"));
        ds.add(new Text("textname2", "other info2"));
        ds.add(new Text("textname3", "other info3"));



        p1.updatePlaylist((Playable) ds.getDatasetObjects().get(0));
        p1.updatePlaylist((Playable) ds.getDatasetObjects().get(2));
        p1.updatePlaylist((Playable) ds.getDatasetObjects().get(4));
        v1.updateViewList((NonPlayable) ds.getDatasetObjects().get(1));
        v1.updateViewList((NonPlayable) ds.getDatasetObjects().get(3));
        v1.updateViewList((NonPlayable) ds.getDatasetObjects().get(5));


        Playable po = p1.currentlyPlaying();
        if (po != null) {
            po.info();
            ds.remove((DatasetObject) po);
        } else {
            System.out.println("No currently playing item.");
        }
        NonPlayable np = v1.currentlyViewing();
        if (np != null) {
            np.info();
        }

        p1.showList();
        p2.showList();
        v1.showList();
        v2.showList();
    }
}
