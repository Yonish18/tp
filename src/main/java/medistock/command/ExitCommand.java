package medistock.command;

import medistock.exception.MediStockException;
import medistock.inventory.Inventory;
import medistock.storage.Storage;
import medistock.ui.Ui;

public class ExitCommand extends Command{

    public void execute(Inventory inventory, Ui ui, Storage storage) throws MediStockException {
        ui.printExitMessage();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
