package school.coda.java.ecoconception.caching;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

public class Caching {


   public static float compute_ad_hoc_float(float angle) {
        float alpha = (float) (cos(angle) * sin(angle));
        float beta = (float) (cos(angle) * tan(angle));
        float gamma = (float) (tan(angle) * sin(angle));

        return alpha + beta + gamma;
    }

   public static Float compute_ad_hoc_Float(Double angle) {
        Float alpha =(float) (cos(angle) * sin(angle));
        Float beta = (float) (cos(angle) * tan(angle));
        Float gamma =(float) (tan(angle) * sin(angle));

        return alpha + beta + gamma;
    }

   public static float compute_ad_hoc_float_cast_at_end(double angle) {
        double alpha =  (cos(angle) * sin(angle));
        double beta =  (cos(angle) * tan(angle));
        double gamma =  (tan(angle) * sin(angle));

        return (float) (alpha + beta + gamma);
    }
   public static float compute_factored_cached_float(float angle) {
        double cos = cos(angle);
        double sin = sin(angle);
        double tan = tan(angle);

        float alpha = (float) (cos * sin);
        float beta = (float) (cos * tan);
        float gamma = (float) (tan * sin);

        return alpha + beta + gamma;
    }

   public static double compute_ad_hoc_double(double angle) {
        double alpha = cos(angle) * sin(angle);
        double beta = cos(angle) * tan(angle);
        double gamma = tan(angle) * sin(angle);

        return alpha + beta + gamma;
    }

    public static double compute_factored_cached_double(double angle) {
        double cos = cos(angle);
        double sin = sin(angle);
        double tan = tan(angle);

        double alpha = cos * sin;
        double beta = cos * tan;
        double gamma = tan * sin;

        return alpha + beta + gamma;
    }


   public static double compute_factored_cached_Double(Double angle) {
        Double cos = cos(angle);
        Double sin = sin(angle);
        Double tan = tan(angle);

        Double alpha = cos * sin;
        Double beta = cos * tan;
        Double gamma = tan * sin;

        return alpha + beta + gamma;
    }
}
