public class WeightLifting extends Anaerobic{
    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Shoulders,Muscle.Legs,Muscle.Arms,Muscle.Triceps};
    }

    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double usedCalorie = 0;
        if (intensity == Intensity.HIGH) {
            usedCalorie = 6.0 * weight * duration;
            usedCalorie /= 60;
        } else if (intensity == Intensity.MEDIUM) {
            usedCalorie = 5.0 * weight * duration;
            usedCalorie /= 60;
        } else if (intensity == Intensity.LOW) {
            usedCalorie = 3.5 * weight * duration;
            usedCalorie /= 60;
        }

        return usedCalorie;
    }

    @Override
    public String description() {
        return "WeightLifting";
    }
}
