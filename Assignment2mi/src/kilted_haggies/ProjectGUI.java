package kilted_haggies;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectGUI extends JFrame {
    private JTextField projectIdTextField;
    private JTextField projectNameTextField;
    private JTextField projectTypeTextField;
    private JTextField projectDateTextField;
    private JTextField projectLocationTextField;
    private JTextField projectCostTextField;
    private JTextField projectPriceToCustomerTextField;

    public ProjectGUI() {
        setTitle("Project Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(7, 2));

        // Add form fields
        formPanel.add(new JLabel("Project ID:"));
        projectIdTextField = new JTextField();
        formPanel.add(projectIdTextField);

        formPanel.add(new JLabel("Project Name:"));
        projectNameTextField = new JTextField();
        formPanel.add(projectNameTextField);

        formPanel.add(new JLabel("Project Type:"));
        projectTypeTextField = new JTextField();
        formPanel.add(projectTypeTextField);

        formPanel.add(new JLabel("Project Date:"));
        projectDateTextField = new JTextField();
        formPanel.add(projectDateTextField);

        formPanel.add(new JLabel("Project Location:"));
        projectLocationTextField = new JTextField();
        formPanel.add(projectLocationTextField);

        formPanel.add(new JLabel("Project Cost:"));
        projectCostTextField = new JTextField();
        formPanel.add(projectCostTextField);

        formPanel.add(new JLabel("Project Price to Customer:"));
        projectPriceToCustomerTextField = new JTextField();
        formPanel.add(projectPriceToCustomerTextField);

        // Create submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve data from form fields
                int projectId = Integer.parseInt(projectIdTextField.getText());
                String projectName = projectNameTextField.getText();
                String projectType = projectTypeTextField.getText();
                String projectDate = projectDateTextField.getText();
                String projectLocation = projectLocationTextField.getText();
                double projectCost = Double.parseDouble(projectCostTextField.getText());
                double projectPriceToCustomer = Double.parseDouble(projectPriceToCustomerTextField.getText());

                // Create Project object with retrieved data
                Project project = new Project();
                project.setProjectId(projectId);
                project.setProjectName(projectName);
                project.setProjectType(projectType);
                project.setProjectDate(projectDate);
                project.setProjectLocation(projectLocation);
                project.setProjectCost(projectCost);
                project.setProjectPriceToCustomer(projectPriceToCustomer);

                // Perform desired actions with Project object (e.g. save to database, display in UI)
                // ...
            }
        });

        // Add form panel and submit button to main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(submitButton, BorderLayout.SOUTH);

        // Add main panel to frame
        add(mainPanel);

        setVisible(true);
    }
    

    public static void main(String[] args) {
        ProjectGUI projectGUI = new ProjectGUI();
    }
}
