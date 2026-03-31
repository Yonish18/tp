package medistock.parser;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import medistock.command.Command;
import medistock.command.FindCommand;
import medistock.exception.MediStockException;
import org.junit.jupiter.api.Test;

public class FindParserTest {

    @Test
    void parseCommand_validFind_returnsFindCommand() throws MediStockException {
        String input = "find aspirin";

        Command command = Parser.parseCommand(input);
        assertInstanceOf(FindCommand.class, command);
    }

    @Test
    void parseCommand_missingKeyword_throwsException() {
        String input = "find";

        assertThrows(MediStockException.class, () -> Parser.parseCommand(input));
    }

    @Test
    void parseCommand_emptyKeyword_throwsException() {
        String input = "find   ";

        assertThrows(MediStockException.class, () -> Parser.parseCommand(input));
    }
}
