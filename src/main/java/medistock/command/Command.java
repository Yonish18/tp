package medistock.command;

import medistock.exception.MediStockException;
import medistock.inventory.Inventory;
import medistock.storage.Storage;
import medistock.ui.Ui;

public abstract class Command {

    public abstract void execute(Inventory inventory, Ui ui, Storage storage) throws MediStockException;

    public boolean isExit() {
        return false;
    };
}
