package interpreter;

public class SafetyTrainingExpression implements AbstractExpression {
  String topic;
  String date;

  public SafetyTrainingExpression(String topic , String date){
    this.topic = topic;
    this.date = date;
  }

  @Override
  public void interpret(MemoContext context) {
    context.scheduleSafetyTraining(topic, date);
  }
}
