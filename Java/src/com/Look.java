package com;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Look implements Runnable {
    URL url;

    public void setURL(URL url) {
        this.url = url;
    }

    @Override
    public void run() {
        try {
            InputStream in = url.openStream();
            byte[] b = new byte[10240];
            int n = -1;
            while ((n = in.read(b)) != -1) {
                String str = new String(b, 0, n);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
