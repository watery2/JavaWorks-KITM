package com.kitm;

public class func {
    public static long toMilesPerHour(double kilometerPerHour)
    {
        if (kilometerPerHour < 0)
        {
            return -1;
        }

        return Math.round(kilometerPerHour / 1.609);
    }

    public static void printConversion(double kilometerPerHour)
    {

        long mi;

        if (kilometerPerHour >= 0)
        {
            mi = Math.round(kilometerPerHour / 1.609);

            System.out.println(kilometerPerHour + " km/h = " + mi + " mi/h");
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
}
