import webp.WebpConversionSettings;
import webp.WebpMetadata;
import webp.WebpNativeLibHelper;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(WebpNativeLibHelper.getLibLocation().getAbsolutePath());
        WebpNativeLibHelper.loadNativeLibraryIfNeeded();
        new WebpMetadata();
        WebpConvertHelper.convert(new File(System.getProperty("user.dir") + "/img/ic_home_dislike_big.png"), new WebpConversionSettings());
    }
}
