import org.example.ReverseFile;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static org.mockito.Mockito.*;

public class ReverseFileTest {
    @Test
    public void testReverseFileContent() throws IOException {
        // Mock BufferedReader to simulate file input
        BufferedReader mockReader = mock(BufferedReader.class);
        when(mockReader.readLine()).thenReturn("Hello, World!", "reverse in Java", null); // Simulating file lines

        // Mock PrintWriter to capture output
        BufferedWriter mockWriter = mock(BufferedWriter.class);

        // Call the method under test
        ReverseFile.reverseFileContent(mockReader, mockWriter);
        mockWriter.flush();
        // Verify expected reversed lines were written
        verify(mockWriter).write("avaJ ni DDT"); // Reversed second line
        verify(mockWriter).write("!dlroW ,olleH"); // Reversed first line

    }


}
