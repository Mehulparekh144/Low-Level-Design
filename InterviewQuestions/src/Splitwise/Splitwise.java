package Splitwise;

import Splitwise.balance.BalanceSheetManager;
import Splitwise.expense.Expense;
import Splitwise.expense.split.Split;
import Splitwise.expense.split.SplitType;
import Splitwise.group.Group;
import Splitwise.group.GroupManager;
import Splitwise.user.User;
import Splitwise.user.UserManager;

import java.util.ArrayList;
import java.util.List;

public class Splitwise {
  UserManager userManager;
  GroupManager groupManager;
  BalanceSheetManager balanceSheetManager;

  Splitwise(){
    userManager = new UserManager();
    groupManager = new GroupManager();
    balanceSheetManager = new BalanceSheetManager();
  }

  void demo(){
    User user = new User("u1", "Alice");
    User user2 = new User("u2", "Bob");
    User user3  = new User("u3", "Charlie");
    userManager.createUser(user);
    userManager.createUser(user2);
    userManager.createUser(user3);

    Group group = new Group();
    group.setId("g1");
    group.setName("Group 1");
    group.addMember(user);
    group.addMember(user2);
    group.addMember(user3);
    groupManager.createGroup(group);

    List<Split> splits = new ArrayList<>();
    splits.add(new Split(user , 300));
    splits.add(new Split(user2 , 300));
    splits.add(new Split(user3 , 300));

    group.addExpense("e1" , "dinner" , 900 , splits , SplitType.EQUAL , user);

    List<Split> splits2 = new ArrayList<>();
    splits2.add(new Split(user , 400));
    splits2.add(new Split(user2 , 200));

    group.addExpense("e2" , "lunch" , 600 , splits2 , SplitType.UNEQUAL , user);

    for(User u : userManager.getAllUsers()){
      balanceSheetManager.showBalanceSheet(u);
    }
  }

}
