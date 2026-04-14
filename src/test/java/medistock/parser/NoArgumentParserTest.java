package medistock.parser;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import medistock.command.Command;
import medistock.command.HistoryCommand;
import medistock.command.ListCommand;
import medistock.exception.MediStockException;
import org.junit.jupiter.api.Test;

public class NoArgumentParserTest {

    @Test
    void parseCommand_validList_returnsListCommand() throws MediStockException {
        Command command = Parser.parseCommand("list");

        assertInstanceOf(ListCommand.class, command);
    }

    @Test
    void parseCommand_listWithArguments_throwsException() {
        assertThrows(MediStockException.class,
                () -> Parser.parseCommand("list aspirin"));
    }

    @Test
    void parseCommand_validHistory_returnsHistoryCommand() throws MediStockException {
        Command command = Parser.parseCommand("history");

        assertInstanceOf(HistoryCommand.class, command);
    }

    @Test
    void parseCommand_historyWithArguments_throwsException() {
        assertThrows(MediStockException.class,
                () -> Parser.parseCommand("history all"));
    }
}
