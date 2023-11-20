package Fabric;

import Interface.IGameItem;
import Product.Alexandrite;

public class AlexandriteGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Alexandrite();
    }

}