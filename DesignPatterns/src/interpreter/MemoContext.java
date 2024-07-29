package interpreter;

public class MemoContext {
  public void announceFunDay(String activity , String date){
    System.out.println("On " + date + " we will have " + activity + " fun day!");
  }

  public void scheduleSafetyTraining(String topic , String date){
    System.out.println("On " + date + " we will have safety training on " + topic);
  }

  public void requestBudgetReview(String department , String date){
    System.out.println("On " + date + " we will have a budget review for " + department);
  }
}
