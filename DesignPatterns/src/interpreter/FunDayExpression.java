package interpreter;

public class FunDayExpression implements AbstractExpression{

  String activity;
  String date;

  public FunDayExpression(String activity, String date){
    this.activity = activity;
    this.date = date;
  }

  @Override
  public void interpret(MemoContext context) {
    context.announceFunDay(activity, date);
  }
}
