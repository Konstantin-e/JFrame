package frame;

public class Main {
  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame();
    MyLabel myLabel = new MyLabel();
    myFrame.add(myLabel);
    myFrame.pack();
  }
}  
