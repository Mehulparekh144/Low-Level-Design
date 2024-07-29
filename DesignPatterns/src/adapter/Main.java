package adapter;

import adapter.adaptee.YYMMDDDate;
import adapter.adapter.DDMMYYDate;
import adapter.adapter.DateAdapter;

public class Main {
  public static void main(String[] args) {
    YYMMDDDate yyMMDDDate = new YYMMDDDate();
    System.out.println(yyMMDDDate.getDate());
    DateAdapter dateAdapter = new DDMMYYDate(yyMMDDDate);
    System.out.println(dateAdapter.getDate());
  }
}
