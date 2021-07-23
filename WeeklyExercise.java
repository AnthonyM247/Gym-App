import java.util.ArrayList;

public class WeeklyExercise{
  
  private ArrayList<Fitness> list;
  private int days;
  private double target;
  private Profile profile;
  private DailyExercise dailyExercise;


  public WeeklyExercise(ArrayList<Fitness> exerciseList, int days, double weeklyCalorieTarget, Profile profile){
    this.list = exerciseList;
    this.days = days;
    this.target = weeklyCalorieTarget;
    this.profile = profile;
    this.dailyExercise = dailyExercise;


   
  }
  
  public WeeklyExercise(ArrayList<Fitness> exerciseList, Profile profile){
    this.list = exerciseList;
    this.days = 7;
    this.target = 3500;
    this.profile = profile;
  }
  
  public void addExercise(Fitness ex){
    list.add(ex);
  }
  
  public void removeExercise(Fitness ex){
    list.remove(ex);
  }
  
  public void setExerciseList(ArrayList<Fitness> list){
    this.list = list;
  }
  
  public void setDay(int days){
    this.days = days;
  }
  public void setWeeklyCalorieTarget(double target){
    this.target = target;
  }
  public void setProfile(Profile profile){
    this.profile = profile;
  }
  
  public ArrayList<Fitness> getExerciseList(){
    return this.list;
  }
  public int getDays(){
    return this.days;
  }
  public Profile getProfile(){
    return this.profile;
  }
  public double getWeeklyCalorieTarget(){
    return this.target;
  }


  public ArrayList<DailyExercise> getWeeklyExercises(Intensity intensity){
    int arraySize = list.size();
    ArrayList<DailyExercise> test1 = new ArrayList<DailyExercise>();
    for (int i = 0 ; i<arraySize ; i++){
      test1.add((DailyExercise) list.get(i));
    }
    return test1;

  }
  public ArrayList<DailyExercise> getWeeklyExercises() {

    int arraySize = list.size();
    ArrayList<DailyExercise> test2 = new ArrayList<DailyExercise>(arraySize);
    return test2;
  }


  public String targetedCalorieLoss(double targetWeight, int withInDays) throws TargetWeightException {

    if(profile.getWeight() < targetWeight){
      throw new TargetWeightException("Only works to lose weight");
    }
    double weightDifference = profile.getWeight() - targetWeight;
    double kgtoKcal = 7000.0 * weightDifference;
    double dailyCal = kgtoKcal / withInDays;
    double beforeIntake = profile.dailyCalorieIntake();

    double afterIntake = beforeIntake - dailyCal;

    String output = "You need to lose "+ String.format("%.2f",dailyCal) + " calories per day or decrease your intake from " +
            String.format("%.2f",beforeIntake)+ " to " + String.format("%.2f",afterIntake) +
            " inorder to lose "+ String.format("%.2f",weightDifference) + " kg of weight";

  return output;
  }
}