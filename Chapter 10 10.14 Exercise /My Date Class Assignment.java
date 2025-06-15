public static void main(String[] args) {
  private int year;
  private int month;
  private int day;
  private int hour;
  private int minute;
  private int second;
  private long millisecond;

  public myDate (int year, int month, int day, int hour, int minute, int second, int millisecond) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.hour = hour;
    this.minute = minute;
    this.seconds = second;
    this.milliseconds = millisecond;
    Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute, second);
        calendar.set(Calendar.MILLISECOND, millisecond);
        this.milliseconds = calendar.getTimeInMillis();
  }

  // Method for the year:
  public int getYear() {
    return year;
    Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        return calendar.get(Calendar.YEAR);
  }
  // Method for the month:
  public int getMonth() {
    return month;
    Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        return calendar.get(Calendar.MONTH);
  }
  // Method for the day:
  public int getDay() {
    return day;
    Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        return calendar.get(Calendar.DAY_OF_MONTH);
  }
  // Method for the hour:
  public int getHour() {
    return hour;
    Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        return calendar.get(Calendar.HOUR_OF_DAY);
  }
  // Method for the minute:
  public int getMinute() {
    return minute;
    Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        return calendar.get(Calendar.MINUTE);
  }
  // Method for the second:
  public int getSecond() {
    return second;
    Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        return calendar.get(Calendar.SECOND);
  }
  // Method for the millisecond:
  public int getMillisecond() {
    return millisecond;
    Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        return calendar.get(Calendar.MILLISECOND);
  }

  // Using milliseconds since epoch
  MyDate date1 = new MyDate(System.currentTimeMillis());
  System.out.println("Date 1: " + date1.format("yyyy-MM-dd HH:mm:ss.SSS"));
  System.out.println("Milliseconds: " + date1.getMilliseconds());

  // Using year, month, day, hour, minute, second, and millisecond
  MyDate date2 = new MyDate(2025, 6, 14, 22, 40, 0, 500);
  System.out.println("Date 2: " + date2.format("yyyy-MM-dd HH:mm:ss.SSS"));
  System.out.println("Year: " + date2.getYear());
  System.out.println("Month: " + date2.getMonth());
  System.out.println("Day: " + date2.getDay());
  System.out.println("Hour: " + date2.getHour());
  System.out.println("Minute: " + date2.getMinute());
  System.out.println("Second: " + date2.getSecond());
  System.out.println("Millisecond: " + date2.getMillisecond());
}
