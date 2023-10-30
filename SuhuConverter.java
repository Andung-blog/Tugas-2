/**
 * SuhuConverter digunakan untuk mengkonversi suhu dari celcius ke reamur, fahrenheit, kelvin
 */
public class SuhuConverter {
    /**
     *
     * @param celsius nilai suhu celcius
     * @return nilai suhunya bernilai fahrenheit
     */
    public static double celsiusKeFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusKeKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double celsiusKeReamur(double celsius) {
        return celsius * 4 / 5;
    }
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = celsiusKeFahrenheit(celsius);
        double kelvin = celsiusKeKelvin(celsius);
        double reamur = celsiusKeReamur(celsius);

        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        System.out.println(celsius + " Celsius = " + kelvin + " Kelvin");
        System.out.println(celsius + " Celsius = " + reamur + " Reamur");

    }
}
