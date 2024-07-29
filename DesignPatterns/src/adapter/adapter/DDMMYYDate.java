package adapter.adapter;

import adapter.adaptee.YYMMDDDate;

public class DDMMYYDate implements DateAdapter{

  private YYMMDDDate yyMMDDDate;

  public DDMMYYDate(YYMMDDDate yyMMDDDate) {
    this.yyMMDDDate = yyMMDDDate;
  }

  @Override
  public String getDate() {
    String date = yyMMDDDate.getDate();
    String[] dateParts = date.split("-");
    return dateParts[2] + "-" + dateParts[1] + "-" + dateParts[0];
  }
}
