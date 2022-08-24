public class ToDoCommand extends AddCommand {
    private String description;
    public ToDoCommand(String description) {
        this.description = description;
    }
    @Override
    public void add(TaskList tasks) {
        tasks.add(new ToDo(description));
    }
}
