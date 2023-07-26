package com.takeo.week2.day2;

public class TemperatureAnalyzer {
    public static int findMaxTemperature(int[] temperatures) {
        int max = temperatures[0];
        for (int temperature : temperatures) {
            if (temperature > max) {
                max = temperature;
            }
        }
        return max;
    }

    public static int findMinTemperature(int[] temperatures) {
        int min = temperatures[0];
        for (int temperature : temperatures) {
            if (temperature < min) {
                min = temperature;
            }
        }
        return min;
    }

    public static double findAverageTemperature(int[] temperatures) {
        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        return (double) sum / temperatures.length;
    }

    public static void main(String[] args) {
        int[] temperatureData = {25, 28, 22, 30, 26, 32};

        int maxTemp = findMaxTemperature(temperatureData);
        int minTemp = findMinTemperature(temperatureData);
        double avgTemp = findAverageTemperature(temperatureData);

        System.out.println("Maximum Temperature: " + maxTemp);
        System.out.println("Minimum Temperature: " + minTemp);
        System.out.println("Average Temperature: " + avgTemp);
    }
}
