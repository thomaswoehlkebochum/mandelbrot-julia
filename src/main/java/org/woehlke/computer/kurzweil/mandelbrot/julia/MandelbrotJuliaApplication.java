package org.woehlke.computer.kurzweil.mandelbrot.julia;

import org.woehlke.computer.kurzweil.mandelbrot.julia.config.ComputerKurzweilProperties;
import org.woehlke.computer.kurzweil.mandelbrot.julia.view.MandelbrotJuliaFrame;

/**
 * Mandelbrot Set drawn by a Turing Machine.
 * (C) 2006 - 2022 Thomas Woehlke.
 * @author Thomas Woehlke
 *
 * @see MandelbrotJuliaFrame
 * @see ComputerKurzweilProperties
 *
 * @see <a href="https://thomas-woehlke.blogspot.com/2016/01/mandelbrot-set-drawn-by-turing-machine.html">Blog Article</a>
 * @see <a href="https://github.com/thomaswoehlkebochum/mandelbrot-julia">Github Repository</a>
 * @see <a href="https://java.woehlke.org/mandelbrot-julia/">Maven Project Repository</a>
 */
public class MandelbrotJuliaApplication {

    private MandelbrotJuliaApplication() {
        String conf = "application.yml";
        String jarPath = "target/mandelbrot-julia.jar";
        ComputerKurzweilProperties config = ComputerKurzweilProperties.propertiesFactory(conf,jarPath);
        MandelbrotJuliaFrame frame = new MandelbrotJuliaFrame(config);
        frame.start();
    }

    /**
     * Starting the Application.
     * @param args CLI Parameter
     */
    public static void main(String[] args) {
        MandelbrotJuliaApplication application = new MandelbrotJuliaApplication();
    }
}
