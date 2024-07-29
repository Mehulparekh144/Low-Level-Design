package proxy;

public class Main {
  public static void main(String[] args) {
    try{
      ImportantFiles importantFiles = new ImportantFilesProxy();
      importantFiles.add("michael", "file1");
//      importantFiles.add("jim", "file2");
//      importantFiles.add("pam", "file3");
      importantFiles.read("michael", 0);
      importantFiles.read("jim", 0);
//      importantFiles.read("pam", 2);
      importantFiles.delete("michael", 0);
      importantFiles.delete("jim", 1);
      importantFiles.delete("pam", 2);
    }catch (Exception e){
      System.err.println(e.getMessage());
    }
  }
}
