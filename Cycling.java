public class Cycling extends Aerobic implements Fitness {
    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Glutes,Muscle.Cardio,Muscle.Legs};
    }

    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double usedCalorie = 0;
        if (intensity == Intensity.HIGH) {
            usedCalorie = 14.0 * weight * duration;
            usedCalorie /= 60;
        } else if (intensity == Intensity.MEDIUM) {
            usedCalorie = 8.5 * weight * duration;
            usedCalorie /= 60;
        } else if (intensity == Intensity.LOW) {
            usedCalorie = 4.0 * weight * duration;
            usedCalorie /= 60;
        }

        return usedCalorie;
    }

    @Override
    public String description() {
        return "Cycling";
    }
}