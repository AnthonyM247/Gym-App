import java.util.ArrayList;

public class DailyExercise {
  
  private ArrayList<Fitness> list = new ArrayList<Fitness>();
  
  private int duration;
  private double target;
  private Profile profile;
  private Fitness fitness;

  public DailyExercise(ArrayList<Fitness> exerciseList, int duration, double calorieTarget, Profile profile){
    this.list = exerciseList;
    this.duration = duration;
    this.target = calorieTarget;
    this.profile = profile;
  }
  
  public DailyExercise(ArrayList<Fitness> exerciseList, Profile profile){
    this.list = exerciseList;
    this.duration = 60;
    this.target = 500;
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
  
  public void setDuration(int duration){
    this.duration = duration;
  }
  
  public void setCalorieTarget(double target){
    this.target = target;
  }
  public void setProfile(Profile profile){
    this.profile = profile;
  }
  
  public ArrayList<Fitness> getExerciseList(){
    return this.list;
  }
  
  public int getDuration(){
    return this.duration;
  }
  
  public double getCalorieTarget(){
    return this.target;
  }
  
  public Profile getProfile(){
    return this.profile;
  }


  public Fitness[] getExercises(Muscle[] targetMuscle){

    Fitness [] hasTargetMuscle =  new Fitness[10];
    boolean hasMuscle = false;
    int counter = 0;
    
    for (int i =0; i < list.size();  i++){
      
      for (int j = 0; j < targetMuscle.length; j++){
        for(int k = 0; k < list.get(i).muscleTargeted().length; k++) {

          if (targetMuscle[j] == list.get(i).muscleTargeted()[k]) {
            hasMuscle = true;
            break;
          }
          else{
            hasMuscle = false;
          }

        }
        if (hasMuscle == false){
          break;
        }
      }
      if (hasMuscle == true){
        hasTargetMuscle[counter] = list.get(i);
        counter ++;
      }
 
    }
    

    Fitness [] DailyExercise;
    if (counter == 0){
      DailyExercise = null;

    }
    else{
      DailyExercise = new Fitness[counter];
        
      for (int i = 0; i < DailyExercise.length; i++){
        DailyExercise[i] = hasTargetMuscle[i];
      }
    }

    return DailyExercise;
  
}
  public Fitness[] getAllExercises(Muscle[] targetMuscle){

    Fitness [] hasTargetMuscle =  new Fitness[8];// creating a temporary array of size 8
    boolean hasMuscle = false;
    int counter = 0;

    for (int i =0; i < list.size();  i++){

      for (int j = 0; j < targetMuscle.length; j++){
        for(int k = 0; k < list.get(i).muscleTargeted().length; k++) {

          if (targetMuscle[j] == list.get(i).muscleTargeted()[k]) {
            hasMuscle = true;
            break;
          }
          else{
            hasMuscle = false;
          }

        }
        if (hasMuscle == true){
          break;
        }
      }
      if (hasMuscle == true){
        hasTargetMuscle[counter] = list.get(i);
        counter ++;
      }

    }



    Fitness [] DailyExcercise;
    if (counter == 0){
      DailyExcercise = null;

    }
    else{
      DailyExcercise = new Fitness[counter];

      for (int i = 0; i < DailyExcercise.length; i++){
        DailyExcercise[i] = hasTargetMuscle[i];
      }
    }

    return DailyExcercise;


  }
}