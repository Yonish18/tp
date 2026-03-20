package medistock.command;

import medistock.exception.MediStockException;
import medistock.inventory.Inventory;
import medistock.storage.Storage;
import medistock.ui.Ui;

public class HelpCommand extends Command {

    @Override
    public void execute(Inventory inventory, Ui ui, Storage storage) throws MediStockException {
        ui.printCommandList();
    }
}
