package proxy;

public interface ImportantFiles {
  void add(String user , String file);
  void delete(String user , int fileId);
  void read(String user , int fileId);
}
