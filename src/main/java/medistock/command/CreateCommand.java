package medistock.command;

import medistock.exception.MediStockException;
import medistock.inventory.Inventory;
import medistock.inventory.InventoryItem;
import medistock.storage.Storage;
import medistock.ui.Ui;

import java.io.IOException;

public class CreateCommand extends Command {
    private final String name;
    private final String unit;
    private final int minimumThreshold;

    public CreateCommand(String name, String unit, int minimumThreshold) {
        this.name = name;
        this.unit = unit;
        this.minimumThreshold = minimumThreshold;
    }

    @Override
    public void execute(Inventory inventory, Ui ui, Storage storage) throws MediStockException {
        try {
            InventoryItem item = new InventoryItem(name, unit, minimumThreshold);
            inventory.addItem(item);
            storage.saveToFile(item);
            ui.printCreate(name, unit, minimumThreshold);
        } catch (IOException e) {
            throw new MediStockException("Failed to save to file: " + e.getMessage());
        }
    }
}
