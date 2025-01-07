
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roguelike.java;
import javax.swing.JFrame;
import asciiPanel.AsciiPanel;

/**
 *
 * @author alqiwa
 */

public class ApplicationMain extends JFrame {
  private static final long serialVersionUID = 1060623638149583738L;

  private AsciiPanel terminal;

  public ApplicationMain() {
    super();
    terminal = new AsciiPanel();
    terminal.write("testing 123", 1, 1);
    add(terminal);
    pack();
  }

  public static void main(String[] args) {
    ApplicationMain app = new ApplicationMain();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.setVisible(true);
  }
}
