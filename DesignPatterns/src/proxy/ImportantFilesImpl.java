package proxy;


import java.util.HashMap;
import java.util.Map;

public class ImportantFilesImpl implements ImportantFiles{

  private static int fileId = 0;
  String user;
  String file;
  Map<Integer,String> files;

  public ImportantFilesImpl(){
    files = new HashMap<>();
  }

  public ImportantFilesImpl(String user, String file) {
    this.user = user;
    this.file = file;
  }

  @Override
  public void add(String user, String file) {
    files.put(fileId++ , file);
  }

  @Override
  public void delete(String user, int fileId) {
    files.remove(fileId);
  }

  @Override
  public void read(String user, int fileId) {
    System.out.println(files.getOrDefault(fileId, "File not found"));
  }
}
