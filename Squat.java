public class Squat extends Endurance{
    @Override
    public Muscle[] muscleTargeted() {
        return new Muscle[]{Muscle.Glutes,Muscle.Abs,Muscle.Back};
    }

    @Override
    public double calorieLoss(Intensity intensity, double weight, int duration) {
        double usedCalorie = 0;
        if (intensity == Intensity.HIGH) {
            usedCalorie = 7.0 * weight * duration;
            usedCalorie /= 60;
        } else if (intensity == Intensity.MEDIUM) {
            usedCalorie = 5.0 * weight * duration;
            usedCalorie /= 60;
        } else if (intensity == Intensity.LOW) {
            usedCalorie = 2.5 * weight * duration;
            usedCalorie /= 60;
        }

        return usedCalorie;
    }

    @Override
    public String description() {
        return "Squat";
    }
}
