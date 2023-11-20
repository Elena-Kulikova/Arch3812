package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<>();

    // public Scene GetScena(int ID) {
    //     for (int i = 0; i < Scenes.size(); i++) {
    //         if (Scenes.get(i).ID == ID) {
    //             return Scenes.get(i);
    //         }

    //     }
    //     return null;
    // }

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (!models.isEmpty()) {
            this.models = models;
        } else {
            throw new Exception("The list of models cannot be empty!");
        }
        this.flashes = flashes;
        if (!cameras.isEmpty()) {
            this.cameras = cameras;
        } else {
            throw new Exception("The list of cameras cannot be empty!");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T model, E flash) {
        return model;
    }

    public int getId() {
        return 0;
    }
}