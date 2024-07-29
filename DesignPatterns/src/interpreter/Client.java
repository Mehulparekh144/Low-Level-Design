package interpreter;

public class Client {
  public static void main(String[] args) {
    MemoContext context = new MemoContext();
    AbstractExpression funDay = new FunDayExpression("Picnic", "June 1st");
    AbstractExpression safetyTraining = new SafetyTrainingExpression("Fire Safety", "June 15th");
    AbstractExpression budgetReview = new BudgetReviewExpression("Marketing", "June 30th");

    funDay.interpret(context);
    safetyTraining.interpret(context);
    budgetReview.interpret(context);
  }
}
