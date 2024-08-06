package Splitwise.group;

import java.util.ArrayList;
import java.util.List;

public class GroupManager {
  List<Group> groups;

  public GroupManager(){
    groups = new ArrayList<>();
  }

  public void createGroup(Group group){
    groups.add(group);
  }

  public Group getGroup(String groupId){
    for(Group group : groups){
      if(group.getId().equals(groupId)){
        return group;
      }
    }
    return null;
  }
}
