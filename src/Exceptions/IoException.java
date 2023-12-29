package Exceptions;

import java.io.IOException;

public class IoException {
    public static void main(String[] args) throws IOException {
        throw new IOException("This is an IOException.");
    }
}

