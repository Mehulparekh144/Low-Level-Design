package proxy;

public class ImportantFilesProxy implements ImportantFiles{

  private ImportantFiles importantFiles;

  public ImportantFilesProxy() {
    importantFiles = new ImportantFilesImpl();
  }

  @Override
  public void add(String user, String file) {
    if(user.equalsIgnoreCase("michael")){
      importantFiles.add(user, file);
      return;
    }
    throw new IllegalArgumentException("Only manager is authorized to add files");
  }

  @Override
  public void delete(String user, int fileId) {
    if(user.equalsIgnoreCase("michael")){
      importantFiles.delete(user, fileId);
      return;
    }
    throw new IllegalArgumentException("Only manager is authorized to delete files");
  }

  @Override
  public void read(String user, int fileId) {
    if(user.equalsIgnoreCase("michael") || user.equalsIgnoreCase("jim")){
      importantFiles.read(user, fileId);
      return;
    }
    throw new IllegalArgumentException("Only co-managers are authorized to read files");
  }
}
