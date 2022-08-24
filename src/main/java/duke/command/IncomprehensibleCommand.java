package duke.command;

import duke.main.DukeException;
import duke.main.Storage;
import duke.main.TaskList;
import duke.main.Ui;

public class IncomprehensibleCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        throw new DukeException("I'm sorry, but I don't know what that means T.T");
    }
    @Override
    public boolean isExit() {
        return false;
    }
}