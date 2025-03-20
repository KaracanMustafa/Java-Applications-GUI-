import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            TaskModel model = new TaskModel();
            TaskPlannerSwingView view = new TaskPlannerSwingView();
            TaskController controller = new TaskController(model, view);
            model.addObserver(view);
            view.setController(controller);
            controller.createAndShowTaskPlannerSwingView();
        });
    }
}