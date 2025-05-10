package semana05;

public class ConversorTemperatura {
    public static double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Crie métodos para converter temperaturas de Celsius para Fahrenheit e vice-versa?");
        System.out.println();

        double temperaturaCelsius = 0;
        double temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit");

        temperaturaFahrenheit = 32.0;
        temperaturaCelsius = fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius");
    }
}
