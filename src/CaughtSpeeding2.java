public class CaughtSpeeding2 {
  public int caughtSpeeding(int speed, boolean isBirthday) {
    if ((speed <= 60 && !isBirthday) || (speed <= 65 && isBirthday))  {
      return 0;
    } else if ((speed <= 80 && !isBirthday) || (speed <= 86 && isBirthday)) {
      return 1;
    } else {
      return 2;
    }
  }
}
