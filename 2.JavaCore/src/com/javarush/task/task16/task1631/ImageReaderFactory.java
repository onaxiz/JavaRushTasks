package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;
import com.sun.javafx.iio.ImageStorage;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imgType){
        if (imgType == ImageTypes.JPG) return new JpgReader();
        else if (imgType == ImageTypes.BMP) return new BmpReader();
        else if (imgType == ImageTypes.PNG) return new PngReader();
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
