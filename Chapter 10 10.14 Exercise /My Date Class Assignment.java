public class MyDate() {
  
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private long milliseconds;

    // Constructor from components:
    public myDate (int year, int month, int day, int hour, int minute, int second, int milliseconds) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(year, month, day, hour, minute, second);
      calendar.set(Calendar.MILLISECOND, milliseconds);
      this.milliseconds = calendar.getTimeInMillis();
    }
  
    // Method for the year:
    public int getYear() {
      Calendar calendar = Calendar.getInstance();
      calendar.setTimeInMillis(milliseconds);
      return calendar.get(Calendar.YEAR);
    }
    // Method for the milliseconds:
    public long getMilliseconds() {
      return milliseconds;
    }
    // Using for the string
    public String format(String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new java.util.Date(milliseconds));
    }

  public static void main(String[] args) {
    // Using milliseconds since epoch
    MyDate date1 = new MyDate(System.currentTimeMillis());
    System.out.println("Date 1: " + date1.format("yyyy-MM-dd HH:mm:ss.SSS"));
    System.out.println("Milliseconds: " + date1.getMilliseconds());
  
    // Using year, month, day, hour, minute, second, and millisecond
    MyDate date2 = new MyDate(2025, 6, 14, 22, 40, 0, 500);
    System.out.println("Date 2: " + date2.format("yyyy-MM-dd HH:mm:ss.SSS"));
    System.out.println("Year: " + date2.getYear());
  }
}
