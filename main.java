import java.util.ArrayList;
import java.util.Formatter;
import java.util.Collections;
import java.util.Scanner;

public class main {
  // We will override this
  abstract class set {
    public String create_file_name;
    
    abstract public String getFile(String create_fileNAME);
    abstract public void create();
  }
  // This will be where we override the values
  public void getSetup(String file_,String informationToInput) {
    ArrayList<String> saved_data = new ArrayList<String>();
    set setup = new set() {
      @Override
      public String getFile(String create_fileNAME) {
        this.create_file_name = create_fileNAME;
        saved_data.add(this.create_file_name);
        return this.create_file_name;
      }
      @Override
      public void create(String write_data_to_file) {
        try {
          Formatter cFile = new Formatter(this.create_file_name);
          cFile.format("%s",write_data_to_file);
          cFile.close()
        } catch (Exception e) {
          System.out.println(e); 
        }
      }
    };
    setup.getFile(fileNAME);
    setup.create(informationToInput);
    Collections.sort(saved_data);
  }
  
  // I didn't wanna make another file so I made this mini project in one file :)
  public static void main(String[] args) {
    Scanner fileNAME = new Scanner(System.in);
    String file_ = fileNAME.nextLine();
    getSetup run = new getSetup(file_,"Hey. I am Aidan. A Java, C#, Python, Sql and C developer");
  }
}
