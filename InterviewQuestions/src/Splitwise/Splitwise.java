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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


  //Follow up: Implement simplify debts feature
  public int minTransfer(int[][] transactions){

    Map<Integer,Integer> memberVsBalance = new HashMap<>();

    for(int[] txn : transactions){
      int from = txn[0];
      int to = txn[1];
      int amount = txn[2];

      memberVsBalance.put(from, memberVsBalance.getOrDefault(from,0) - amount);
      memberVsBalance.put(to, memberVsBalance.getOrDefault(to,0) + amount);
    }

    System.out.println(memberVsBalance);

    List<Integer> balances = new ArrayList<>();
    memberVsBalance.forEach((k,v) -> {
      if(v != 0){
        balances.add(v);
      }
    });

    return dfs(balances, 0);
  }

  private int dfs(List<Integer> balances , int idx){
    if(balances.isEmpty() || idx == balances.size()){
      return 0;
    }

    if(balances.get(idx) == 0) return dfs(balances, idx+1);

    int currVal = balances.get(idx);
    int minTxt = Integer.MAX_VALUE;

    for(int txnIdx = idx + 1 ; txnIdx < balances.size() ; txnIdx++){
      int next = balances.get(txnIdx);

      if(currVal*next < 0){
        balances.set(txnIdx , currVal + next);
        minTxt = Math.min(minTxt , 1 + dfs(balances , idx+1));

        if(currVal + next == 0){
          break;
        }
      }
    }

    return minTxt;
  }

}
