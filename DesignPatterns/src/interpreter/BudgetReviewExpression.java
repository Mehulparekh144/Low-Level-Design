package interpreter;

public class BudgetReviewExpression implements AbstractExpression {
  String department;
  String date;

  public BudgetReviewExpression(String department, String date) {
    this.department = department;
    this.date = date;
  }

  @Override
  public void interpret(MemoContext context) {
    context.requestBudgetReview(department, date);
  }
}
