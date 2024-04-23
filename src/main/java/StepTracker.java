import java.util.ArrayList;
public class StepTracker
{
 private int steps, days, activeDaysNum, minNumberSteps;

public StepTracker(int minNumberSteps){
this.minNumberSteps = minNumberSteps;
steps = 0;
days = 0;
activeDaysNum = 0;
}
 public void addDailySteps(int dailySteps){
  if(dailySteps >= minNumberSteps)
   activeDaysNum++;
  
  days++;
  steps += dailySteps
 }
public int activeDays(){
  return activeDaysNum;
}
public double averageSteps(){
 if(days == 0)
  return 0;
 else
 return (double)steps/days;
}
 
} 
