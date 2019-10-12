/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Zac Allen
 */
public class HttpUrlConnection {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        System.out.println("Enter a URL: ");
        Scanner keyboard = new Scanner(System.in);
        String url = keyboard.nextLine();
        URL urlAddress = new URL(url);
        HttpURLConnection urlConnect = (HttpURLConnection) urlAddress.openConnection();
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(urlConnect.getHeaderFieldKey(i));
            System.out.println("");
        }
        
        try {
            InputStream inStream = new BufferedInputStream(urlConnect.getInputStream());
            reader(inStream);
        } catch(Exception e) {
            System.out.println("Data recieved from " + url);
        } finally {
            urlConnect.disconnect();
        }
    }
    
    private static void reader(InputStream inStream) {
        throw new UnsupportedOperationException("");
    }
}
