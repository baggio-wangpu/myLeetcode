import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GzipReader {

    public static void main(String[] args) throws IOException {

        final String gzipFile = "/Users/wpu/Downloads/pm/pm-history-20190228-060048.gz";
        // open the input (compressed) file.
        FileInputStream stream = new FileInputStream(gzipFile);
        FileOutputStream output = null;
        try {
            // open the gziped file to decompress.
            GZIPInputStream gzipstream = new GZIPInputStream(stream);
            byte[] buffer = new byte[2048];

            // create the output file without the .gz extension.
            String outname = gzipFile.substring(0, gzipFile.length() - 3) + ".xml";
            output = new FileOutputStream(outname);

            // and copy it to a new file
            int len;
            while ((len = gzipstream.read(buffer)) > 0) {
                output.write(buffer, 0, len);
            }
        } finally {
            // both streams must always be closed.
            if (output != null) output.close();
            stream.close();
        }
    }
}
