package com.accenture.URLDownload;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class URL_Download {
    public static void main(String[] args) {
        // Make sure that this directory exists
        String dirName = "C:\\Users\\n.a.jaiswal\\Downloads";
        try {
            saveFileFromUrlWithJavaIO(
                dirName + "\\DiPA Bot_IJP Corpus.xlsx", "https://ts.accenture.com/sites/DiPA/SitePages/Home.aspx?RootFolder=%2Fsites%2FDiPA%2FShared%20Documents%2FCorpusFilesfor_DiPA_SiQA&FolderCTID=0x012000A78BC5526949F74A922438913591F8FA&View=%7BA5607645-F285-4619-A2B3-B5BDF44B603E%7D#InplviewHash28738f04-91ff-483b-b322-1e96f1148299=Paged%3DTRUE-p_SortBehavior%3D0-p_Modified%3D20180615%252006%253a32%253a05-p_ID%3D1223-PageFirstRow%3D16");
            System.out.println("finished");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Using Java IO
    public static void saveFileFromUrlWithJavaIO(String fileName, String fileUrl)
    throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try { in = new BufferedInputStream(new URL(fileUrl).openStream());
            fout = new FileOutputStream(fileName);
            byte data[] = new byte[1024];
            int count;
            while ((count = in .read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if ( in != null)
                in .close();
            if (fout != null)
                fout.close();
        }
    }
    // Using Commons IO library
    // Available at http://commons.apache.org/io/download_io.cgi
    public static void saveFileFromUrlWithCommonsIO(String fileName,
        String fileUrl) throws MalformedURLException, IOException {
        FileUtils.copyURLToFile(new URL(fileUrl), new File(fileName));
    }
}
