package medistock.command;

import medistock.exception.MediStockException;
import medistock.inventory.Inventory;
import medistock.inventory.InventoryItem;
import medistock.storage.Storage;
import medistock.ui.Ui;

public class WithdrawCommand extends Command {
    private final String name;
    private final int quantity;

    public WithdrawCommand(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public void execute(Inventory inventory, Ui ui, Storage storage) throws MediStockException {
        InventoryItem item = inventory.getItem(name);
        item.withdraw(quantity);
        ui.printWithdraw(quantity, item);
    }
}
