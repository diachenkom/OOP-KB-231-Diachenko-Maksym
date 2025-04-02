package task_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class UserStory extends Ticket {
    private final List<UserStory> dependencies;

    public UserStory(int id, String name, int estimate, List<UserStory> dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies != null ? new ArrayList<>(dependencies) : new ArrayList<>();
    }

    @Override
    public void complete() {
        for (UserStory dependency : dependencies) {
            if (!dependency.isCompleted()) {
                return;
            }
        }
        super.complete();
    }

    public List<UserStory> getDependencies() {
        return Collections.unmodifiableList(dependencies);
    }

    @Override
    public String toString() {
        return "[UserStory " + getId() + "] " + getName();
    }
}
