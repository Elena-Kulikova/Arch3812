package Fabric;

import Interface.IGameItem;
import Product.Opal;

public class OpalGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Opal();
    }

}