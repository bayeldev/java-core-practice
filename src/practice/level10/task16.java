package practice.level10;

import java.util.concurrent.Callable;

public class task16 {
    public static void main(String[] args) {
        CelestialBody plan = CelestialBody.MARS;
        System.out.println(plan.name());
        System.out.println(plan.ordinal());

        String incoming = "JUPITER";
        CelestialBody newPlan = CelestialBody.valueOf(incoming);
        System.out.println(newPlan);

    }

    enum CelestialBody {
        EARTH, MARS, JUPITER
    }
}
