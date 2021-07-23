public class Yoga extends Flexibility {

    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Triceps,Muscle.Biceps};
    }

    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double usedCalorie = 0;
        if (intensity == Intensity.HIGH) {
            usedCalorie = 4.0 * weight * duration;
            usedCalorie /= 60;
        } else if (intensity == Intensity.MEDIUM) {
            usedCalorie = 3.0 * weight * duration;
            usedCalorie /= 60;
        } else if (intensity == Intensity.LOW) {
            usedCalorie = 2.0 * weight * duration;
            usedCalorie /= 60;
        }

        return usedCalorie;
    }

    @Override
    public String description() {
        return "Yoga";
    }

}
