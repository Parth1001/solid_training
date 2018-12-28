package excersice_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        encodeWithFiles ef = new encodeWithFiles();
        encodeWithDatabase ed = new encodeWithDatabase();
        ef.encode();
        ed.encode();
    }
}
