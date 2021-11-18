package lab6_1;
public class CannonBall
{
    private double initV; 
    private double simS; 
    private double simT; 
    public static final double g = 9.81;
   
    public CannonBall(int velocity)
    {
        initV = velocity;
    }
    public void simulatedFlight()
    {
        double deltaT = 0.01;
        double v = initV;
        double deltaS;
        int time = 0;
        int second = 1;
 
        while (v > 0)
            {
                deltaS = v * deltaT;
                v = v - (g*deltaT);
                simS = simS + deltaS;
                simT = simT + deltaT;
                time = time+1;
               
                if (time == 100)
                {
                    System.out.printf("Distance on %d sec: %.3f", second,simS );
                    System.out.println();
                    time = 0;
                    second += 1;    
                }
            }
    }
   
    public double calculusFlight(double t)//s(t) = -0.5*g*t2 + v0*t
    {
        double s = (-0.5)*g*Math.pow(t, 2) + initV*t;
        System.out.printf("Final distance: %.3f Total time: %.2f" , simS,simT );
        System.out.println();
        return Math.round(s*1000)/1000.000;
    }
   
    public double getSimulatedTime()
    {
        return simT;
    }
   
    public double getSimulatedDistance()
    {
        return simS;
    }
   
}