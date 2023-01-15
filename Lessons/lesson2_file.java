package Lessons;

import java.io.IOException;
import java.util.logging.*;

public class lesson2_file {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(lesson2_file.class.getName());
        logger.setLevel(Level.INFO);
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml"); 
        //logger.addHandler(ch);
        logger.addHandler(fh);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        fh.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }
 
}
