package medistock.command;

import medistock.exception.MediStockException;
import medistock.inventory.Inventory;
import medistock.inventory.InventoryItem;
import medistock.storage.Storage;
import medistock.ui.Ui;

public class DeleteCommandName extends Command {
    private final String name;

    public DeleteCommandName(String name) {
        this.name = name;
    }

    @Override
    public void execute(Inventory inventory, Ui ui, Storage storage) throws MediStockException {
        InventoryItem deletedItem = inventory.deleteItem(name);
        ui.printDelete(deletedItem);
    }
}
