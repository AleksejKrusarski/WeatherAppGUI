import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //display our weather app GUI
                new WeatherAppGui().setVisible(true);
                //test example
                    //System.out.println(WeatherAppBackend.getLocationData("Tokyo"));
                    //System.out.println(WeatherAppBackend.getCurrentTime());
            }
        });
    }
}
