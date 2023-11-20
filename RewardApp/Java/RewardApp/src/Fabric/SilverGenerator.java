package Fabric;

import Interface.IGameItem;
import Product.Gold;

public class SilverGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Gold();
    }
    
}