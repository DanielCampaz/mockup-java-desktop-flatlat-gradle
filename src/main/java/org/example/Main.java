package org.example;

import com.formdev.flatlaf.FlatDarkLaf;
//import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JButton;

public class Main extends JFrame{

    static int WIDTH = 500;
    static int HEIGHT = 500;

    public Main() {
        super();
        // Init JFrame
        init();
    }

    public Main(String title) {
        super(title);
        // Init JFrame
        init();
    }

    private void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(Main.WIDTH,Main.HEIGHT);
        setVisible(true);

        // Init Components
        initComponents();
    }
    private void initComponents() {
        add(new FirstPanel());
    }

    public static void main(String[] args) {
        /*
        * Packages Manager in Gradle https://plugins.gradle.org/
        * Change the name in the package "org.example" ===> "org.your_name_project"
        *       in build.gradle and gradlew.bat change name project, same name whit root folder
        * */
        try {
            //UIManager.setLookAndFeel(new FlatLightLaf()); // FlatLat Initialization https://www.formdev.com/flatlaf/
            UIManager.setLookAndFeel(new FlatDarkLaf());  // Para un tema oscuro
        } catch (Exception ex) {
            System.err.println("Error al establecer FlatLaf");
        }
        new Main("Application Muck Up");
    }
}