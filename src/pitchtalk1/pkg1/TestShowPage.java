/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitchtalk1.pkg1;

import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 *
 * @author Kenny
 */
public class TestShowPage {
 public static void main(String args[]) {  
  JTextPane tp = new JTextPane();
  JScrollPane js = new JScrollPane();
  js.getViewport().add(tp);
  JFrame jf = new JFrame();
  jf.getContentPane().add(js);
  jf.pack();
  jf.setSize(400,500);
  jf.setVisible(true); 
  
  try {
    URL url = new URL("http://www.tactika.com/realhome/contents.html");
    tp.setPage(url);
    } 
  catch (Exception e) {
    e.printStackTrace();
    }
  }
 }
